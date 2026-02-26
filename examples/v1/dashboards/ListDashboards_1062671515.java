// Get all dashboards returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.api.DashboardsApi.ListDashboardsOptionalParameters;
import com.datadog.api.client.v1.model.DashboardSummaryDefinition;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    try {
      PaginationIterable<DashboardSummaryDefinition> iterable =
          apiInstance.listDashboardsWithPagination(
              new ListDashboardsOptionalParameters().count(2L));

      for (DashboardSummaryDefinition item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling DashboardsApi#listDashboardsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
