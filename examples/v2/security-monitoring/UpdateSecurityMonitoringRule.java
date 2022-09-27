// Update an existing rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringFilter;
import com.datadog.api.client.v2.model.SecurityMonitoringFilterAction;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCase;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleDetectionMethod;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleHardcodedEvaluatorType;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleImpossibleTravelOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleNewValueOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleNewValueOptionsForgetAfter;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleNewValueOptionsLearningDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleNewValueOptionsLearningMethod;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleNewValueOptionsLearningThreshold;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQuery;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryAggregation;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleUpdatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRuleQuery;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringRuleUpdatePayload body =
        new SecurityMonitoringRuleUpdatePayload()
            .cases(
                Collections.singletonList(
                    new SecurityMonitoringRuleCase()
                        .status(SecurityMonitoringRuleSeverity.CRITICAL)))
            .filters(
                Collections.singletonList(
                    new SecurityMonitoringFilter().action(SecurityMonitoringFilterAction.REQUIRE)))
            .hasExtendedTitle(true)
            .options(
                new SecurityMonitoringRuleOptions()
                    .decreaseCriticalityBasedOnEnv(false)
                    .detectionMethod(SecurityMonitoringRuleDetectionMethod.THRESHOLD)
                    .evaluationWindow(SecurityMonitoringRuleEvaluationWindow.ZERO_MINUTES)
                    .hardcodedEvaluatorType(SecurityMonitoringRuleHardcodedEvaluatorType.LOG4SHELL)
                    .impossibleTravelOptions(
                        new SecurityMonitoringRuleImpossibleTravelOptions()
                            .baselineUserLocations(true))
                    .keepAlive(SecurityMonitoringRuleKeepAlive.ZERO_MINUTES)
                    .maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.ZERO_MINUTES)
                    .newValueOptions(
                        new SecurityMonitoringRuleNewValueOptions()
                            .forgetAfter(SecurityMonitoringRuleNewValueOptionsForgetAfter.ONE_DAY)
                            .learningDuration(
                                SecurityMonitoringRuleNewValueOptionsLearningDuration.ZERO_DAYS)
                            .learningMethod(
                                SecurityMonitoringRuleNewValueOptionsLearningMethod.DURATION)
                            .learningThreshold(
                                SecurityMonitoringRuleNewValueOptionsLearningThreshold
                                    .ZERO_OCCURRENCES)))
            .queries(
                Collections.singletonList(
                    new SecurityMonitoringRuleQuery(
                        new SecurityMonitoringStandardRuleQuery()
                            .aggregation(SecurityMonitoringRuleQueryAggregation.COUNT)
                            .query("a > 3"))))
            .version(1);

    try {
      SecurityMonitoringRuleResponse result =
          apiInstance.updateSecurityMonitoringRule("rule_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#updateSecurityMonitoringRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
