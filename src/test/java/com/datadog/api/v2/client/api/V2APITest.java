package com.datadog.api.v2.client.api;

import com.datadog.api.TestUtils;
import com.datadog.api.v2.client.ApiClient;
import org.junit.BeforeClass;

import java.util.HashMap;

public class V2APITest extends TestUtils.APITest {
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
}
