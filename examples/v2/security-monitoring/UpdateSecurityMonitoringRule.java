// Update an existing rule returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;
import com.datadog.api.v2.client.model.SecurityMonitoringFilter;
import com.datadog.api.v2.client.model.SecurityMonitoringFilterAction;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleCase;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleDetectionMethod;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleHardcodedEvaluatorType;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleImpossibleTravelOptions;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleNewValueOptions;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleNewValueOptionsForgetAfter;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleNewValueOptionsLearningDuration;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleOptions;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleQuery;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleQueryAggregation;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleResponse;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleUpdatePayload;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
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
                                SecurityMonitoringRuleNewValueOptionsLearningDuration.ZERO_DAYS)))
            .queries(
                Collections.singletonList(
                    new SecurityMonitoringRuleQuery()
                        .aggregation(SecurityMonitoringRuleQueryAggregation.COUNT)))
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
