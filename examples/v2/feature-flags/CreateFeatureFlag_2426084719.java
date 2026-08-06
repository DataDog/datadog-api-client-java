// Create a feature flag with notification rule targets returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.CreateFeatureFlagAttributes;
import com.datadog.api.client.v2.model.CreateFeatureFlagData;
import com.datadog.api.client.v2.model.CreateFeatureFlagDataType;
import com.datadog.api.client.v2.model.CreateFeatureFlagRequest;
import com.datadog.api.client.v2.model.CreateVariant;
import com.datadog.api.client.v2.model.FeatureFlagResponse;
import com.datadog.api.client.v2.model.NotificationRuleTarget;
import com.datadog.api.client.v2.model.NotificationRuleTargetConfiguration;
import com.datadog.api.client.v2.model.NotificationRuleTargetType;
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
                            .description(
                                "Test feature flag with notification rule targets for BDD"
                                    + " scenarios")
                            .key("test-feature-flag-notify-Example-Feature-Flag")
                            .name("Test Feature Flag Notify Example-Feature-Flag")
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
                                        .value("false")))
                            .notificationRuleQuery("notification_type:rollout_started")
                            .ruleTargets(
                                Collections.singletonList(
                                    new NotificationRuleTarget()
                                        .type(NotificationRuleTargetType.SLACK_CHANNEL)
                                        .version(1L)
                                        .configuration(
                                            new NotificationRuleTargetConfiguration()
                                                .channel("#feature-flags-test")
                                                .workspace("datadoghq"))))));

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
