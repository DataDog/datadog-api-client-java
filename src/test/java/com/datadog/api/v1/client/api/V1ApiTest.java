package com.datadog.api.v1.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.ApiClient;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
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

        // Set debbuging based on env
        generalApiClient.setDebugging("true".equals(System.getenv("DEBUG")));
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

    public MappingBuilder setupStub(String Urlpath, String fixturePath, String httpMethod) throws IOException {
        MappingBuilder stub = null;

        switch (httpMethod) {
            case "get":
                stub = get(urlMatching(Urlpath + "\\?.*"));
                break;
            case "post":
                stub = post(urlMatching(Urlpath + "\\?.*"));
                break;
            case "put":
                stub = put(urlMatching(Urlpath + "\\?.*"));
                break;
            case "delete":
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
