/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.apache.commons.io.IOUtils;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.mockserver.configuration.ConfigurationProperties;
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

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
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

import static com.github.tomakehurst.wiremock.client.WireMock.reset;
import static org.mockserver.integration.ClientAndServer.startClientAndServer;

public class TestUtils {

    public static String MOCKSERVER_HOST = "localhost";
    public static int MOCKSERVER_PORT = 8081;

    public static void retry(int interval, int count, BooleanSupplier call) throws RetryException {
        for (int i = 0; i < count; i++) {
            if (call.getAsBoolean()) {
                return;
            }
            if (isRecording()) {
                try {
                    Thread.sleep(interval * 1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
        throw new RetryException(String.format("Retry error: failed to satisfy the condition after %d times", count));
    }

    public static String getFixture(String path) throws IOException {
        return IOUtils.toString(TestUtils.class.getResourceAsStream(path), "UTF-8");
    }

    public static boolean isRecording() {
        return Boolean.parseBoolean(System.getenv("RECORD"));
    }

    public static boolean isIbmJdk() {
        return System.getProperty("java.vendor").equals("IBM Corporation");
    }

    public static boolean handleIbmJdk() {
        if (!isIbmJdk()) {
            return false;
        }
        if (!isRecording()) {
            throw new RuntimeException("Can't run recorded tests on IBM JDK: https://github.com/mock-server/mockserver/issues/750");
        }
        System.err.println("NOTE: Running on IBM JDK can't record cassettes, will only run tests: https://github.com/mock-server/mockserver/issues/750");
        return true;
    }

    public static class RetryException extends Exception {
        public RetryException(String message) {
            super(message);
        }
    }

    public static class MockServerProxyConnectionFactory implements HttpUrlConnectorProvider.ConnectionFactory {
        @Override
        public HttpURLConnection getConnection(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection(
                    new Proxy(Proxy.Type.HTTP, new InetSocketAddress(MOCKSERVER_HOST, MOCKSERVER_PORT))
            );
        }
    }

    public static class APITest {

        protected static final String TEST_API_KEY_NAME = "DD_TEST_CLIENT_API_KEY";
        protected static final String TEST_APP_KEY_NAME = "DD_TEST_CLIENT_APP_KEY";

        protected static String version = "v1";

        protected static String TEST_API_KEY;
        protected static String TEST_APP_KEY;
        @Rule
        public WireMockRule wireMockRule = new WireMockRule();
        @Rule
        public TestName name = new TestName();
        public ClientAndServer mockServer;
        protected Clock clock;
        protected OffsetDateTime now;

        @BeforeClass
        public static void trustProxyCerts() {
            if (handleIbmJdk()) {
                return;
            }
            // Needed otherwise the Trust store does not have the correct type for java > 8.
            // See https://github.com/mock-server/mockserver/issues/744
            Security.setProperty("keystore.type", "jks");
            // Trust MockServers proxy certificates
            HttpsURLConnection.setDefaultSSLSocketFactory(
                    new KeyStoreFactory(new MockServerLogger()).sslContext().getSocketFactory()
            );
        }

        @BeforeClass
        public static void getSecretsFromEnv() {
            if (!isRecording()) return;

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
        public void setupMockServer() {
            if (isIbmJdk()) {
                return;
            }
            if (TestUtils.isRecording()) {
                ConfigurationProperties.persistExpectations(true);
                ConfigurationProperties.persistedExpectationsPath(
                        Paths.get("src/test/resources/cassettes", version, name.getMethodName() + ".json").toString()
                );
            } else {
                ConfigurationProperties.initializationJsonPath(
                        Paths.get("src/test/resources/cassettes", version, name.getMethodName() + ".json").toString()
                );
            }
            mockServer = startClientAndServer(MOCKSERVER_PORT);
        }

        @Before
        public void setupClock() throws IOException {
            if (isIbmJdk()) {
                now = OffsetDateTime.now();
                return;
            }
            // Use a fixed time in tests to allow replaying from cassettes
            if (TestUtils.isRecording()) {
                // When recording, set the clock to the current time and save it to a `freeze` file for replaying
                clock = Clock.fixed(Instant.now(), ZoneOffset.UTC);
                now = OffsetDateTime.ofInstant(Instant.now(clock), ZoneOffset.UTC);
                Files.write(
                        Paths.get("src/test/resources/cassettes", version, name.getMethodName() + ".freeze"),
                        now.toString().getBytes()
                );
            } else {
                // When replaying, read the time in the `freeze` file, and set the clock to that time, or current time if file not found
                Path freezeFile = Paths.get("src/test/resources/cassettes", version, name.getMethodName() + ".freeze");
                try {
                    List<String> lines = Files.readAllLines(freezeFile);
                    clock = Clock.fixed(Instant.parse(lines.get(0)), ZoneOffset.UTC);
                } catch (NoSuchFileException e) {
                    System.out.println("Could not find file " + freezeFile + ", initializing clock using current time");
                    clock = Clock.fixed(Instant.now(), ZoneOffset.UTC);
                }
                now = OffsetDateTime.ofInstant(Instant.now(clock), ZoneOffset.UTC);
            }
        }

        @After
        public void cleanAndSendExpectations() {
            // Cleanup the recorded requests from sensitive information (API keys in headers and query params),
            // create the associated expectations and send them to mockserver to save them on disk in the `cassettes/**/*.json` files
            if (isIbmJdk()) {
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
                            !header.getName().equals("Host")
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
            mockServer.sendExpectation(expectations.toArray(new Expectation[0]));
            mockServer.stop();
        }

        @After
        public void resetWiremock() {
            reset();
        }
    }
}
