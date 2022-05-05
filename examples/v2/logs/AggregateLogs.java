// Aggregate events returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.LogsApi;
import com.datadog.api.v2.client.model.LogsAggregateRequest;
import com.datadog.api.v2.client.model.LogsAggregateResponse;
import com.datadog.api.v2.client.model.LogsQueryFilter;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsApi apiInstance = new LogsApi(defaultClient);

    LogsAggregateRequest body =
        new LogsAggregateRequest()
            .filter(
                new LogsQueryFilter()
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
