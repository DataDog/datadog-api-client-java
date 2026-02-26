// Get tag key cardinality details returns "Success" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.MetricTagCardinalitiesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    try {
      MetricTagCardinalitiesResponse result =
          apiInstance.getMetricTagCardinalityDetails("dist.http.endpoint.request");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#getMetricTagCardinalityDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
