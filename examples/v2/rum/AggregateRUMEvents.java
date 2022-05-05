// Aggregate RUM events returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.RumApi;
import com.datadog.api.v2.client.model.RUMAggregateRequest;
import com.datadog.api.v2.client.model.RUMAggregationFunction;
import com.datadog.api.v2.client.model.RUMAnalyticsAggregateResponse;
import com.datadog.api.v2.client.model.RUMCompute;
import com.datadog.api.v2.client.model.RUMComputeType;
import com.datadog.api.v2.client.model.RUMGroupBy;
import com.datadog.api.v2.client.model.RUMGroupByTotal;
import com.datadog.api.v2.client.model.RUMQueryFilter;
import com.datadog.api.v2.client.model.RUMQueryOptions;
import com.datadog.api.v2.client.model.RUMQueryPageOptions;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    RumApi apiInstance = new RumApi(defaultClient);

    RUMAggregateRequest body =
        new RUMAggregateRequest()
            .compute(
                Collections.singletonList(
                    new RUMCompute()
                        .aggregation(RUMAggregationFunction.PERCENTILE_90)
                        .metric("@view.time_spent")
                        .type(RUMComputeType.TOTAL)))
            .filter(
                new RUMQueryFilter()
                    .from("now-15m")
                    .query("@type:view AND @session.type:user")
                    .to("now"))
            .groupBy(
                Collections.singletonList(
                    new RUMGroupBy()
                        .facet("@view.time_spent")
                        .limit(10L)
                        .total(new RUMGroupByTotal(false))))
            .options(new RUMQueryOptions().timezone("GMT"))
            .page(new RUMQueryPageOptions().limit(25));

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
