// Get report schedules for a resource returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ReportSchedulesApi;
import com.datadog.api.client.v2.model.ReportScheduleListResponse;
import com.datadog.api.client.v2.model.ReportScheduleResourceType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ReportSchedulesApi apiInstance = new ReportSchedulesApi(defaultClient);

    try {
      ReportScheduleListResponse result =
          apiInstance.getReportSchedulesForResource(
              ReportScheduleResourceType.DASHBOARD, "abc-def-ghi");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportSchedulesApi#getReportSchedulesForResource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
