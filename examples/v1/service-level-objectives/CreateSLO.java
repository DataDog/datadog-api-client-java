// Create an SLO object returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.ServiceLevelObjectivesApi;
import com.datadog.api.client.v1.model.SLOListResponse;
import com.datadog.api.client.v1.model.ServiceLevelObjectiveQuery;
import com.datadog.api.client.v1.model.ServiceLevelObjectiveRequest;
import com.datadog.api.client.v1.model.SLOThreshold;
import com.datadog.api.client.v1.model.SLOTimeframe;
import com.datadog.api.client.v1.model.SLOType;
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
    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);

    ServiceLevelObjectiveRequest body = new ServiceLevelObjectiveRequest()
.type(SLOType.METRIC)
.description("string")
.groups(Arrays.asList("env:test", "role:mysql"))
.name("Example-Service-Level-Objective")
.query(new ServiceLevelObjectiveQuery()
.denominator("sum:httpservice.hits{!code:3xx}.as_count()")
.numerator("sum:httpservice.hits{code:2xx}.as_count()"))
.tags(Arrays.asList("env:prod", "app:core"))
.thresholds(Collections.singletonList(new SLOThreshold()
.target(97.0)
.targetDisplay("97.0")
.timeframe(SLOTimeframe.SEVEN_DAYS)
.warning(98.0)
.warningDisplay("98.0")))
.timeframe(SLOTimeframe.SEVEN_DAYS)
.targetThreshold(97.0)
.warningThreshold(98.0);

    try {
      SLOListResponse result = apiInstance.createSLO(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelObjectivesApi#createSLO");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}