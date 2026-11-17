// Update a Product Analytics launch returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductAnalyticsApi;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchPatchAttributes;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchPatchData;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchPatchRequest;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchPhase;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchResponse;
import com.datadog.api.client.v2.model.ProductAnalyticsLaunchType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateProductAnalyticsLaunch", true);
    ProductAnalyticsApi apiInstance = new ProductAnalyticsApi(defaultClient);

    ProductAnalyticsLaunchPatchRequest body =
        new ProductAnalyticsLaunchPatchRequest()
            .data(
                new ProductAnalyticsLaunchPatchData()
                    .attributes(
                        new ProductAnalyticsLaunchPatchAttributes()
                            .phase(ProductAnalyticsLaunchPhase.SETUP))
                    .id("5e3c7a1b-2d4f-4e6a-8b9c-0d1e2f3a4b5c")
                    .type(ProductAnalyticsLaunchType.LIFTOFF));

    try {
      ProductAnalyticsLaunchResponse result =
          apiInstance.updateProductAnalyticsLaunch("5e3c7a1b-2d4f-4e6a-8b9c-0d1e2f3a4b5c", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAnalyticsApi#updateProductAnalyticsLaunch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
