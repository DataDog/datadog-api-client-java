// Test a rule returns "OK" response

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
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryPayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryPayloadData;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTestPayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTestRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTestResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTypeTest;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRuleQuery;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRuleTestPayload;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringRuleTestRequest body =
        new SecurityMonitoringRuleTestRequest()
            .rule(
                new SecurityMonitoringRuleTestPayload(
                    new SecurityMonitoringStandardRuleTestPayload()
                        .cases(
                            Collections.singletonList(
                                new SecurityMonitoringRuleCaseCreate()
                                    .name("")
                                    .status(SecurityMonitoringRuleSeverity.INFO)
                                    .condition("a > 0")))
                        .hasExtendedTitle(true)
                        .isEnabled(true)
                        .message("My security monitoring rule message.")
                        .name("My security monitoring rule.")
                        .options(
                            new SecurityMonitoringRuleOptions()
                                .decreaseCriticalityBasedOnEnv(false)
                                .detectionMethod(SecurityMonitoringRuleDetectionMethod.THRESHOLD)
                                .evaluationWindow(
                                    SecurityMonitoringRuleEvaluationWindow.ZERO_MINUTES)
                                .keepAlive(SecurityMonitoringRuleKeepAlive.ZERO_MINUTES)
                                .maxSignalDuration(
                                    SecurityMonitoringRuleMaxSignalDuration.ZERO_MINUTES))
                        .queries(
                            Collections.singletonList(
                                new SecurityMonitoringStandardRuleQuery()
                                    .query("source:source_here")
                                    .groupByFields(
                                        Collections.singletonList("@userIdentity.assumed_role"))
                                    .aggregation(SecurityMonitoringRuleQueryAggregation.COUNT)
                                    .name("")))
                        .tags(Arrays.asList("env:prod", "team:security"))
                        .type(SecurityMonitoringRuleTypeTest.LOG_DETECTION)))
            .ruleQueryPayloads(
                Collections.singletonList(
                    new SecurityMonitoringRuleQueryPayload()
                        .expectedResult(true)
                        .index(0L)
                        .payload(
                            new SecurityMonitoringRuleQueryPayloadData()
                                .ddsource("source_here")
                                .ddtags("env:staging,version:5.1")
                                .hostname("i-012345678")
                                .message(
                                    "2019-11-19T14:37:58,995 INFO [process.name][20081] Hello"
                                        + " World")
                                .service("payment"))));

    try {
      SecurityMonitoringRuleTestResponse result = apiInstance.testSecurityMonitoringRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#testSecurityMonitoringRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
