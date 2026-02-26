// Delete a span-based metric returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SpansMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SpansMetricsApi apiInstance = new SpansMetricsApi(defaultClient);

    // there is a valid "spans_metric" in the system
    String SPANS_METRIC_DATA_ID = System.getenv("SPANS_METRIC_DATA_ID");

    try {
      apiInstance.deleteSpansMetric(SPANS_METRIC_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpansMetricsApi#deleteSpansMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
