// Get usage stats for all dashboards returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.DashboardsApi;
import com.datadog.api.client.v2.api.DashboardsApi.ListDashboardsUsageOptionalParameters;
import com.datadog.api.client.v2.model.DashboardUsage;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listDashboardsUsage", true);
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    try {
      PaginationIterable<DashboardUsage> iterable =
          apiInstance.listDashboardsUsageWithPagination(
              new ListDashboardsUsageOptionalParameters().pageLimit(500L));

      for (DashboardUsage item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling DashboardsApi#listDashboardsUsageWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
