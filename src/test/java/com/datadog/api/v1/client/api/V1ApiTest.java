package com.datadog.api.v1.client.api;

import java.io.IOException;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.auth.ApiKeyAuth;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.stubbing.StubMapping;
import static com.github.tomakehurst.wiremock.client.WireMock.*;

import org.apache.commons.io.IOUtils;
import org.junit.BeforeClass;
import org.junit.Rule;

public abstract class V1ApiTest {
    protected static ApiClient generalApiClient = null;
    protected static ApiClient generalApiUnitTestClient = null;

    static String TEST_API_KEY_NAME="DD_TEST_CLIENT_API_KEY";
    static String TEST_APP_KEY_NAME="DD_TEST_CLIENT_APP_KEY";

    @Rule
    public WireMockRule wireMockRule = new WireMockRule();

    @BeforeClass
    public static void initGeneralApiClient() {
        generalApiClient = new ApiClient();

        // Configure API key authorization: apiKeyAuth
        String apiKey = System.getenv(TEST_API_KEY_NAME);
        if (apiKey == null) {
            System.err.printf("%s not set, exiting", TEST_API_KEY_NAME);
            System.exit(1);
        }
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) generalApiClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey(apiKey);

        // Configure API key authorization: appKeyAuth
        String appKey = System.getenv(TEST_APP_KEY_NAME);
        if (appKey == null) {
            System.err.printf("%s not set, exiting", TEST_APP_KEY_NAME);
            System.exit(1);
        }
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) generalApiClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey(appKey);
    }

    @BeforeClass
    public static void initGeneralApiUnitTestClient() {
        generalApiUnitTestClient = new ApiClient();

        // WireMock defaults to listening on localhost port 8080
        // http://wiremock.org/docs/configuration/
        generalApiUnitTestClient.setBasePath("http://localhost:8080");

        // Configure API key authorization with fake key
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) generalApiUnitTestClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey(TEST_API_KEY_NAME);

        // Configure API key authorization with fake key
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) generalApiUnitTestClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey(TEST_APP_KEY_NAME);
    }

    public String getFixture(String path) throws IOException {
        return IOUtils.toString(this.getClass().getResourceAsStream(path), "UTF-8");
    }

    public MappingBuilder beginStub(String Urlpath, String fixturePath ) throws IOException {
        MappingBuilder stub = get(urlMatching(Urlpath + "?.*"))
        .withQueryParam("api_key", equalTo(TEST_API_KEY_NAME))
        .withQueryParam("application_key", equalTo(TEST_APP_KEY_NAME))
        .willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(this.getFixture(fixturePath)));
        return stub;
    }
}
