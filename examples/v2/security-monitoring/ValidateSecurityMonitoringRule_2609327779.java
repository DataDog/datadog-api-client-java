// Validate a detection rule with detection method 'new_value' with enabled feature
// 'instantaneousBaseline' returns "OK"
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleDetectionMethod;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleNewValueOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleNewValueOptionsForgetAfter;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleNewValueOptionsLearningDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleNewValueOptionsLearningMethod;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleNewValueOptionsLearningThreshold;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryAggregation;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTypeCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleValidatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardDataSource;
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
                            .status(SecurityMonitoringRuleSeverity.INFO)))
                .hasExtendedTitle(true)
                .isEnabled(true)
                .message("My security monitoring rule")
                .name("My security monitoring rule")
                .options(
                    new SecurityMonitoringRuleOptions()
                        .evaluationWindow(SecurityMonitoringRuleEvaluationWindow.ZERO_MINUTES)
                        .keepAlive(SecurityMonitoringRuleKeepAlive.FIVE_MINUTES)
                        .maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.TEN_MINUTES)
                        .detectionMethod(SecurityMonitoringRuleDetectionMethod.NEW_VALUE)
                        .newValueOptions(
                            new SecurityMonitoringRuleNewValueOptions()
                                .forgetAfter(
                                    SecurityMonitoringRuleNewValueOptionsForgetAfter.ONE_WEEK)
                                .instantaneousBaseline(true)
                                .learningDuration(
                                    SecurityMonitoringRuleNewValueOptionsLearningDuration.ONE_DAY)
                                .learningThreshold(
                                    SecurityMonitoringRuleNewValueOptionsLearningThreshold
                                        .ZERO_OCCURRENCES)
                                .learningMethod(
                                    SecurityMonitoringRuleNewValueOptionsLearningMethod.DURATION)))
                .queries(
                    Collections.singletonList(
                        new SecurityMonitoringStandardRuleQuery()
                            .query("source:source_here")
                            .groupByFields(Collections.singletonList("@userIdentity.assumed_role"))
                            .metric("name")
                            .metrics(Collections.singletonList("name"))
                            .aggregation(SecurityMonitoringRuleQueryAggregation.NEW_VALUE)
                            .name("")
                            .dataSource(SecurityMonitoringStandardDataSource.LOGS)))
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
