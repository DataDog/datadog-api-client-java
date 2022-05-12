// Update an SLO returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.ServiceLevelObjectivesApi;
import com.datadog.api.v1.client.model.SLOListResponse;
import com.datadog.api.v1.client.model.SLOThreshold;
import com.datadog.api.v1.client.model.SLOTimeframe;
import com.datadog.api.v1.client.model.SLOType;
import com.datadog.api.v1.client.model.ServiceLevelObjective;
import com.datadog.api.v1.client.model.ServiceLevelObjectiveQuery;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);

    // there is a valid "slo" in the system
    String SLO_DATA_0_ID = System.getenv("SLO_DATA_0_ID");
    String SLO_DATA_0_NAME = System.getenv("SLO_DATA_0_NAME");

    ServiceLevelObjective body =
        new ServiceLevelObjective()
            .type(SLOType.METRIC)
            .name(SLO_DATA_0_NAME)
            .thresholds(
                Collections.singletonList(
                    new SLOThreshold()
                        .target(97.0)
                        .timeframe(SLOTimeframe.SEVEN_DAYS)
                        .warning(98.0)))
            .query(
                new ServiceLevelObjectiveQuery()
                    .numerator("sum:httpservice.hits{code:2xx}.as_count()")
                    .denominator("sum:httpservice.hits{!code:3xx}.as_count()"));

    try {
      SLOListResponse result = apiInstance.updateSLO(SLO_DATA_0_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelObjectivesApi#updateSLO");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
