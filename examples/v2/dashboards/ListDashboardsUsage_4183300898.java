// Get usage stats for all dashboards with both filters returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DashboardsApi;
import com.datadog.api.client.v2.api.DashboardsApi.ListDashboardsUsageOptionalParameters;
import com.datadog.api.client.v2.model.ListDashboardsUsageResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listDashboardsUsage", true);
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    try {
      ListDashboardsUsageResponse result =
          apiInstance.listDashboardsUsage(
              new ListDashboardsUsageOptionalParameters()
                  .filterEditedBefore("2025-04-26T00:00:00Z")
                  .filterViewedBefore("2025-04-26T00:00:00Z"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#listDashboardsUsage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
