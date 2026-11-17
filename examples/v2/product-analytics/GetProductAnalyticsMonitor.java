// Get a Product Analytics monitor returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsMonitorResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getProductAnalyticsMonitor", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    try {
      ProductAnalyticsMonitorResponse result = apiInstance.getProductAnalyticsMonitor("12345");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAnalyticsApi#getProductAnalyticsMonitor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
