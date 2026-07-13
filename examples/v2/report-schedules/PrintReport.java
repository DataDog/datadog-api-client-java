// Print a report returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ReportSchedulesApi;
import com.datadog.api.client.v2.model.PrintReportRequest;
import com.datadog.api.client.v2.model.PrintReportRequestAttributes;
import com.datadog.api.client.v2.model.PrintReportRequestData;
import com.datadog.api.client.v2.model.PrintReportResponse;
import com.datadog.api.client.v2.model.PrintReportType;
import com.datadog.api.client.v2.model.ReportScheduleResourceType;
import com.datadog.api.client.v2.model.ReportScheduleTemplateVariable;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ReportSchedulesApi apiInstance = new ReportSchedulesApi(defaultClient);

    PrintReportRequest body =
        new PrintReportRequest()
            .data(
                new PrintReportRequestData()
                    .attributes(
                        new PrintReportRequestAttributes()
                            .fromTs(1780318800000L)
                            .resourceId("abc-def-ghi")
                            .resourceType(ReportScheduleResourceType.DASHBOARD)
                            .templateVariables(
                                Collections.singletonList(
                                    new ReportScheduleTemplateVariable()
                                        .name("env")
                                        .values(Collections.singletonList("prod"))))
                            .timeframe("1w")
                            .timezone("America/New_York")
                            .toTs(1780923600000L))
                    .type(PrintReportType.REPORT));

    try {
      PrintReportResponse result = apiInstance.printReport(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportSchedulesApi#printReport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
