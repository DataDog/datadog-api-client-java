// Aggregate compute events with group by returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsApi;
import com.datadog.api.client.v2.model.LogsAggregateRequest;
import com.datadog.api.client.v2.model.LogsAggregateResponse;
import com.datadog.api.client.v2.model.LogsAggregateSort;
import com.datadog.api.client.v2.model.LogsAggregateSortType;
import com.datadog.api.client.v2.model.LogsAggregationFunction;
import com.datadog.api.client.v2.model.LogsCompute;
import com.datadog.api.client.v2.model.LogsComputeType;
import com.datadog.api.client.v2.model.LogsGroupBy;
import com.datadog.api.client.v2.model.LogsGroupByMissing;
import com.datadog.api.client.v2.model.LogsQueryFilter;
import com.datadog.api.client.v2.model.LogsSortOrder;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
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
                                .metric("@duration"))));

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
