package com.datadog.api.v2.client.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.assertEquals;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.v2.client.model.DashboardListItems;
import org.junit.BeforeClass;
import org.junit.Test;

public class TelemetryTest extends V2APITest {

  private static DashboardListsApi api;

  @Override
  public String getTracingEndpoint() {
    return "telemetry";
  }

  @BeforeClass
  public static void initApi() {
    api = new DashboardListsApi(generalApiUnitTestClient);
  }

  @Test
  public void telemetryHeaders() throws ApiException {

    // Mock a random endpoint and make sure we send the operation id header. Return an arbitrary
    // success response code.
    stubFor(
        get(urlPathEqualTo("/api/v2/dashboard/lists/manual/1234/dashboards"))
            .withHeader(
                "User-Agent",
                matching(
                    "^datadog-api-client-java/\\d+\\.\\d+\\.\\d+.*? \\(java .*?; java_vendor .*?;"
                        + " os .*?; os_version .*?; arch .*?\\)$"))
            .willReturn(status(299)));

    ApiResponse<DashboardListItems> httpresp = api.getDashboardListItemsWithHttpInfo(1234L);
    assertEquals(299, httpresp.getStatusCode());
  }
}
