// Aggregate compute events returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.LogsApi;
import com.datadog.api.client.v2.model.LogsAggregateResponse;
import com.datadog.api.client.v2.model.LogsAggregateRequest;
import com.datadog.api.client.v2.model.LogsAggregationFunction;
import com.datadog.api.client.v2.model.LogsCompute;
import com.datadog.api.client.v2.model.LogsComputeType;
import com.datadog.api.client.v2.model.LogsQueryFilter;
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
    LogsApi apiInstance = new LogsApi(defaultClient);

    LogsAggregateRequest body = new LogsAggregateRequest()
.compute(Collections.singletonList(new LogsCompute()
.aggregation(LogsAggregationFunction.COUNT)
.interval("5m")
.type(LogsComputeType.TIMESERIES)))
.filter(new LogsQueryFilter()
.from("now-15m")
.indexes(Collections.singletonList("main"))
.query("*")
.to("now"));

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