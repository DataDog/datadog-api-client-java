// List shared dashboards for a dashboard returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DashboardSharingApi;
import com.datadog.api.client.v2.model.ListSharedDashboardsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listSharedDashboardsByDashboardId", true);
    DashboardSharingApi apiInstance = new DashboardSharingApi(defaultClient);

    try {
      ListSharedDashboardsResponse result =
          apiInstance.listSharedDashboardsByDashboardId("abc-def-ghi");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling DashboardSharingApi#listSharedDashboardsByDashboardId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
