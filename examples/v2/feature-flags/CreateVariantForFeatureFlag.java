// Add a variant to a feature flag returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.CreateVariant;
import com.datadog.api.client.v2.model.Variant;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    CreateVariant body =
        new CreateVariant().key("variant-abc123").name("Variant ABC123").value("true");

    try {
      Variant result =
          apiInstance.createVariantForFeatureFlag(
              UUID.fromString("550e8400-e29b-41d4-a716-446655440000"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#createVariantForFeatureFlag");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
