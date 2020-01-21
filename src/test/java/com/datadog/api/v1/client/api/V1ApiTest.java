package com.datadog.api.v1.client.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import java.io.IOException;
import java.util.HashMap;

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.TestUtils;
import com.datadog.api.v1.client.auth.ApiKeyAuth;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.junit.WireMockRule;

import org.apache.commons.io.IOUtils;
import org.junit.After;
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
        HashMap<String, String> secrets = new HashMap<String, String>();

        // Configure API key authorization: apiKeyAuth
        String apiKey = System.getenv(TEST_API_KEY_NAME);
        if (apiKey == null) {
            System.err.printf("%s not set, exiting", TEST_API_KEY_NAME);
            System.exit(1);
        }
        secrets.put("apiKeyAuth", apiKey);

        // Configure API key authorization: appKeyAuth
        String appKey = System.getenv(TEST_APP_KEY_NAME);
        if (appKey == null) {
            System.err.printf("%s not set, exiting", TEST_APP_KEY_NAME);
            System.exit(1);
        }
        secrets.put("appKeyAuth", appKey);
        generalApiClient.configureApiKeys(secrets);
        generalApiClient.setDebugging(System.getenv("DEBUG").equals("true"));
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

    @After
    public void resetWiremock() {
        reset();
    }

    public MappingBuilder setupStub(String Urlpath, String fixturePath, String httpMethod) throws IOException {
        MappingBuilder stub = null;

        switch(httpMethod) {
            case "get" :
                stub = get(urlMatching(Urlpath + "\\?.*"));
                break;
            case "post" :
                stub = post(urlMatching(Urlpath + "\\?.*"));
                break;
            case "put" :
                stub = put(urlMatching(Urlpath + "\\?.*"));
                break;
            case "delete" :
                stub = delete(urlMatching(Urlpath + "\\?.*"));
                break;
        }
        stub.withQueryParam("api_key", equalTo(TEST_API_KEY_NAME))
        .withQueryParam("application_key", equalTo(TEST_APP_KEY_NAME))
        .willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(TestUtils.getFixture(fixturePath)));
        return stub;
    }

    public void beginStub(MappingBuilder stub) {
        stubFor(stub);
    }
}
