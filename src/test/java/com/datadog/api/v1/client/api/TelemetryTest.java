package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.model.AWSAccountListResponse;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class TelemetryTest extends V1ApiTest {

    private static AwsIntegrationApi api;

    @BeforeClass
    public static void initApi() {
        api = new AwsIntegrationApi(generalApiUnitTestClient);
    }

    @Test
    public void TestTelemetryHeaders() throws ApiException {

        // Mock a random endpoint and make sure we send the operation id header. Return an arbitrary success response code.
        stubFor(get(urlPathEqualTo("/api/v1/integration/aws"))
                .withHeader("DD-OPERATION-ID", equalTo("listAWSAccounts"))
                .willReturn(status(299))
        );

        ApiResponse<AWSAccountListResponse> httpresp = api.listAWSAccounts().executeWithHttpInfo();
        assertEquals(299, httpresp.getStatusCode());
    }
}