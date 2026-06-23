// Delete a variant returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    try {
      apiInstance.deleteVariantFromFeatureFlag(
          UUID.fromString("550e8400-e29b-41d4-a716-446655440000"),
          UUID.fromString("550e8400-e29b-41d4-a716-446655440002"));
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#deleteVariantFromFeatureFlag");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
