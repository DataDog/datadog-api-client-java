// Create a report schedule returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ReportSchedulesApi;
import com.datadog.api.client.v2.model.ReportScheduleCreateRequest;
import com.datadog.api.client.v2.model.ReportScheduleCreateRequestAttributes;
import com.datadog.api.client.v2.model.ReportScheduleCreateRequestData;
import com.datadog.api.client.v2.model.ReportScheduleDeliveryFormat;
import com.datadog.api.client.v2.model.ReportScheduleResourceType;
import com.datadog.api.client.v2.model.ReportScheduleResponse;
import com.datadog.api.client.v2.model.ReportScheduleTemplateVariable;
import com.datadog.api.client.v2.model.ReportScheduleType;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createReportSchedule", true);
    ReportSchedulesApi apiInstance = new ReportSchedulesApi(defaultClient);

    ReportScheduleCreateRequest body =
        new ReportScheduleCreateRequest()
            .data(
                new ReportScheduleCreateRequestData()
                    .attributes(
                        new ReportScheduleCreateRequestAttributes()
                            .deliveryFormat(ReportScheduleDeliveryFormat.PDF)
                            .description("Weekly summary of infrastructure health.")
                            .recipients(
                                Arrays.asList(
                                    "user@example.com",
                                    "slack:T01234567.C01234567.alerts",
                                    "teams:11111111-1111-1111-1111-111111111111|22222222-2222-2222-2222-222222222222|19:exampleChannelId@thread.tacv2"))
                            .resourceId("abc-def-ghi")
                            .resourceType(ReportScheduleResourceType.DASHBOARD)
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
      ReportScheduleResponse result = apiInstance.createReportSchedule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportSchedulesApi#createReportSchedule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
