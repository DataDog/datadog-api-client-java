package com.datadog.api;

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

import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import org.junit.BeforeClass;
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

    protected static String cassettesDir = "src/test/resources/cassettes";

    // Use the statically initialized mockServer
    public static ClientAndServer mockServer = TestUtils.APITest.mockServer;
    public TestName name = new TestName();

    private World world;

    public RecorderSteps(World world) {
        this.world = world;
    }

    public static String getUrl() {
        return "http://" + TestUtils.MOCKSERVER_HOST + ":" + TestUtils.MOCKSERVER_PORT;
    }

    @Before(order = 1)
    public void setupClock() throws java.io.IOException {
        if (TestUtils.isIbmJdk() || TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
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
                System.err.println("Could not find file " + freezeFile + ", initializing clock using current time");
                world.clock = Clock.fixed(Instant.now(), ZoneOffset.UTC);
            }
            world.now = OffsetDateTime.ofInstant(Instant.now(world.clock), ZoneOffset.UTC);
        }
    }

    @Before(order = 2)
    public void setupRecorder() throws java.io.IOException {
        if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
//            Path testCaseCassette = Paths.get(cassettesDir, world.getVersion(), world.getName());
//            mockServer.stop();
//            mockServer.hasStopped(5, 5, TimeUnit.SECONDS);
//            ConfigurationProperties.initializationJsonPath(testCaseCassette.toString());
//            mockServer.startClientAndServer(TestUtils.MOCKSERVER_PORT);

//            if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_RECORDING)) {
//                // Clean existing cassettes when RECORD=true
//                if (Files.exists(testCaseCassette)) {
//                    Files.walk(testCaseCassette).sorted(Comparator.reverseOrder()).map(Path::toFile)
//                            .forEach(File::delete);
//                }
//                server.getOptions().filesRoot().child(WireMockApp.MAPPINGS_ROOT).createIfNecessary();
//                server.getOptions().filesRoot().child(WireMockApp.FILES_ROOT).createIfNecessary();
//                server.startRecording(config());
//            } else {
//                server.startRecording(config());
//                // Make sure that wiremock server is replaying for RECORD=false
//                server.stopRecording();
//            }
        }
    }

//    @After
//    public void stopRecorder() {
//        if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
//            // Wiremock server is running for RECORD=true or RECORD=false
//            if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_RECORDING)) {
//                // Store cassettes when RECORD=true
//                server.stopRecording();
//            }
//            server.stop();
//        }
//    }
    @After
    public void cleanAndSendExpectations() throws IOException {
        // Cleanup the recorded requests from sensitive information (API keys in headers and query params),
        // create the associated expectations and save them to disk in the `cassettes/**/*.json` files
        if (TestUtils.isIbmJdk() || !TestUtils.getRecordingMode().equals(RecordingMode.MODE_RECORDING)) {
            System.out.printf("Skipping saving the cassette");
            return;
        }
        List<Expectation> expectations = new ArrayList<>();
        LogEventRequestAndResponse[] requestsAndResponses = mockServer.retrieveRecordedRequestsAndResponses(null);
        for (LogEventRequestAndResponse requestAndResponse : requestsAndResponses) {
            HttpRequest req = requestAndResponse.getHttpRequest();
            List<Parameter> params = req.getQueryStringParameterList();
            List<Parameter> cleanParams = new ArrayList<>();
            List<Header> headers = req.getHeaderList();
            List<Header> cleanHeaders = new ArrayList<>();
            for (Header header : headers) {
                if (!header.getName().equals("DD-API-KEY") &&
                        !header.getName().equals("DD-APPLICATION-KEY") &&
                        !header.getName().equals("Host") &&
                        !header.getName().equals("x-datadog-trace-id") &&
                        !header.getName().equals("x-datadog-parent-id") &&
                        !header.getName().equals("x-datadog-sampling-priority") &&
                        !header.getName().equals("User-Agent")
                )
                    cleanHeaders.add(header);
            }
            for (Parameter param : params) {
                if (!param.getName().equals("api_key") &&
                        !param.getName().equals("application_key")
                )
                    cleanParams.add(param);
            }
            req.withHeaders(cleanHeaders);
            req.withQueryStringParameters(cleanParams);
            expectations.add(Expectation.when(req, Times.once(), TimeToLive.unlimited()).thenRespond(requestAndResponse.getHttpResponse()));
        }

        // write the cassette
        File cassette = new File(Paths.get(TestUtils.APITest.cassettesDir, world.getVersion(), getCassetteName()).toString());
        cassette.getParentFile().mkdirs();
        System.out.printf("Creating cassette: %s/%s/%s", TestUtils.APITest.cassettesDir, world.getVersion(), getCassetteName());
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
    public void theRequestIsSent()
            throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException,
            java.lang.reflect.InvocationTargetException, com.fasterxml.jackson.core.JsonProcessingException,
            java.lang.InstantiationException, java.net.URISyntaxException, java.io.IOException {
        // FIXME this is an ugly hack to support different subdomain
//        String actionName = world.requestBuilder.getName();
//        if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_RECORDING) && actionName.equals("getIPRanges")) {
//            mockServer.stopRecording();
//            mockServer.startRecording(
//                    recordSpec().forTarget("https://ip-ranges.datadoghq.com").makeStubsPersistent(true).build());
//        }
        world.sendRequest();
    }
}
