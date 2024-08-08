// Aggregate RUM events returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RumApi;
import com.datadog.api.client.v2.model.RUMAnalyticsAggregateResponse;
import com.datadog.api.client.v2.model.RUMAggregateRequest;
import com.datadog.api.client.v2.model.RUMAggregationFunction;
import com.datadog.api.client.v2.model.RUMCompute;
import com.datadog.api.client.v2.model.RUMComputeType;
import com.datadog.api.client.v2.model.RUMGroupBy;
import com.datadog.api.client.v2.model.RUMGroupByTotal;
import com.datadog.api.client.v2.model.RUMGroupByTotalBoolean;
import com.datadog.api.client.v2.model.RUMQueryFilter;
import com.datadog.api.client.v2.model.RUMQueryOptions;
import com.datadog.api.client.v2.model.RUMQueryPageOptions;
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
    RumApi apiInstance = new RumApi(defaultClient);

    RUMAggregateRequest body = new RUMAggregateRequest()
.compute(Collections.singletonList(new RUMCompute()
.aggregation(RUMAggregationFunction.PERCENTILE_90)
.metric("@view.time_spent")
.type(RUMComputeType.TOTAL)))
.filter(new RUMQueryFilter()
.from("now-15m")
.query("@type:view AND @session.type:user")
.to("now"))
.groupBy(Collections.singletonList(new RUMGroupBy()
.facet("@view.time_spent")
.limit(10L)
.total(new RUMGroupByTotal(
false))))
.options(new RUMQueryOptions()
.timezone("GMT"))
.page(new RUMQueryPageOptions()
.limit(25));

    try {
      RUMAnalyticsAggregateResponse result = apiInstance.aggregateRUMEvents(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumApi#aggregateRUMEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}