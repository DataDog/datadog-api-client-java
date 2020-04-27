package com.datadog.api.v1.client.api;

import datadog.trace.api.Trace;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.model.AWSAccountListResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.assertEquals;

public class TelemetryTest extends V1ApiTest {

    private static AwsIntegrationApi api;

    @BeforeClass
    public static void initApi() {
        api = new AwsIntegrationApi(generalApiUnitTestClient);
    }

    @Test
    @Trace
    public void telemetryHeaders() throws ApiException {

        // Mock a random endpoint and make sure we send the operation id header. Return an arbitrary success response code.
        stubFor(get(urlPathEqualTo("/api/v1/integration/aws"))
                .withHeader("DD-OPERATION-ID", equalTo("listAWSAccounts"))
                .withHeader("User-Agent", matching(
                        "^datadog-api-client-java/\\d\\.\\d\\.\\d.*? \\(java .*?; java_vendor .*?; os .*?; os_version .*?; arch .*?\\)$"
                ))
                .willReturn(status(299))
        );

        ApiResponse<AWSAccountListResponse> httpresp = api.listAWSAccounts().executeWithHttpInfo();
        assertEquals(299, httpresp.getStatusCode());
    }
}
