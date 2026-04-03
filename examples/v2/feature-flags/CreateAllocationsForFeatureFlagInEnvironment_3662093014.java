// Create allocation for a flag in an environment returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.AllocationDataRequest;
import com.datadog.api.client.v2.model.AllocationDataType;
import com.datadog.api.client.v2.model.AllocationResponse;
import com.datadog.api.client.v2.model.AllocationType;
import com.datadog.api.client.v2.model.CreateAllocationsRequest;
import com.datadog.api.client.v2.model.UpsertAllocationRequest;
import com.datadog.api.client.v2.model.VariantWeightRequest;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    // there is a valid "feature_flag" in the system
    UUID FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_0_ID = null;
    try {
      FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_0_ID =
          UUID.fromString(System.getenv("FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_0_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }
    UUID FEATURE_FLAG_DATA_ID = null;
    try {
      FEATURE_FLAG_DATA_ID = UUID.fromString(System.getenv("FEATURE_FLAG_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    // there is a valid "environment" in the system
    UUID ENVIRONMENT_DATA_ID = null;
    try {
      ENVIRONMENT_DATA_ID = UUID.fromString(System.getenv("ENVIRONMENT_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    CreateAllocationsRequest body =
        new CreateAllocationsRequest()
            .data(
                new AllocationDataRequest()
                    .type(AllocationDataType.ALLOCATIONS)
                    .attributes(
                        new UpsertAllocationRequest()
                            .name("New targeting rule Example-Feature-Flag")
                            .key("new-targeting-rule-example-feature-flag")
                            .variantWeights(
                                Collections.singletonList(
                                    new VariantWeightRequest()
                                        .variantId(FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_0_ID)
                                        .value(100.0)))
                            .type(AllocationType.CANARY)));

    try {
      AllocationResponse result =
          apiInstance.createAllocationsForFeatureFlagInEnvironment(
              FEATURE_FLAG_DATA_ID, ENVIRONMENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling FeatureFlagsApi#createAllocationsForFeatureFlagInEnvironment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
