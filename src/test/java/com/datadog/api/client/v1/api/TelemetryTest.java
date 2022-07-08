package com.datadog.api.client.v1.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.assertEquals;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.v1.model.AWSAccountListResponse;
import org.junit.BeforeClass;
import org.junit.Test;

public class TelemetryTest extends V1ApiTest {

  private static AwsIntegrationApi api;

  @Override
  public String getTracingEndpoint() {
    return "telemetry";
  }

  @BeforeClass
  public static void initApi() {
    api = new AwsIntegrationApi(generalApiUnitTestClient);
  }

  @Test
  public void telemetryHeaders() throws ApiException {

    // Mock a random endpoint and make sure we send the operation id header. Return an arbitrary
    // success response code.
    stubFor(
        get(urlPathEqualTo("/api/v1/integration/aws"))
            .withHeader(
                "User-Agent",
                matching(
                    "^datadog-api-client-java/\\d+\\.\\d+\\.\\d+.*? \\(java .*?; java_vendor .*?;"
                        + " os .*?; os_version .*?; arch .*?\\)$"))
            .willReturn(status(299)));

    ApiResponse<AWSAccountListResponse> httpresp =
        api.listAWSAccountsWithHttpInfo(new AwsIntegrationApi.ListAWSAccountsOptionalParameters());
    assertEquals(299, httpresp.getStatusCode());
  }
}
