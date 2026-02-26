// Aggregate spans returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SpansApi;
import com.datadog.api.client.v2.model.SpansAggregateData;
import com.datadog.api.client.v2.model.SpansAggregateRequest;
import com.datadog.api.client.v2.model.SpansAggregateRequestAttributes;
import com.datadog.api.client.v2.model.SpansAggregateRequestType;
import com.datadog.api.client.v2.model.SpansAggregateResponse;
import com.datadog.api.client.v2.model.SpansAggregationFunction;
import com.datadog.api.client.v2.model.SpansCompute;
import com.datadog.api.client.v2.model.SpansComputeType;
import com.datadog.api.client.v2.model.SpansQueryFilter;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SpansApi apiInstance = new SpansApi(defaultClient);

    SpansAggregateRequest body =
        new SpansAggregateRequest()
            .data(
                new SpansAggregateData()
                    .attributes(
                        new SpansAggregateRequestAttributes()
                            .compute(
                                Collections.singletonList(
                                    new SpansCompute()
                                        .aggregation(SpansAggregationFunction.COUNT)
                                        .interval("5m")
                                        .type(SpansComputeType.TIMESERIES)))
                            .filter(new SpansQueryFilter().from("now-15m").query("*").to("now")))
                    .type(SpansAggregateRequestType.AGGREGATE_REQUEST));

    try {
      SpansAggregateResponse result = apiInstance.aggregateSpans(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpansApi#aggregateSpans");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
