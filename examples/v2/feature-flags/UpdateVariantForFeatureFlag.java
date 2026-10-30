// Update a variant returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.UpdateVariantAttributes;
import com.datadog.api.client.v2.model.UpdateVariantData;
import com.datadog.api.client.v2.model.UpdateVariantRequest;
import com.datadog.api.client.v2.model.VariantDataType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    UpdateVariantRequest body =
        new UpdateVariantRequest()
            .data(
                new UpdateVariantData()
                    .attributes(
                        new UpdateVariantAttributes()
                            .name("Variant ABC123 Updated")
                            .value("new_value"))
                    .id(UUID.fromString("550e8400-e29b-41d4-a716-446655440002"))
                    .type(VariantDataType.VARIANTS));

    try {
      apiInstance.updateVariantForFeatureFlag(
          UUID.fromString("550e8400-e29b-41d4-a716-446655440000"),
          UUID.fromString("550e8400-e29b-41d4-a716-446655440002"),
          body);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#updateVariantForFeatureFlag");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
