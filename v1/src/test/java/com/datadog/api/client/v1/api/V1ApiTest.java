package com.datadog.api.client.v1.api;

import com.datadog.api.client.v1.ApiClient;
import com.datadog.api.client.v1.auth.ApiKeyAuth;

import org.junit.BeforeClass;

public abstract class V1ApiTest {
    protected static ApiClient generalApiClient = null;

    @BeforeClass
    public static void initGeneralApiClient() {
        generalApiClient = new ApiClient();

        // Configure API key authorization: apiKeyAuth
        String apiKey = System.getenv("DATADOG_API_KEY");
        if (apiKey == null) {
            System.err.println("DATADOG_API_KEY not set, exiting");
            System.exit(1);
        }
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) generalApiClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey(apiKey);

        // Configure API key authorization: appKeyAuth
        String appKey = System.getenv("DATADOG_APP_KEY");
        if (appKey == null) {
            System.err.println("DATADOG_APP_KEY not set, exiting");
            System.exit(1);
        }
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) generalApiClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey(appKey);
    }
}