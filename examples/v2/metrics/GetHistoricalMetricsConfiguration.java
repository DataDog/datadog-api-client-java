// Get a historical metrics configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.HistoricalMetricsConfigurationResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getHistoricalMetricsConfiguration", true);
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    try {
      HistoricalMetricsConfigurationResponse result =
          apiInstance.getHistoricalMetricsConfiguration("dist.http.endpoint.request");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#getHistoricalMetricsConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
