// Create a new SLO report returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceLevelObjectivesApi;
import com.datadog.api.client.v2.model.SLOReportInterval;
import com.datadog.api.client.v2.model.SLOReportPostRequest;
import com.datadog.api.client.v2.model.SLOReportPostRequestData;
import com.datadog.api.client.v2.model.SLOReportPostResponse;
import com.datadog.api.client.v2.model.SloReportPostRequestAttributes;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createSLOReportJob", true);
    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);

    SLOReportPostRequest body =
        new SLOReportPostRequest()
            .data(
                new SLOReportPostRequestData()
                    .attributes(
                        new SloReportPostRequestAttributes()
                            .fromTs(1690901870L)
                            .toTs(1706803070L)
                            .query("""
slo_type:metric "SLO Reporting Test"
""")
                            .interval(SLOReportInterval.MONTHLY)
                            .timezone("America/New_York")));

    try {
      SLOReportPostResponse result = apiInstance.createSLOReportJob(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelObjectivesApi#createSLOReportJob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
