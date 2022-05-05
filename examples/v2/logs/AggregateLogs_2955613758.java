// Aggregate compute events with group by returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.LogsApi;
import com.datadog.api.v2.client.model.LogsAggregateRequest;
import com.datadog.api.v2.client.model.LogsAggregateResponse;
import com.datadog.api.v2.client.model.LogsAggregateSort;
import com.datadog.api.v2.client.model.LogsAggregateSortType;
import com.datadog.api.v2.client.model.LogsAggregationFunction;
import com.datadog.api.v2.client.model.LogsCompute;
import com.datadog.api.v2.client.model.LogsComputeType;
import com.datadog.api.v2.client.model.LogsGroupBy;
import com.datadog.api.v2.client.model.LogsGroupByMissing;
import com.datadog.api.v2.client.model.LogsGroupByTotal;
import com.datadog.api.v2.client.model.LogsQueryFilter;
import com.datadog.api.v2.client.model.LogsSortOrder;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsApi apiInstance = new LogsApi(defaultClient);

    LogsAggregateRequest body =
        new LogsAggregateRequest()
            .compute(
                Collections.singletonList(
                    new LogsCompute()
                        .aggregation(LogsAggregationFunction.COUNT)
                        .interval("5m")
                        .type(LogsComputeType.TIMESERIES)))
            .filter(
                new LogsQueryFilter()
                    .from("now-15m")
                    .indexes(Collections.singletonList("main"))
                    .query("*")
                    .to("now"))
            .groupBy(
                Collections.singletonList(
                    new LogsGroupBy()
                        .facet("host")
                        .missing(new LogsGroupByMissing("miss"))
                        .sort(
                            new LogsAggregateSort()
                                .type(LogsAggregateSortType.MEASURE)
                                .order(LogsSortOrder.ASCENDING)
                                .aggregation(LogsAggregationFunction.PERCENTILE_90)
                                .metric("@duration"))
                        .total(new LogsGroupByTotal("recall"))));

    try {
      LogsAggregateResponse result = apiInstance.aggregateLogs(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#aggregateLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
