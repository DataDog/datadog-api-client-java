// Get Dashboard Reports for a Dashboard returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DashboardReportsApi;
import com.datadog.api.client.v2.model.DashboardReportsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardReportsApi apiInstance = new DashboardReportsApi(defaultClient);

    // there is a valid "dashboard" in the system
    String DASHBOARD_ID = System.getenv("DASHBOARD_ID");

    try {
      DashboardReportsResponse result = apiInstance.getDashboardReportConfigsList(DASHBOARD_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling DashboardReportsApi#getDashboardReportConfigsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
