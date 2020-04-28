/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import datadog.trace.api.Trace;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.junit.BeforeClass;

import javax.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.HashMap;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public abstract class V1ApiTest extends TestUtils.APITest {
    protected static ApiClient generalApiClient;
    protected static ApiClient generalFakeAuthApiClient;
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
    public static void initGeneralFakeAuthApiClient() {
        generalFakeAuthApiClient = new ApiClient();

        // Configure authorization
        HashMap<String, String> secrets = new HashMap<>();
        secrets.put("apiKeyAuth", "fake_api_key");
        secrets.put("appKeyAuth", "fake_app_key");
        generalFakeAuthApiClient.configureApiKeys(secrets);

        // Set debugging based on env
        generalFakeAuthApiClient.setDebugging("true".equals(System.getenv("DEBUG")));

        // Set proxy to the mockServer for recording
        if (TestUtils.isRecording()) {
            if (!TestUtils.isIbmJdk()) {
                ClientConfig config = (ClientConfig) generalFakeAuthApiClient.getHttpClient().getConfiguration();
                config.connectorProvider(new HttpUrlConnectorProvider().connectionFactory(new TestUtils.MockServerProxyConnectionFactory()));
            }
        } else {
            // Set base path to the mock server for replaying
            generalFakeAuthApiClient.setBasePath("https://" + TestUtils.MOCKSERVER_HOST + ":" + TestUtils.MOCKSERVER_PORT);
            generalFakeAuthApiClient.setServerIndex(null);
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

    public <T> ApiResponse<T> sendRequest(String method, String url, String payload, GenericType<T> responseType) throws ApiException {
        String originalBasePath = generalApiClient.getBasePath();
        Integer originalServerIndex = generalApiClient.getServerIndex();
        if (url.startsWith("https://")) {
            // if we got full URL, ensure that invokeAPI method doesn't use builtin operation servers
            // but rather falls back to basePath, which is empty => we'll get precisely the URL we want as result
            generalApiClient.setBasePath("");
            generalApiClient.setServerIndex(null);
        }
        try {
            return generalApiClient.invokeAPI(
                    "",
                    url,
                    method,
                    null,
                    payload,
                    new HashMap<String, String>(),
                    new HashMap<String, String>(),
                    null,
                    "application/json",
                    "application/json",
                    new String[]{"apiKeyAuth", "appKeyAuth"},
                    responseType
            );
        } finally {
            generalApiClient.setBasePath(originalBasePath);
            generalApiClient.setServerIndex(originalServerIndex);
        }
    }
}
