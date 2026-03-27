// Aggregate pipelines events returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CiVisibilityPipelinesApi;
import com.datadog.api.client.v2.model.CIAppPipelinesAnalyticsAggregateResponse;
import com.datadog.api.client.v2.model.CIAppAggregationFunction;
import com.datadog.api.client.v2.model.CIAppCompute;
import com.datadog.api.client.v2.model.CIAppComputeType;
import com.datadog.api.client.v2.model.CIAppGroupByTotal;
import com.datadog.api.client.v2.model.CIAppGroupByTotalBoolean;
import com.datadog.api.client.v2.model.CIAppPipelinesAggregateRequest;
import com.datadog.api.client.v2.model.CIAppPipelinesGroupBy;
import com.datadog.api.client.v2.model.CIAppPipelinesQueryFilter;
import com.datadog.api.client.v2.model.CIAppQueryOptions;
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
    CiVisibilityPipelinesApi apiInstance = new CiVisibilityPipelinesApi(defaultClient);

    CIAppPipelinesAggregateRequest body = new CIAppPipelinesAggregateRequest()
.compute(Collections.singletonList(new CIAppCompute()
.aggregation(CIAppAggregationFunction.PERCENTILE_90)
.metric("@duration")
.type(CIAppComputeType.TOTAL)))
.filter(new CIAppPipelinesQueryFilter()
.from("now-15m")
.query("@ci.provider.name:(gitlab OR github)")
.to("now"))
.groupBy(Collections.singletonList(new CIAppPipelinesGroupBy()
.facet("@ci.status")
.limit(10L)
.total(new CIAppGroupByTotal(
false))))
.options(new CIAppQueryOptions()
.timezone("GMT"));

    try {
      CIAppPipelinesAnalyticsAggregateResponse result = apiInstance.aggregateCIAppPipelineEvents(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVisibilityPipelinesApi#aggregateCIAppPipelineEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}