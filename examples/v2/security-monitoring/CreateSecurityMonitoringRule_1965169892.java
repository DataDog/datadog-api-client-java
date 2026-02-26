// Create a detection rule with type 'application_security 'returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseAction;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseActionOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseActionOptionsFlaggedIPType;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseActionType;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleDetectionMethod;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryAggregation;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTypeCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRuleQuery;
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

    SecurityMonitoringRuleCreatePayload body = new SecurityMonitoringRuleCreatePayload(
new SecurityMonitoringStandardRuleCreatePayload()
.type(SecurityMonitoringRuleTypeCreate.APPLICATION_SECURITY)
.name("Example-Security-Monitoring_appsec_rule")
.queries(Collections.singletonList(new SecurityMonitoringStandardRuleQuery()
.query("@appsec.security_activity:business_logic.users.login.failure")
.aggregation(SecurityMonitoringRuleQueryAggregation.COUNT)
.groupByFields(Arrays.asList("service", "@http.client_ip"))))
.cases(Collections.singletonList(new SecurityMonitoringRuleCaseCreate()
.name("")
.status(SecurityMonitoringRuleSeverity.INFO)
.condition("a > 100000")
.actions(Arrays.asList(new SecurityMonitoringRuleCaseAction()
.type(SecurityMonitoringRuleCaseActionType.BLOCK_IP)
.options(new SecurityMonitoringRuleCaseActionOptions()
.duration(900L)), new SecurityMonitoringRuleCaseAction()
.type(SecurityMonitoringRuleCaseActionType.USER_BEHAVIOR)
.options(new SecurityMonitoringRuleCaseActionOptions()
.userBehaviorName("behavior")), new SecurityMonitoringRuleCaseAction()
.type(SecurityMonitoringRuleCaseActionType.FLAG_IP)
.options(new SecurityMonitoringRuleCaseActionOptions()
.flaggedIpType(SecurityMonitoringRuleCaseActionOptionsFlaggedIPType.FLAGGED))))))
.options(new SecurityMonitoringRuleOptions()
.keepAlive(SecurityMonitoringRuleKeepAlive.ONE_HOUR)
.maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.ONE_DAY)
.evaluationWindow(SecurityMonitoringRuleEvaluationWindow.FIFTEEN_MINUTES)
.detectionMethod(SecurityMonitoringRuleDetectionMethod.THRESHOLD))
.isEnabled(true)
.message("Test rule")
.groupSignalsBy(Collections.singletonList("service")));

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