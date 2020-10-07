package com.datadog.api;

import static com.github.tomakehurst.wiremock.client.WireMock.recordSpec;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Comparator;
import java.util.List;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockApp;
import com.github.tomakehurst.wiremock.recording.RecordSpec;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class RecorderSteps {

    protected static String cassettesDir = "src/test/resources/scenarios/cassettes";

    public static final String host = "localhost";
    public static final int port = 18080 + Integer.parseInt(System.getProperty("surefireForkNumber"));

    private WireMockServer server;

    private World world;

    public RecorderSteps(World world) {
        this.world = world;
    }

    public static String getUrl() {
        return "http://" + host + ":" + port;
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
                System.out.println("Could not find file " + freezeFile + ", initializing clock using current time");
                world.clock = Clock.fixed(Instant.now(), ZoneOffset.UTC);
            }
            world.now = OffsetDateTime.ofInstant(Instant.now(world.clock), ZoneOffset.UTC);
        }
    }

    @Before(order = 2)
    public void setupRecorder() throws java.io.IOException {
        if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
            Path testCaseCassette = Paths.get(cassettesDir, world.getVersion(), world.getName());

            server = new WireMockServer(wireMockConfig().port(port).withRootDirectory(testCaseCassette.toString()));
            server.start();

            if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_RECORDING)) {
                // Clean existing cassettes when RECORD=true
                if (Files.exists(testCaseCassette)) {
                    Files.walk(testCaseCassette).sorted(Comparator.reverseOrder()).map(Path::toFile)
                            .forEach(File::delete);
                }
                server.getOptions().filesRoot().child(WireMockApp.MAPPINGS_ROOT).createIfNecessary();
                server.getOptions().filesRoot().child(WireMockApp.FILES_ROOT).createIfNecessary();
                server.startRecording(config());
            } else {
                server.startRecording(config());
                // Make sure that wiremock server is replaying for RECORD=false
                server.stopRecording();
            }
        }
    }

    @After
    public void stopRecorder() {
        if (!TestUtils.getRecordingMode().equals(RecordingMode.MODE_IGNORE)) {
            // Wiremock server is running for RECORD=true or RECORD=false
            if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_RECORDING)) {
                // Store cassettes when RECORD=true
                server.stopRecording();
            }
            server.stop();
        }
    }

    private RecordSpec config() {
        // TODO support custom API endpoints
        return recordSpec().forTarget("https://api.datadoghq.com").makeStubsPersistent(true).build();
    }

    @When("the request is sent")
    public void theRequestIsSent() throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException,
            java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException,
            com.fasterxml.jackson.core.JsonProcessingException, java.lang.InstantiationException {
        // FIXME this is an ugly hack to support different subdomain
        String actionName = world.requestBuilder.getName();
        if (TestUtils.getRecordingMode().equals(RecordingMode.MODE_RECORDING) && actionName.equals("getIPRanges")) {
            server.stopRecording();
            server.startRecording(
                    recordSpec().forTarget("https://ip-ranges.datadoghq.com").makeStubsPersistent(true).build());
        }
        world.sendRequest();
    }
}
