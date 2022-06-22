/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api;

import static com.github.tomakehurst.wiremock.client.WireMock.reset;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.mockserver.integration.ClientAndServer.startClientAndServer;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import datadog.trace.api.DDTags;
import datadog.trace.api.interceptor.MutableSpan;
import io.opentracing.Span;
import io.opentracing.util.GlobalTracer;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Security;
import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BooleanSupplier;
import javax.net.ssl.HttpsURLConnection;
import org.apache.commons.io.IOUtils;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.logging.MockServerLogger;
import org.mockserver.matchers.TimeToLive;
import org.mockserver.matchers.Times;
import org.mockserver.mock.Expectation;
import org.mockserver.model.Header;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.LogEventRequestAndResponse;
import org.mockserver.model.Parameter;
import org.mockserver.socket.tls.KeyStoreFactory;

public class TestUtils {

  public static int SUREFIRE_FORK = Integer.parseInt(System.getProperty("surefireForkNumber"));
  public static String MOCKSERVER_HOST = "localhost";
  public static int MOCKSERVER_PORT = 9090 + SUREFIRE_FORK;

  public static void retry(int interval, int count, BooleanSupplier call) throws RetryException {
    for (int i = 0; i <= count; i++) {
      try {
        if (call.getAsBoolean()) {
          return;
        }
      } catch (AssertionError e) {
        if (i == count) {
          throw e;
        }
      }
      if (!getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
        try {
          Thread.sleep(interval * 1000);
        } catch (InterruptedException e) {
          return;
        }
      }
    }
    throw new RetryException(
        String.format("Retry error: failed to satisfy the condition after %d times", count));
  }

  public static String getFixture(String path) throws IOException {
    return IOUtils.toString(TestUtils.class.getResourceAsStream(path), "UTF-8");
  }

  public static RecordingMode getRecordingMode() {
    String envRecording = System.getenv("RECORD");
    RecordingMode rm = RecordingMode.MODE_REPLAYING;
    if (envRecording != null) {
      if (envRecording.equals(RecordingMode.MODE_IGNORE.value)) {
        rm = RecordingMode.MODE_IGNORE;
      } else if (envRecording.equals(RecordingMode.MODE_RECORDING.value)) {
        rm = RecordingMode.MODE_RECORDING;
      }
    }
    return rm;
  }

  public static class RetryException extends Exception {
    public RetryException(String message) {
      super(message);
    }
  }

  public static class MockServerProxyConnectionFactory
      implements HttpUrlConnectorProvider.ConnectionFactory {
    @Override
    public HttpURLConnection getConnection(URL url) throws IOException {
      return (HttpURLConnection)
          url.openConnection(
              new Proxy(Proxy.Type.HTTP, new InetSocketAddress(MOCKSERVER_HOST, MOCKSERVER_PORT)));
    }
  }

  public abstract static class APITest {
    protected static final String TEST_API_KEY_NAME = "DD_TEST_CLIENT_API_KEY";
    protected static final String TEST_APP_KEY_NAME = "DD_TEST_CLIENT_APP_KEY";

    protected static String cassettesDir = "src/test/resources/cassettes";
    protected static String version = "v1";

    protected static String TEST_API_KEY;
    protected static String TEST_APP_KEY;
    protected static int WIREMOCK_PORT = 8080 + SUREFIRE_FORK;
    // We need to make the tag be something that is then searchable in monitors
    // https://docs.datadoghq.com/tracing/guide/metrics_namespace/#errors
    // "version" is really the only one we can use here
    protected static final String TRACING_TAG_ENDPOINT = "version";
    protected static final String TRACING_SPAN_TYPE = "test";

    @Rule
    // WireMock is only used for unit tests, for cassette based tests, we use mockServer
    public WireMockRule wireMockRule = new WireMockRule(options().port(WIREMOCK_PORT));

    @Rule public TestName name = new TestName();
    public static ClientAndServer mockServer;
    protected Clock clock;
    protected OffsetDateTime now;

    public abstract String getTracingEndpoint();

    private static void setupMockServer() {
      if (getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
        return;
      }
      if (getRecordingMode().equals(RecordingMode.MODE_RECORDING)) {
        // Mockserver uses a connection pool with keepAlive connections to talk to the API.
        // It seems that there are circumstances under which a reused connection freezes
        // forever. We temporarily workaround this by making all connections closing
        // instead of keepAlive, until we figure out where the problem really is.
        System.setProperty("http.keepAlive", "false");
        mockServer = startClientAndServer(MOCKSERVER_PORT);
      }
    }

    static {
      // to have mockserver initialized only once before running all tests, we use
      // a static block - we put all cassettes into one huge file and create mockserver
      // instance using that file (when replaying)
      setupMockServer();
    }

    public String getQualifiedTestcaseName() {
      return getClass().getSimpleName() + "." + name.getMethodName();
    }

    public String getCassetteName() {
      return getQualifiedTestcaseName() + ".json";
    }

    public String getFreezefileName() {
      return getQualifiedTestcaseName() + ".freeze";
    }

    @BeforeClass
    public static void trustProxyCerts() {
      trustProxyCertsStatic();
    }

    public static void trustProxyCertsStatic() {
      if (getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
        return;
      }
      // Needed otherwise the Trust store does not have the correct type for java > 8.
      // See https://github.com/mock-server/mockserver/issues/744
      Security.setProperty("keystore.type", "jks");
      // Trust MockServers proxy certificates
      HttpsURLConnection.setDefaultSSLSocketFactory(
          new KeyStoreFactory(new MockServerLogger()).sslContext().getSocketFactory());
    }

    @BeforeClass
    public static void getSecretsFromEnv() {
      if (getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) return;

      HashMap<String, String> secrets = new HashMap<String, String>();

      // Get API key
      TEST_API_KEY = System.getenv(TEST_API_KEY_NAME);
      if (TEST_API_KEY == null) {
        System.err.printf("%s not set, exiting", TEST_API_KEY_NAME);
        System.exit(1);
      }

      // Get application key
      TEST_APP_KEY = System.getenv(TEST_APP_KEY_NAME);
      if (TEST_APP_KEY == null) {
        System.err.printf("%s not set, exiting", TEST_APP_KEY_NAME);
        System.exit(1);
      }
    }

    @Before
    public void setupClock() throws IOException {
      if (getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
        clock = Clock.systemUTC();
        now = OffsetDateTime.now();
        return;
      }
      // Use a fixed time in tests to allow replaying from cassettes
      if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
        // When recording, set the clock to the current time and save it to a `freeze` file for
        // replaying
        clock = Clock.fixed(Instant.now(), ZoneOffset.UTC);
        now = OffsetDateTime.ofInstant(Instant.now(clock), ZoneOffset.UTC);
        Files.write(
            Paths.get(APITest.cassettesDir, version, getFreezefileName()),
            now.toString().getBytes());
      } else {
        // When replaying, read the time in the `freeze` file, and set the clock to that time, or
        // current time if file not found
        Path freezeFile = Paths.get(APITest.cassettesDir, version, getFreezefileName());
        try {
          List<String> lines = Files.readAllLines(freezeFile);
          clock = Clock.fixed(Instant.parse(lines.get(0)), ZoneOffset.UTC);
        } catch (NoSuchFileException e) {
          System.err.println(
              "Could not find file " + freezeFile + ", initializing clock using current time");
          clock = Clock.fixed(Instant.now(), ZoneOffset.UTC);
        }
        now = OffsetDateTime.ofInstant(Instant.now(clock), ZoneOffset.UTC);
      }
    }

    @Before
    public void setTracingTags() {
      final Span span = GlobalTracer.get().activeSpan();
      if (span != null) {
        // if the agent container is not running, span is null
        MutableSpan localRootSpan = ((MutableSpan) span).getLocalRootSpan();
        localRootSpan.setTag(TRACING_TAG_ENDPOINT, getTracingEndpoint());
        localRootSpan.setOperationName(TRACING_SPAN_TYPE);
        localRootSpan.setSpanType(TRACING_SPAN_TYPE);
        localRootSpan.setTag(DDTags.SPAN_TYPE, TRACING_SPAN_TYPE);
      }
    }

    @After
    public void cleanAndSendExpectations() throws IOException {
      // Cleanup the recorded requests from sensitive information (API keys in headers and query
      // params),
      // create the associated expectations and save them to disk in the `cassettes/**/*.json` files
      if (!getRecordingMode().equals(RecordingMode.MODE_RECORDING)) {
        return;
      }
      List<Expectation> expectations = new ArrayList<>();
      LogEventRequestAndResponse[] requestsAndResponses =
          mockServer.retrieveRecordedRequestsAndResponses(null);
      for (LogEventRequestAndResponse requestAndResponse : requestsAndResponses) {
        HttpRequest req = requestAndResponse.getHttpRequest();
        List<Parameter> params = req.getQueryStringParameterList();
        List<Parameter> cleanParams = new ArrayList<>();
        List<Header> headers = req.getHeaderList();
        List<Header> cleanHeaders = new ArrayList<>();
        for (Header header : headers) {
          if (!header.getName().equals("DD-API-KEY")
              && !header.getName().equals("DD-APPLICATION-KEY")
              && !header.getName().equals("Host")
              && !header.getName().equals("x-datadog-trace-id")
              && !header.getName().equals("x-datadog-parent-id")
              && !header.getName().equals("x-datadog-sampling-priority")
              && !header.getName().equals("User-Agent")
              && !header.getName().equals("Connection")
              && !header.getName().equals("Content-Length")) cleanHeaders.add(header);
        }
        for (Parameter param : params) {
          if (!param.getName().equals("api_key") && !param.getName().equals("application_key"))
            cleanParams.add(param);
        }
        req.withHeaders(cleanHeaders);
        req.withQueryStringParameters(cleanParams);
        expectations.add(
            Expectation.when(req, Times.once(), TimeToLive.unlimited())
                .thenRespond(requestAndResponse.getHttpResponse()));
      }

      // write the cassette
      File cassette =
          new File(Paths.get(APITest.cassettesDir, version, getCassetteName()).toString());
      cassette.getParentFile().mkdirs();
      if (!cassette.exists()) {
        cassette.createNewFile();
      }
      PrintWriter w = new PrintWriter(cassette.getPath());
      w.print(expectations.toString());
      w.close();
      mockServer.reset();
    }

    @After
    public void resetWiremock() {
      reset();
    }

    /**
     * Returns a unique string that can be used as a title/description/summary/... of an API entity.
     * When used in Azure Pipelines and RECORD=true or RECORD=none, it will include BuildId to
     * enable mapping resources that weren't deleted to builds.
     *
     * @return unique entity name to use in tests
     */
    public String getUniqueEntityName() {
      String buildId = System.getenv("BUILD_BUILDID");
      if (buildId == null
          || !System.getenv("CI").equals("true")
          || getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
        buildId = "local";
      }

      // NOTE: some endpoints have limits on certain fields (e.g. Roles V2 names can only be 55
      // chars long),
      // so we need to keep this short
      String result =
          String.format("java-%s-%s-%d", name.getMethodName(), buildId, now.toEpochSecond());
      // In case this is used in URL, make sure we replace potential slash
      return result;
    }

    /**
     * Same as getUniqueEntityName, except it crops the returned result to a given length if it's
     * longer.
     *
     * @return unique entity name to use in tests with maximum `maxLen` characters
     */
    public String getUniqueEntityName(int maxLen) {
      String result = getUniqueEntityName();
      if (result.length() > maxLen) {
        result = result.substring(0, maxLen);
      }
      return result;
    }

    /*
     * Same as getUniqueEntityName, except it attaches the given suffix to the end of the unique string.
     *
     * @return unique entity name to use in tests with a given suffix attached
     */
    public String getUniqueEntityName(String suffix) {
      return String.format("%s-%s", getUniqueEntityName(), suffix);
    }
  }
}
