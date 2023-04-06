// Update an existing rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCase;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleMaxSignalDuration;
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

    // there is a valid "security_rule" in the system
    String SECURITY_RULE_ID = System.getenv("SECURITY_RULE_ID");

    SecurityMonitoringRuleUpdatePayload body =
        new SecurityMonitoringRuleUpdatePayload()
            .name("Example-Security-Monitoring-Updated")
            .queries(
                Collections.singletonList(
                    new SecurityMonitoringRuleQuery(
                        new SecurityMonitoringStandardRuleQuery()
                            .query("@test:true")
                            .aggregation(SecurityMonitoringRuleQueryAggregation.COUNT))))
            .cases(
                Collections.singletonList(
                    new SecurityMonitoringRuleCase()
                        .name("")
                        .status(SecurityMonitoringRuleSeverity.INFO)
                        .condition("a > 0")))
            .options(
                new SecurityMonitoringRuleOptions()
                    .evaluationWindow(SecurityMonitoringRuleEvaluationWindow.FIFTEEN_MINUTES)
                    .keepAlive(SecurityMonitoringRuleKeepAlive.ONE_HOUR)
                    .maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.ONE_DAY))
            .message("Test rule")
            .isEnabled(true);

    try {
      SecurityMonitoringRuleResponse result =
          apiInstance.updateSecurityMonitoringRule(SECURITY_RULE_ID, body);
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
