// Update a report schedule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ReportSchedulesApi;
import com.datadog.api.client.v2.model.ReportScheduleDeliveryFormat;
import com.datadog.api.client.v2.model.ReportSchedulePatchRequest;
import com.datadog.api.client.v2.model.ReportSchedulePatchRequestAttributes;
import com.datadog.api.client.v2.model.ReportSchedulePatchRequestData;
import com.datadog.api.client.v2.model.ReportScheduleResponse;
import com.datadog.api.client.v2.model.ReportScheduleTemplateVariable;
import com.datadog.api.client.v2.model.ReportScheduleType;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.patchReportSchedule", true);
    ReportSchedulesApi apiInstance = new ReportSchedulesApi(defaultClient);

    ReportSchedulePatchRequest body =
        new ReportSchedulePatchRequest()
            .data(
                new ReportSchedulePatchRequestData()
                    .attributes(
                        new ReportSchedulePatchRequestAttributes()
                            .deliveryFormat(ReportScheduleDeliveryFormat.PDF)
                            .description("Updated weekly summary of infrastructure health.")
                            .recipients(
                                Arrays.asList(
                                    "user@example.com",
                                    "slack:T01234567.C01234567.alerts",
                                    "teams:11111111-1111-1111-1111-111111111111|22222222-2222-2222-2222-222222222222|19:exampleChannelId@thread.tacv2"))
                            .rrule(
                                """
DTSTART;TZID=America/New_York:20260601T090000
RRULE:FREQ=WEEKLY;BYDAY=MO;BYHOUR=9;BYMINUTE=0
""")
                            .tabId(UUID.fromString("66666666-7777-8888-9999-000000000000"))
                            .templateVariables(
                                Collections.singletonList(
                                    new ReportScheduleTemplateVariable()
                                        .name("env")
                                        .values(Collections.singletonList("prod"))))
                            .timeframe("1w")
                            .timezone("America/New_York")
                            .title("Weekly Infrastructure Report"))
                    .type(ReportScheduleType.SCHEDULE));

    try {
      ReportScheduleResponse result =
          apiInstance.patchReportSchedule(
              UUID.fromString("11111111-2222-3333-4444-555555555555"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportSchedulesApi#patchReportSchedule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
