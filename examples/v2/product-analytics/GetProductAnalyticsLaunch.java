// Get a Product Analytics launch returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getProductAnalyticsLaunch", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    try {
      ProductAnalyticsLaunchResponse result =
          apiInstance.getProductAnalyticsLaunch("5e3c7a1b-2d4f-4e6a-8b9c-0d1e2f3a4b5c");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAnalyticsApi#getProductAnalyticsLaunch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
