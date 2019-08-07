package com.datadog.api.client.v1.api;

import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.auth.ApiKeyAuth;

import org.junit.BeforeClass;

public abstract class V1ApiTest {
    protected static ApiClient generalApiClient = null;

    static String TEST_API_KEY_NAME="DD_TEST_CLIENT_API_KEY";
    static String TEST_APP_KEY_NAME="DD_TEST_CLIENT_APP_KEY";

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
}
