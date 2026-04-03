// Update targeting rules for a flag returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.AllocationDataRequest;
import com.datadog.api.client.v2.model.AllocationDataType;
import com.datadog.api.client.v2.model.AllocationType;
import com.datadog.api.client.v2.model.ConditionOperator;
import com.datadog.api.client.v2.model.ConditionRequest;
import com.datadog.api.client.v2.model.ExposureRolloutStepRequest;
import com.datadog.api.client.v2.model.ExposureScheduleRequest;
import com.datadog.api.client.v2.model.GuardrailMetricRequest;
import com.datadog.api.client.v2.model.GuardrailTriggerAction;
import com.datadog.api.client.v2.model.ListAllocationsResponse;
import com.datadog.api.client.v2.model.OverwriteAllocationsRequest;
import com.datadog.api.client.v2.model.RolloutOptionsRequest;
import com.datadog.api.client.v2.model.RolloutStrategy;
import com.datadog.api.client.v2.model.TargetingRuleRequest;
import com.datadog.api.client.v2.model.UpsertAllocationRequest;
import com.datadog.api.client.v2.model.VariantWeightRequest;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    OverwriteAllocationsRequest body =
        new OverwriteAllocationsRequest()
            .data(
                Collections.singletonList(
                    new AllocationDataRequest()
                        .attributes(
                            new UpsertAllocationRequest()
                                .experimentId("550e8400-e29b-41d4-a716-446655440030")
                                .exposureSchedule(
                                    new ExposureScheduleRequest()
                                        .absoluteStartTime(
                                            OffsetDateTime.parse("2025-06-13T12:00:00Z"))
                                        .controlVariantId("550e8400-e29b-41d4-a716-446655440012")
                                        .controlVariantKey("control")
                                        .id(UUID.fromString("550e8400-e29b-41d4-a716-446655440010"))
                                        .rolloutOptions(
                                            new RolloutOptionsRequest()
                                                .autostart(false)
                                                .selectionIntervalMs(3600000L)
                                                .strategy(RolloutStrategy.UNIFORM_INTERVALS))
                                        .rolloutSteps(
                                            Collections.singletonList(
                                                new ExposureRolloutStepRequest()
                                                    .exposureRatio(0.5)
                                                    .groupedStepIndex(1L)
                                                    .id(
                                                        UUID.fromString(
                                                            "550e8400-e29b-41d4-a716-446655440040"))
                                                    .intervalMs(3600000L)
                                                    .isPauseRecord(false))))
                                .guardrailMetrics(
                                    Collections.singletonList(
                                        new GuardrailMetricRequest()
                                            .metricId("metric-error-rate")
                                            .triggerAction(GuardrailTriggerAction.PAUSE)))
                                .id(UUID.fromString("550e8400-e29b-41d4-a716-446655440020"))
                                .key("prod-rollout")
                                .name("Production Rollout")
                                .targetingRules(
                                    Collections.singletonList(
                                        new TargetingRuleRequest()
                                            .conditions(
                                                Collections.singletonList(
                                                    new ConditionRequest()
                                                        .attribute("user_tier")
                                                        .operator(ConditionOperator.ONE_OF)
                                                        .value(
                                                            Arrays.asList(
                                                                "premium", "enterprise"))))))
                                .type(AllocationType.FEATURE_GATE)
                                .variantWeights(
                                    Collections.singletonList(
                                        new VariantWeightRequest()
                                            .value(50.0)
                                            .variantId(
                                                UUID.fromString(
                                                    "550e8400-e29b-41d4-a716-446655440001"))
                                            .variantKey("control"))))
                        .type(AllocationDataType.ALLOCATIONS)));

    try {
      ListAllocationsResponse result =
          apiInstance.updateAllocationsForFeatureFlagInEnvironment(
              UUID.fromString("550e8400-e29b-41d4-a716-446655440000"),
              UUID.fromString("550e8400-e29b-41d4-a716-446655440001"),
              body);
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
