package com.datadog.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.Scenario;
import java.io.BufferedReader;
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

/** Adapter for language-neutral BDD request plans and recording sessions. */
public final class TestRunner {
  private static final String CONTROL_ROOT = "/__openapi_transformer__";
  private static final String TEMPLATE_KEY = "$openapi_transformer_template";
  private static final ObjectMapper MAPPER = new ObjectMapper();

  private TestRunner() {}

  public static boolean runnerEnabled() {
    return System.getenv("DD_TEST_RUNNER_DATA") != null;
  }

  public static boolean serverEnabled() {
    return System.getenv("DD_TEST_SERVER_URL") != null;
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
    Map<String, Object> result =
        controlRequest("/sessions/" + world.testServerSession + "/stop", null);
    world.testServerSession = null;
    if (Boolean.FALSE.equals(result.get("complete"))) {
      throw new IllegalStateException(
          String.format(
              "Test server session consumed %s of %s interactions",
              result.get("interactions"), result.get("total_interactions")));
    }
  }

  public static void markMainComplete(World world) throws Exception {
    if (!serverEnabled() || world.testServerSession == null) {
      return;
    }
    controlRequest("/sessions/" + world.testServerSession + "/main-complete", null);
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

    world.setupAPI(
        world.getVersion(), World.toClassName(plan.get("api").toString().replace("-", "")));
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
    for (Map<String, Object> item : (List<Map<String, Object>>) manifest.get("scenarios")) {
      if (item.get("version").equals(world.getVersion())
          && item.get("scenario").equals(scenario.getName())
          && uri.endsWith(item.get("feature_file").toString())) {
        return item;
      }
    }
    return null;
  }

  private static Path runnerRoot() {
    return Paths.get(System.getenv("DD_TEST_RUNNER_DATA")).toAbsolutePath();
  }

  private static Map<String, Object> readMap(Path path) throws Exception {
    return MAPPER.readValue(Files.readAllBytes(path), new TypeReference<Map<String, Object>>() {});
  }

  private static Map<String, Object> controlRequest(String endpoint, Map<String, Object> payload)
      throws Exception {
    URL url = new URL(System.getenv("DD_TEST_SERVER_URL") + CONTROL_ROOT + endpoint);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("POST");
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
