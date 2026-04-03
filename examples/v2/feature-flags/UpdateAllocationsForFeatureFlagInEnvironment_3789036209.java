// Update targeting rules for a flag in an environment returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.AllocationDataRequest;
import com.datadog.api.client.v2.model.AllocationDataType;
import com.datadog.api.client.v2.model.AllocationType;
import com.datadog.api.client.v2.model.ExposureRolloutStepRequest;
import com.datadog.api.client.v2.model.ExposureScheduleRequest;
import com.datadog.api.client.v2.model.ListAllocationsResponse;
import com.datadog.api.client.v2.model.OverwriteAllocationsRequest;
import com.datadog.api.client.v2.model.RolloutOptionsRequest;
import com.datadog.api.client.v2.model.RolloutStrategy;
import com.datadog.api.client.v2.model.UpsertAllocationRequest;
import com.datadog.api.client.v2.model.VariantWeightRequest;
import java.util.Arrays;
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

    OverwriteAllocationsRequest body =
        new OverwriteAllocationsRequest()
            .data(
                Collections.singletonList(
                    new AllocationDataRequest()
                        .type(AllocationDataType.ALLOCATIONS)
                        .attributes(
                            new UpsertAllocationRequest()
                                .key("overwrite-allocation-example-feature-flag")
                                .name("New targeting rule Example-Feature-Flag")
                                .variantWeights(
                                    Collections.singletonList(
                                        new VariantWeightRequest()
                                            .variantId(FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_0_ID)
                                            .value(100.0)))
                                .exposureSchedule(
                                    new ExposureScheduleRequest()
                                        .rolloutOptions(
                                            new RolloutOptionsRequest()
                                                .strategy(RolloutStrategy.UNIFORM_INTERVALS)
                                                .autostart(false)
                                                .selectionIntervalMs(86400000L))
                                        .rolloutSteps(
                                            Arrays.asList(
                                                new ExposureRolloutStepRequest()
                                                    .exposureRatio(0.05)
                                                    .intervalMs(null)
                                                    .isPauseRecord(false)
                                                    .groupedStepIndex(0L),
                                                new ExposureRolloutStepRequest()
                                                    .exposureRatio(0.25)
                                                    .intervalMs(null)
                                                    .isPauseRecord(false)
                                                    .groupedStepIndex(1L),
                                                new ExposureRolloutStepRequest()
                                                    .exposureRatio(1.0)
                                                    .intervalMs(null)
                                                    .isPauseRecord(false)
                                                    .groupedStepIndex(2L))))
                                .type(AllocationType.CANARY))));

    try {
      ListAllocationsResponse result =
          apiInstance.updateAllocationsForFeatureFlagInEnvironment(
              FEATURE_FLAG_DATA_ID, ENVIRONMENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling FeatureFlagsApi#updateAllocationsForFeatureFlagInEnvironment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
