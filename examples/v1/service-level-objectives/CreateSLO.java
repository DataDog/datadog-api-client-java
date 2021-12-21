// Create an SLO object returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.ServiceLevelObjectivesApi;
import com.datadog.api.v1.client.model.SLOListResponse;
import com.datadog.api.v1.client.model.SLOThreshold;
import com.datadog.api.v1.client.model.SLOTimeframe;
import com.datadog.api.v1.client.model.SLOType;
import com.datadog.api.v1.client.model.ServiceLevelObjectiveQuery;
import com.datadog.api.v1.client.model.ServiceLevelObjectiveRequest;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);

    ServiceLevelObjectiveRequest body =
        new ServiceLevelObjectiveRequest()
            .type(SLOType.METRIC)
            .description("string")
            .groups(
                new ArrayList<String>() {
                  {
                    add("env:test");
                    add("role:mysql");
                  }
                })
            .monitorIds(
                new ArrayList<Long>() {
                  {
                    ;
                  }
                })
            .name("Example-Create_an_SLO_object_returns_OK_response")
            .query(
                new ServiceLevelObjectiveQuery()
                    .denominator("sum:httpservice.hits{!code:3xx}.as_count()")
                    .numerator("sum:httpservice.hits{code:2xx}.as_count()"))
            .tags(
                new ArrayList<String>() {
                  {
                    add("env:prod");
                    add("app:core");
                  }
                })
            .thresholds(
                new ArrayList<SLOThreshold>() {
                  {
                    add(
                        new SLOThreshold()
                            .target(95.0)
                            .targetDisplay("95.0")
                            .timeframe(SLOTimeframe.SEVEN_DAYS)
                            .warning(98.0)
                            .warningDisplay("98.0"));
                  }
                });

    try {
      SLOListResponse result = apiInstance.createSLO(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
