// List distinct metric volumes by metric name returns "Success" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.MetricVolumesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    try {
      MetricVolumesResponse result =
          apiInstance.listVolumesByMetricName("static_test_metric_donotdelete");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#listVolumesByMetricName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
