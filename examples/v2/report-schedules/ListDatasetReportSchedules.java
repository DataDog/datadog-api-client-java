// List dataset report schedules returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ReportSchedulesApi;
import com.datadog.api.client.v2.model.DatasetReportScheduleListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ReportSchedulesApi apiInstance = new ReportSchedulesApi(defaultClient);

    try {
      DatasetReportScheduleListResponse result =
          apiInstance.listDatasetReportSchedules(
              "MW5vdGVib29rX2NlbGw6ZDI0ZTM2MWMtZDFlNC00NDYwLWIyOWUtNTg3YTczMzA3MDFm");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportSchedulesApi#listDatasetReportSchedules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
