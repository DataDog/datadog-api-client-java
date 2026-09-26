package com.datadog.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.Scenario;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/** Adapter for language-neutral BDD request plans and recording sessions. */
public final class TestRunner {
  private static final String CONTROL_ROOT = "/__openapi_transformer__";
  private static final String TEMPLATE_KEY = "$openapi_transformer_template";
  private static final ObjectMapper MAPPER = new ObjectMapper();
  private static final Path GENERATED_TEST_ROOT =
      Paths.get("src/test/resources/generated-test").toAbsolutePath();
  private static final Path GENERATED_TEST_SERVER = GENERATED_TEST_ROOT.resolve("test-server");
  private static final String GENERATED_TEST_PORT =
      System.getenv().getOrDefault("DD_TEST_SERVER_PORT", "18084");
  private static final String GENERATED_TEST_SERVER_URL = "http://127.0.0.1:" + GENERATED_TEST_PORT;
  private static Process serverProcess;

  private TestRunner() {}

  private static boolean generatedTestsEnabled() {
    return "true".equalsIgnoreCase(System.getenv().getOrDefault("DD_USE_GENERATED_TESTS", "false"));
  }

  public static boolean runnerEnabled() {
    return generatedTestsEnabled()
        && "false".equals(System.getenv().getOrDefault("RECORD", "false"))
        && Files.isRegularFile(runnerRoot().resolve("manifest.json"));
  }

  public static boolean serverEnabled() {
    return generatedTestsEnabled()
        && (System.getenv("DD_TEST_SERVER_URL") != null || runnerEnabled());
  }

  public static String serverUrl() {
    return System.getenv().getOrDefault("DD_TEST_SERVER_URL", GENERATED_TEST_SERVER_URL);
  }

  public static void startServer() throws Exception {
    if (!runnerEnabled() || System.getenv("DD_TEST_SERVER_URL") != null || serverProcess != null) {
      return;
    }
    File log =
        new File(
            System.getenv()
                .getOrDefault(
                    "DD_TEST_SERVER_LOG",
                    System.getProperty("java.io.tmpdir") + "/datadog-java-test-server.log"));
    serverProcess =
        new ProcessBuilder(GENERATED_TEST_SERVER.toString(), "--port", GENERATED_TEST_PORT)
            .redirectOutput(log)
            .redirectError(log)
            .start();

    URL health = new URL(serverUrl() + CONTROL_ROOT + "/health");
    for (int attempt = 0; attempt < 50; attempt++) {
      try {
        HttpURLConnection connection = (HttpURLConnection) health.openConnection();
        connection.setRequestProperty("Connection", "close");
        int status = connection.getResponseCode();
        connection.disconnect();
        if (status >= 200 && status < 300) {
          return;
        }
      } catch (java.net.ConnectException ignored) {
        // The generated server is still starting.
      }
      if (!serverProcess.isAlive()) {
        throw new IllegalStateException("Generated test server exited early; see " + log);
      }
      Thread.sleep(100);
    }
    stopServer();
    throw new IllegalStateException("Generated test server failed to start; see " + log);
  }

  public static void stopServer() throws Exception {
    if (serverProcess == null) {
      return;
    }
    serverProcess.destroy();
    if (!serverProcess.waitFor(5, TimeUnit.SECONDS)) {
      serverProcess.destroyForcibly();
      serverProcess.waitFor();
    }
    serverProcess = null;
  }

  public static void startSession(World world, Scenario scenario) throws Exception {
    Map<String, Object> item = findManifestItem(world, scenario);
    if (item == null) {
      Instant now = Instant.now();
      world.clock = Clock.fixed(now, ZoneOffset.UTC);
      world.now = OffsetDateTime.ofInstant(now, ZoneOffset.UTC);
      return;
    }
    world.testRunnerPlan = readMap(runnerRoot().resolve(item.get("file").toString()));
    world.testFeature = item.get("feature").toString();

    Map<String, Object> payload = new LinkedHashMap<>();
    payload.put("version", world.getVersion());
    payload.put("feature", world.testFeature);
    payload.put("scenario", scenario.getName());
    Map<String, Object> session = controlRequest("/sessions", payload);
    world.testServerSession = session.get("session").toString();
    Instant frozen = Instant.parse(session.get("frozen_at").toString());
    world.clock = Clock.fixed(frozen, ZoneOffset.UTC);
    world.now = OffsetDateTime.ofInstant(frozen, ZoneOffset.UTC);
  }

  public static void stopSession(World world) throws Exception {
    if (world.testServerSession == null) {
      return;
    }
    controlRequest("/sessions/" + world.testServerSession + "/stop", null);
    world.testServerSession = null;
  }

  public static void applyPlan(World world, boolean pagination) throws Exception {
    if (!runnerEnabled()) {
      return;
    }
    if (world.testRunnerPlan == null) {
      return;
    }
    Map<String, Object> plan = world.testRunnerPlan;
    Map<String, Object> request = (Map<String, Object>) plan.get("request");
    if (!Boolean.valueOf(pagination).equals(request.get("pagination"))) {
      throw new IllegalStateException("Generated request plan pagination mismatch");
    }

    if (plan.get("operation_version") != null) {
      world.setOperationVersion(plan.get("operation_version").toString());
    }

    world.setupAPI(
        world.getOperationVersion(),
        World.toClassName(plan.get("api").toString().replace("-", "")));
    world.newRequest(plan.get("operation_id").toString());

    List<Map<String, Object>> parameters = (List<Map<String, Object>>) request.get("parameters");
    for (Map<String, Object> parameter : parameters) {
      if ("path".equals(parameter.get("in")) || Boolean.TRUE.equals(parameter.get("required"))) {
        applyParameter(world, parameter);
      }
    }

    Map<String, Object> body = (Map<String, Object>) request.get("body");
    if (body != null) {
      Object value = materialize(body.get("value"), world);
      world.addMaterializedRequestParameter("body", MAPPER.writeValueAsString(value));
    }
    for (Map<String, Object> parameter : parameters) {
      if (!"path".equals(parameter.get("in")) && !Boolean.TRUE.equals(parameter.get("required"))) {
        applyParameter(world, parameter);
      }
    }
  }

  private static void applyParameter(World world, Map<String, Object> parameter) throws Exception {
    Map<String, Object> source = (Map<String, Object>) parameter.get("source");
    if ("fixture".equals(source.get("type"))) {
      world.addRequestParameterFixture(
          parameter.get("name").toString(), source.get("path").toString());
    } else {
      Object value = materialize(source.get("value"), world);
      world.addMaterializedRequestParameter(
          parameter.get("name").toString(), MAPPER.writeValueAsString(value));
    }
  }

  private static Object materialize(Object value, World world) throws Exception {
    if (value instanceof Map) {
      Map<String, Object> map = (Map<String, Object>) value;
      if (map.size() == 1 && map.containsKey(TEMPLATE_KEY)) {
        String rendered = World.templated(map.get(TEMPLATE_KEY).toString(), world.context);
        return MAPPER.readValue(rendered, Object.class);
      }
      Map<String, Object> result = new LinkedHashMap<>();
      for (Map.Entry<String, Object> entry : map.entrySet()) {
        result.put(entry.getKey(), materialize(entry.getValue(), world));
      }
      return result;
    }
    if (value instanceof List) {
      List<Object> result = new ArrayList<>();
      for (Object item : (List<?>) value) {
        result.add(materialize(item, world));
      }
      return result;
    }
    if (value instanceof String) {
      String source = value.toString();
      java.util.regex.Matcher literal =
          java.util.regex.Pattern.compile("^\\{\\{\\s*(['\"])(.*)\\1\\s*}}$").matcher(source);
      if (literal.matches()) {
        return literal.group(2);
      }
      return World.templated(source, world.context);
    }
    return value;
  }

  private static Map<String, Object> findManifestItem(World world, Scenario scenario)
      throws Exception {
    Map<String, Object> manifest = readMap(runnerRoot().resolve("manifest.json"));
    String uri = scenario.getUri().toString().replace('\\', '/');
    String featureFile = Paths.get(uri).getFileName().toString();
    for (Map<String, Object> item : (List<Map<String, Object>>) manifest.get("scenarios")) {
      if (item.get("version").equals(world.getVersion())
          && item.get("scenario").equals(scenario.getName())
          && featureFile.equals(
              Paths.get(item.get("feature_file").toString()).getFileName().toString())) {
        return item;
      }
    }
    return null;
  }

  private static Path runnerRoot() {
    String configured = System.getenv("DD_TEST_RUNNER_DATA");
    return configured == null
        ? GENERATED_TEST_ROOT.resolve("test-runner-data")
        : Paths.get(configured).toAbsolutePath();
  }

  public static Path featureDataPath(String apiVersion, String filename) {
    return Paths.get("src/test/resources/com/datadog/api/client")
        .resolve(apiVersion)
        .resolve("api")
        .resolve(filename);
  }

  private static Map<String, Object> readMap(Path path) throws Exception {
    return MAPPER.readValue(Files.readAllBytes(path), new TypeReference<Map<String, Object>>() {});
  }

  private static Map<String, Object> controlRequest(String endpoint, Map<String, Object> payload)
      throws Exception {
    URL url = new URL(serverUrl() + CONTROL_ROOT + endpoint);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("POST");
    connection.setRequestProperty("Connection", "close");
    if (payload != null) {
      byte[] body = MAPPER.writeValueAsBytes(payload);
      connection.setDoOutput(true);
      connection.setRequestProperty("content-type", "application/json");
      try (OutputStream output = connection.getOutputStream()) {
        output.write(body);
      }
    }
    int status = connection.getResponseCode();
    InputStream stream =
        status >= HttpURLConnection.HTTP_BAD_REQUEST
            ? connection.getErrorStream()
            : connection.getInputStream();
    StringBuilder response = new StringBuilder();
    try (BufferedReader reader =
        new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
      String line;
      while ((line = reader.readLine()) != null) {
        response.append(line);
      }
    } finally {
      connection.disconnect();
    }
    if (status >= HttpURLConnection.HTTP_BAD_REQUEST) {
      throw new IllegalStateException(
          String.format("Test server POST %s failed (%d): %s", endpoint, status, response));
    }
    return MAPPER.readValue(response.toString(), new TypeReference<Map<String, Object>>() {});
  }
}
