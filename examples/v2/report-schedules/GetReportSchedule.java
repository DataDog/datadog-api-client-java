// Get a report schedule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ReportSchedulesApi;
import com.datadog.api.client.v2.model.ReportScheduleResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ReportSchedulesApi apiInstance = new ReportSchedulesApi(defaultClient);

    try {
      ReportScheduleResponse result =
          apiInstance.getReportSchedule(UUID.fromString("11111111-2222-3333-4444-555555555555"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportSchedulesApi#getReportSchedule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
