// Get a shared dashboard returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.SharedDashboard;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    // there is a valid "shared_dashboard" in the system
    String SHARED_DASHBOARD_TOKEN = System.getenv("SHARED_DASHBOARD_TOKEN");

    try {
      SharedDashboard result = apiInstance.getPublicDashboard(SHARED_DASHBOARD_TOKEN);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getPublicDashboard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
