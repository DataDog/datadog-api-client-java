// Create a detection rule with detection method 'sequence_detection' returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCreatePayload;
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
import com.datadog.api.client.v2.model.SecurityMonitoringStandardDataSource;
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
.name("Example-Security-Monitoring")
.type(SecurityMonitoringRuleTypeCreate.LOG_DETECTION)
.isEnabled(true)
.queries(Arrays.asList(new SecurityMonitoringStandardRuleQuery()
.aggregation(SecurityMonitoringRuleQueryAggregation.COUNT)
.dataSource(SecurityMonitoringStandardDataSource.LOGS)
.hasOptionalGroupByFields(false)
.name("")
.query("service:logs-rule-reducer source:paul test2"), new SecurityMonitoringStandardRuleQuery()
.aggregation(SecurityMonitoringRuleQueryAggregation.COUNT)
.dataSource(SecurityMonitoringStandardDataSource.LOGS)
.hasOptionalGroupByFields(false)
.name("")
.query("service:logs-rule-reducer source:paul test1")))
.cases(Collections.singletonList(new SecurityMonitoringRuleCaseCreate()
.name("")
.status(SecurityMonitoringRuleSeverity.INFO)
.condition("step_b > 0")))
.message("Logs and signals asdf")
.options(new SecurityMonitoringRuleOptions()
.detectionMethod(SecurityMonitoringRuleDetectionMethod.SEQUENCE_DETECTION)
.evaluationWindow(SecurityMonitoringRuleEvaluationWindow.ZERO_MINUTES)
.keepAlive(SecurityMonitoringRuleKeepAlive.FIVE_MINUTES)
.maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.TEN_MINUTES)
.sequenceDetectionOptions(new SecurityMonitoringRuleSequenceDetectionOptions()
.stepTransitions(Collections.singletonList(new SecurityMonitoringRuleSequenceDetectionStepTransition()
.child("step_b")
.evaluationWindow(SecurityMonitoringRuleEvaluationWindow.FIFTEEN_MINUTES)
.parent("step_a")))
.steps(Arrays.asList(new SecurityMonitoringRuleSequenceDetectionStep()
.condition("a > 0")
.evaluationWindow(SecurityMonitoringRuleEvaluationWindow.ONE_MINUTE)
.name("step_a"), new SecurityMonitoringRuleSequenceDetectionStep()
.condition("b > 0")
.evaluationWindow(SecurityMonitoringRuleEvaluationWindow.ONE_MINUTE)
.name("step_b"))))));

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