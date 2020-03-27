/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiClient;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.junit.BeforeClass;

import java.io.IOException;
import java.util.HashMap;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public abstract class V1ApiTest extends TestUtils.APITest {
    protected static ApiClient generalApiClient;
    protected static ApiClient generalApiUnitTestClient;

    @BeforeClass
    public static void initGeneralApiClient() {
        generalApiClient = new ApiClient();

        // Configure authorization
        HashMap<String, String> secrets = new HashMap<>();
        secrets.put("apiKeyAuth", TEST_API_KEY);
        secrets.put("appKeyAuth", TEST_APP_KEY);
        generalApiClient.configureApiKeys(secrets);

        // Set debugging based on env
        generalApiClient.setDebugging("true".equals(System.getenv("DEBUG")));

        // Set proxy to the mockServer for recording
        if (TestUtils.isRecording()) {
            if (!TestUtils.isIbmJdk()) {
                ClientConfig config = (ClientConfig) generalApiClient.getHttpClient().getConfiguration();
                config.connectorProvider(new HttpUrlConnectorProvider().connectionFactory(new TestUtils.MockServerProxyConnectionFactory()));
            }
        } else {
            // Set base path to the mock server for replaying
            generalApiClient.setBasePath("https://" + TestUtils.MOCKSERVER_HOST + ":" + TestUtils.MOCKSERVER_PORT);
            generalApiClient.setServerIndex(null);
        }
    }

    @BeforeClass
    public static void initGeneralApiUnitTestClient() {
        generalApiUnitTestClient = new ApiClient();

        // WireMock defaults to listening on localhost port 8080
        // http://wiremock.org/docs/configuration/
        generalApiUnitTestClient.setBasePath("http://localhost:8080");
        // Disable templated servers
        generalApiUnitTestClient.setServerIndex(null);

        // Configure authorization with fake keys
        HashMap<String, String> secrets = new HashMap<>();
        secrets.put("apiKeyAuth", TEST_API_KEY_NAME);
        secrets.put("appKeyAuth", TEST_APP_KEY_NAME);
        generalApiUnitTestClient.configureApiKeys(secrets);
    }

    @BeforeClass
    public static void setVersion() {
        version = "v1";
    }

    public MappingBuilder setupStub(String Urlpath, String fixturePath, String httpMethod) throws IOException {
        MappingBuilder stub = null;

        switch (httpMethod) {
            case "get":
                stub = get(urlMatching(Urlpath + "(\\?.*)?"));
                break;
            case "post":
                stub = post(urlMatching(Urlpath + "(\\?.*)?"));
                break;
            case "put":
                stub = put(urlMatching(Urlpath + "(\\?.*)?"));
                break;
            case "delete":
                stub = delete(urlMatching(Urlpath + "(\\?.*)?"));
                break;
        }
        stub.willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(TestUtils.getFixture(fixturePath)));
        return stub;
    }

    public void beginStub(MappingBuilder stub) {
        stubFor(stub);
    }
}
