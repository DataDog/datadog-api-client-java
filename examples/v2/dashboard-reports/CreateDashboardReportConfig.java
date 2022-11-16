// Create a new Dashboard Report returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DashboardReportsApi;
import com.datadog.api.client.v2.model.DashboardReportCreate;
import com.datadog.api.client.v2.model.DashboardReportCreateAttributes;
import com.datadog.api.client.v2.model.DashboardReportCreateRequest;
import com.datadog.api.client.v2.model.DashboardReportDestination;
import com.datadog.api.client.v2.model.DashboardReportDestinationEmail;
import com.datadog.api.client.v2.model.DashboardReportResponse;
import com.datadog.api.client.v2.model.DashboardReportSchedule;
import com.datadog.api.client.v2.model.DashboardReportScheduleFrequency;
import com.datadog.api.client.v2.model.DashboardReportScheduleRepeatAt;
import com.datadog.api.client.v2.model.DashboardReportTimeframe;
import com.datadog.api.client.v2.model.DashboardReportType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardReportsApi apiInstance = new DashboardReportsApi(defaultClient);

    // there is a valid "dashboard" in the system
    String DASHBOARD_ID = System.getenv("DASHBOARD_ID");

    DashboardReportCreateRequest body =
        new DashboardReportCreateRequest()
            .data(
                new DashboardReportCreate()
                    .attributes(
                        new DashboardReportCreateAttributes()
                            .description(
                                "This report summarizes the recent errors, latency, and uptime of"
                                    + " our Web Application Backend.")
                            .destinations(
                                new DashboardReportDestination()
                                    .email(
                                        new DashboardReportDestinationEmail()
                                            .recipientAddresses(
                                                Collections.singletonList("jane.doe@example.com"))))
                            .schedule(
                                new DashboardReportSchedule()
                                    .active(true)
                                    .frequency(
                                        DashboardReportScheduleFrequency
                                            .DASHBOARD_REPORT_SCHEDULE_FREQUENCY_1D)
                                    .repeatAt(
                                        DashboardReportScheduleRepeatAt
                                            .DASHBOARD_REPORT_SCHEDULE_REPEAT_AT_13_30)
                                    .repeatOnDayOfMonth(null)
                                    .repeatOnDayOfWeek(null)
                                    .timezone("America/New_York"))
                            .timeframe(DashboardReportTimeframe.DASHBOARD_REPORT_TIMEFRAME_1W)
                            .title(
                                "Summary of recent stability and performance for Web Application"
                                    + " Backend"))
                    .type(DashboardReportType.DASHBOARD_REPORTS_TYPE));

    try {
      DashboardReportResponse result = apiInstance.createDashboardReportConfig(DASHBOARD_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardReportsApi#createDashboardReportConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
