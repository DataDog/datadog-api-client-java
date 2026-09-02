// Create a feature flag returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.CreateFeatureFlagAttributes;
import com.datadog.api.client.v2.model.CreateFeatureFlagData;
import com.datadog.api.client.v2.model.CreateFeatureFlagDataType;
import com.datadog.api.client.v2.model.CreateFeatureFlagRequest;
import com.datadog.api.client.v2.model.CreateFeatureFlagStalenessStatus;
import com.datadog.api.client.v2.model.CreateVariant;
import com.datadog.api.client.v2.model.FeatureFlagDistributionChannel;
import com.datadog.api.client.v2.model.FeatureFlagResponse;
import com.datadog.api.client.v2.model.ValueType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    CreateFeatureFlagRequest body =
        new CreateFeatureFlagRequest()
            .data(
                new CreateFeatureFlagData()
                    .type(CreateFeatureFlagDataType.FEATURE_FLAGS)
                    .attributes(
                        new CreateFeatureFlagAttributes()
                            .defaultVariantKey("variant-Example-Feature-Flag-1")
                            .distributionChannel(FeatureFlagDistributionChannel.SERVER)
                            .key("test-feature-flag-Example-Feature-Flag")
                            .name("Test Feature Flag Example-Feature-Flag")
                            .requireApproval(false)
                            .stalenessStatus(CreateFeatureFlagStalenessStatus.PERMANENT)
                            .tags(Collections.singletonList("env:api-client-test"))
                            .valueType(ValueType.BOOLEAN)
                            .variants(
                                Arrays.asList(
                                    new CreateVariant()
                                        .key("variant-Example-Feature-Flag-1")
                                        .name("Variant Example-Feature-Flag A")
                                        .value("true"),
                                    new CreateVariant()
                                        .key("variant-Example-Feature-Flag-2")
                                        .name("Variant Example-Feature-Flag B")
                                        .value("false")))));

    try {
      FeatureFlagResponse result = apiInstance.createFeatureFlag(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#createFeatureFlag");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
