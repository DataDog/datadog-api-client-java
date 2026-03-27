// Create a new SLO report returns "OK" response
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ServiceLevelObjectivesApi;
import com.datadog.api.client.v2.model.SLOReportPostResponse;
import com.datadog.api.client.v2.model.SloReportCreateRequest;
import com.datadog.api.client.v2.model.SloReportCreateRequestAttributes;
import com.datadog.api.client.v2.model.SloReportCreateRequestData;
import com.datadog.api.client.v2.model.SLOReportInterval;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createSLOReportJob", true);
    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);

    SloReportCreateRequest body = new SloReportCreateRequest()
.data(new SloReportCreateRequestData()
.attributes(new SloReportCreateRequestAttributes()
.fromTs(OffsetDateTime.now().plusDays(-40).toInstant().getEpochSecond())
.toTs(OffsetDateTime.now().toInstant().getEpochSecond())
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