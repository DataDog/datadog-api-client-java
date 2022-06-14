package com.datadog.api;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.When;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import org.junit.AssumptionViolatedException;
import org.junit.rules.TestName;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.matchers.TimeToLive;
import org.mockserver.matchers.Times;
import org.mockserver.mock.Expectation;
import org.mockserver.model.Header;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.LogEventRequestAndResponse;
import org.mockserver.model.Parameter;

public class RecorderSteps {

  protected static String cassettesDir = TestUtils.APITest.cassettesDir + "/features";

  // Use the statically initialized mockServer
  public static ClientAndServer mockServer = TestUtils.APITest.mockServer;
  public TestName name = new TestName();

  private World world;

  public RecorderSteps(World world) {
    this.world = world;
  }

  public static String getUrl() {
    return "https://" + TestUtils.MOCKSERVER_HOST + ":" + TestUtils.MOCKSERVER_PORT;
  }

  @Before(value = "@integration-only", order = 0)
  public void skipIntegrationOnly() {
    if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
      // skip integration only tests
      throw new AssumptionViolatedException("Not supported with cassettes");
    }
  }

  @Before(value = "@replay-only", order = 0)
  public void skipReplayOnly() {
    if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
      // don't record replay-only tests
      throw new AssumptionViolatedException("Only supported in replay mode");
    }
  }

  @Before(order = 1)
  public void setupClock(Scenario scenario) throws java.io.IOException {
    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)
        || scenario.getSourceTagNames().contains("@integration-only")) {
      world.now = OffsetDateTime.now();
      return;
    }

    Path freezeFile = Paths.get(cassettesDir, world.getVersion(), world.getName() + ".freeze");
    // Use a fixed time in tests to allow replaying from cassettes
    if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
      world.clock = Clock.fixed(Instant.now(), ZoneOffset.UTC);
      world.now = OffsetDateTime.ofInstant(Instant.now(world.clock), ZoneOffset.UTC);

      if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_RECORDING)) {
        // When recording, set the clock to the current time and save it to a `freeze`
        // file for replaying
        freezeFile.toFile().getParentFile().mkdirs();
        Files.write(freezeFile, world.now.toString().getBytes());
      }
    } else {
      // When replaying, read the time in the `freeze` file, and set the clock to that
      // time, or current time if file not found
      try {
        List<String> lines = Files.readAllLines(freezeFile);
        world.clock = Clock.fixed(Instant.parse(lines.get(0)), ZoneOffset.UTC);
      } catch (NoSuchFileException e) {
        world.clock = Clock.fixed(Instant.now(), ZoneOffset.UTC);
        throw new IOException(
            "Time file '"
                + freezeFile
                + "' not found: create one setting `RECORD=true` or ignore it using `RECORD=none`");
      }
      world.now = OffsetDateTime.ofInstant(Instant.now(world.clock), ZoneOffset.UTC);
    }

    if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_REPLAYING)) {
      File cassette =
          new File(Paths.get(cassettesDir, world.getVersion(), getCassetteName()).toString());

      if (!cassette.exists()) {
        throw new IOException(
            "Cassette '"
                + cassette.getPath()
                + "' not found: create one setting `RECORD=true` or ignore it using `RECORD=none`");
      }
    }
  }

  @After
  public void cleanAndSendExpectations(Scenario scenario) throws IOException {
    // Cleanup the recorded requests from sensitive information (API keys in headers and query
    // params),
    // create the associated expectations and save them to disk in the `cassettes/**/*.json` files
    if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_RECORDING)
        || scenario.getStatus() == Status.SKIPPED) {
      System.out.printf("Skipping saving the cassette");
      return;
    }
    List<Expectation> expectations = new ArrayList<>();
    HttpRequest[] requests = mockServer.retrieveRecordedRequests(null);
    for (HttpRequest req : requests) {
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
      LogEventRequestAndResponse[] requestAndResponses =
          mockServer.retrieveRecordedRequestsAndResponses(req);
      expectations.add(
          Expectation.when(req, Times.once(), TimeToLive.unlimited())
              .thenRespond(requestAndResponses[0].getHttpResponse()));
    }

    // write the cassette
    File cassette =
        new File(Paths.get(cassettesDir, world.getVersion(), getCassetteName()).toString());
    cassette.getParentFile().mkdirs();
    if (!cassette.exists()) {
      cassette.createNewFile();
    }
    PrintWriter w = new PrintWriter(cassette.getPath());
    w.print(expectations.toString());
    w.close();
    mockServer.reset();
  }

  public String getCassetteName() {
    return world.getName() + ".json";
  }

  @When("the request is sent")
  public void theRequestIsSent() throws Exception {
    world.sendRequest();
  }

  @When("the request with pagination is sent")
  public void theRequestSentWithPagination() throws Exception {
    world.sendPaginatedRequest();
  }
}
