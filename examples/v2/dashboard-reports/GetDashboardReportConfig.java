// Get a Dashboard Report returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DashboardReportsApi;
import com.datadog.api.client.v2.model.DashboardReportResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardReportsApi apiInstance = new DashboardReportsApi(defaultClient);

    // there is a valid "dashboard" in the system
    String DASHBOARD_ID = System.getenv("DASHBOARD_ID");

    // there is a valid "dashboard_report" in the system
    String DASHBOARD_REPORT_DATA_ID = System.getenv("DASHBOARD_REPORT_DATA_ID");

    try {
      DashboardReportResponse result =
          apiInstance.getDashboardReportConfig(DASHBOARD_ID, DASHBOARD_REPORT_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardReportsApi#getDashboardReportConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
