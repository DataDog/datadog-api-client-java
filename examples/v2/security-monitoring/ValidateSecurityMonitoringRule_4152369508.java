// Validate a detection rule with detection method 'sequence_detection' returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleDetectionMethod;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryAggregation;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSequenceDetectionOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSequenceDetectionStep;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSequenceDetectionStepTransition;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTypeCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleValidatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRulePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRuleQuery;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringRuleValidatePayload body =
        new SecurityMonitoringRuleValidatePayload(
            new SecurityMonitoringStandardRulePayload()
                .cases(
                    Collections.singletonList(
                        new SecurityMonitoringRuleCaseCreate()
                            .name("")
                            .status(SecurityMonitoringRuleSeverity.INFO)
                            .condition("step_b > 0")))
                .hasExtendedTitle(true)
                .isEnabled(true)
                .message("My security monitoring rule")
                .name("My security monitoring rule")
                .options(
                    new SecurityMonitoringRuleOptions()
                        .evaluationWindow(SecurityMonitoringRuleEvaluationWindow.ZERO_MINUTES)
                        .keepAlive(SecurityMonitoringRuleKeepAlive.FIVE_MINUTES)
                        .maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.TEN_MINUTES)
                        .detectionMethod(SecurityMonitoringRuleDetectionMethod.SEQUENCE_DETECTION)
                        .sequenceDetectionOptions(
                            new SecurityMonitoringRuleSequenceDetectionOptions()
                                .stepTransitions(
                                    Collections.singletonList(
                                        new SecurityMonitoringRuleSequenceDetectionStepTransition()
                                            .child("step_b")
                                            .evaluationWindow(
                                                SecurityMonitoringRuleEvaluationWindow
                                                    .FIFTEEN_MINUTES)
                                            .parent("step_a")))
                                .steps(
                                    Arrays.asList(
                                        new SecurityMonitoringRuleSequenceDetectionStep()
                                            .condition("a > 0")
                                            .evaluationWindow(
                                                SecurityMonitoringRuleEvaluationWindow.ONE_MINUTE)
                                            .name("step_a"),
                                        new SecurityMonitoringRuleSequenceDetectionStep()
                                            .condition("b > 0")
                                            .evaluationWindow(
                                                SecurityMonitoringRuleEvaluationWindow.ONE_MINUTE)
                                            .name("step_b")))))
                .queries(
                    Arrays.asList(
                        new SecurityMonitoringStandardRuleQuery()
                            .query("source:source_here")
                            .groupByFields(Collections.singletonList("@userIdentity.assumed_role"))
                            .aggregation(SecurityMonitoringRuleQueryAggregation.COUNT)
                            .name(""),
                        new SecurityMonitoringStandardRuleQuery()
                            .query("source:source_here2")
                            .aggregation(SecurityMonitoringRuleQueryAggregation.COUNT)
                            .name("")))
                .tags(Arrays.asList("env:prod", "team:security"))
                .type(SecurityMonitoringRuleTypeCreate.LOG_DETECTION));

    try {
      apiInstance.validateSecurityMonitoringRule(body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#validateSecurityMonitoringRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
