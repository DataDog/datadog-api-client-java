// Toggle a report schedule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ReportSchedulesApi;
import com.datadog.api.client.v2.model.ReportScheduleResponse;
import com.datadog.api.client.v2.model.ReportScheduleStatus;
import com.datadog.api.client.v2.model.ReportScheduleToggleRequest;
import com.datadog.api.client.v2.model.ReportScheduleToggleRequestAttributes;
import com.datadog.api.client.v2.model.ReportScheduleToggleRequestData;
import com.datadog.api.client.v2.model.ReportScheduleType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ReportSchedulesApi apiInstance = new ReportSchedulesApi(defaultClient);

    ReportScheduleToggleRequest body =
        new ReportScheduleToggleRequest()
            .data(
                new ReportScheduleToggleRequestData()
                    .attributes(
                        new ReportScheduleToggleRequestAttributes()
                            .status(ReportScheduleStatus.ACTIVE))
                    .type(ReportScheduleType.SCHEDULE));

    try {
      ReportScheduleResponse result =
          apiInstance.toggleReportSchedule(
              UUID.fromString("11111111-2222-3333-4444-555555555555"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportSchedulesApi#toggleReportSchedule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
