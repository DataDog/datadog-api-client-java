// Add a variant to a feature flag returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.CreateVariant;
import com.datadog.api.client.v2.model.CreateVariantData;
import com.datadog.api.client.v2.model.CreateVariantRequest;
import com.datadog.api.client.v2.model.VariantDataType;
import com.datadog.api.client.v2.model.VariantResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    CreateVariantRequest body =
        new CreateVariantRequest()
            .data(
                new CreateVariantData()
                    .attributes(
                        new CreateVariant()
                            .key("variant-abc123")
                            .name("Variant ABC123")
                            .value("true"))
                    .type(VariantDataType.VARIANTS));

    try {
      VariantResponse result =
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
