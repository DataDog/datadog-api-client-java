// Create a detection rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringReferenceTable;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCaseCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleQueryAggregation;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTypeCreate;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringStandardRuleQuery;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringRuleCreatePayload body =
        new SecurityMonitoringRuleCreatePayload(
            new SecurityMonitoringStandardRuleCreatePayload()
                .name("Example-Security-Monitoring")
                .queries(
                    Collections.singletonList(
                        new SecurityMonitoringStandardRuleQuery()
                            .query("@test:true")
                            .aggregation(SecurityMonitoringRuleQueryAggregation.COUNT)
                            .metric("")))
                .cases(
                    Collections.singletonList(
                        new SecurityMonitoringRuleCaseCreate()
                            .name("")
                            .status(SecurityMonitoringRuleSeverity.INFO)
                            .condition("a > 0")))
                .options(
                    new SecurityMonitoringRuleOptions()
                        .evaluationWindow(SecurityMonitoringRuleEvaluationWindow.FIFTEEN_MINUTES)
                        .keepAlive(SecurityMonitoringRuleKeepAlive.ONE_HOUR)
                        .maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.ONE_DAY))
                .message("Test rule")
                .isEnabled(true)
                .type(SecurityMonitoringRuleTypeCreate.LOG_DETECTION)
                .referenceTables(
                    Collections.singletonList(
                        new SecurityMonitoringReferenceTable()
                            .tableName("synthetics_test_reference_table_dont_delete")
                            .columnName("value")
                            .logFieldPath("testtag")
                            .checkPresence(true)
                            .ruleQueryName("a"))));

    try {
      SecurityMonitoringRuleResponse result = apiInstance.createSecurityMonitoringRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#createSecurityMonitoringRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
