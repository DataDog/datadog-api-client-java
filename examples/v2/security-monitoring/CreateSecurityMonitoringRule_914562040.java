// Create a detection rule with type 'signal_correlation' returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryAggregation;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalRuleQuery;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalRuleType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "security_rule" in the system
    String SECURITY_RULE_ID = System.getenv("SECURITY_RULE_ID");

    // there is a valid "security_rule_bis" in the system
    String SECURITY_RULE_BIS_ID = System.getenv("SECURITY_RULE_BIS_ID");

    SecurityMonitoringRuleCreatePayload body = new SecurityMonitoringRuleCreatePayload(
new SecurityMonitoringSignalRuleCreatePayload()
.name("Example-Security-Monitoring_signal_rule")
.queries(Arrays.asList(new SecurityMonitoringSignalRuleQuery()
.ruleId(SECURITY_RULE_ID)
.aggregation(SecurityMonitoringRuleQueryAggregation.EVENT_COUNT)
.correlatedByFields(Collections.singletonList("host"))
.correlatedQueryIndex(1), new SecurityMonitoringSignalRuleQuery()
.ruleId(SECURITY_RULE_BIS_ID)
.aggregation(SecurityMonitoringRuleQueryAggregation.EVENT_COUNT)
.correlatedByFields(Collections.singletonList("host"))))
.cases(Collections.singletonList(new SecurityMonitoringRuleCaseCreate()
.name("")
.status(SecurityMonitoringRuleSeverity.INFO)
.condition("a > 0 && b > 0")))
.options(new SecurityMonitoringRuleOptions()
.evaluationWindow(SecurityMonitoringRuleEvaluationWindow.FIFTEEN_MINUTES)
.keepAlive(SecurityMonitoringRuleKeepAlive.ONE_HOUR)
.maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.ONE_DAY))
.message("Test signal correlation rule")
.isEnabled(true)
.type(SecurityMonitoringSignalRuleType.SIGNAL_CORRELATION));

    try {
      SecurityMonitoringRuleResponse result = apiInstance.createSecurityMonitoringRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createSecurityMonitoringRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}