// Delete a Product Analytics launch returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteProductAnalyticsLaunch", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    try {
      apiInstance.deleteProductAnalyticsLaunch("5e3c7a1b-2d4f-4e6a-8b9c-0d1e2f3a4b5c");
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAnalyticsApi#deleteProductAnalyticsLaunch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
