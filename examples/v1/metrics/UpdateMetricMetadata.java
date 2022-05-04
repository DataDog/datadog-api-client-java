// Edit metric metadata returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.MetricsApi;
import com.datadog.api.v1.client.model.MetricMetadata;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    MetricMetadata body = new MetricMetadata().perUnit("second").type("count").unit("byte");

    try {
      MetricMetadata result = apiInstance.updateMetricMetadata("metric_name", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#updateMetricMetadata");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
