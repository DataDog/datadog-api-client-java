// Update Dashboard Report returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DashboardReportsApi;
import com.datadog.api.client.v2.model.DashboardReportResponse;
import com.datadog.api.client.v2.model.DashboardReportSchedule;
import com.datadog.api.client.v2.model.DashboardReportType;
import com.datadog.api.client.v2.model.DashboardReportUpdateAttributes;
import com.datadog.api.client.v2.model.DashboardReportUpdateRequest;
import com.datadog.api.client.v2.model.DashboardReportUpdateRequestData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardReportsApi apiInstance = new DashboardReportsApi(defaultClient);

    // there is a valid "dashboard" in the system
    String DASHBOARD_ID = System.getenv("DASHBOARD_ID");

    // there is a valid "dashboard_report" in the system
    String DASHBOARD_REPORT_DATA_ID = System.getenv("DASHBOARD_REPORT_DATA_ID");

    DashboardReportUpdateRequest body =
        new DashboardReportUpdateRequest()
            .data(
                new DashboardReportUpdateRequestData()
                    .attributes(
                        new DashboardReportUpdateAttributes()
                            .schedule(new DashboardReportSchedule().active(false))
                            .title("Summary of performance for Web Application Backend"))
                    .id(DASHBOARD_REPORT_DATA_ID)
                    .type(DashboardReportType.DASHBOARD_REPORTS_TYPE));

    try {
      DashboardReportResponse result =
          apiInstance.updateDashboardReportConfig(DASHBOARD_ID, DASHBOARD_REPORT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardReportsApi#updateDashboardReportConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
