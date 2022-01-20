// Create a detection rule returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.CloudSiemApi;
import com.datadog.api.v2.client.model.SecurityMonitoringFilter;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleCaseCreate;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleEvaluationWindow;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleKeepAlive;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleMaxSignalDuration;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleOptions;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleQueryAggregation;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleQueryCreate;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleResponse;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleSeverity;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    CloudSiemApi apiInstance = new CloudSiemApi(defaultClient);

    SecurityMonitoringRuleCreatePayload body =
        new SecurityMonitoringRuleCreatePayload()
            .name("Example-Create_a_detection_rule_returns_OK_response")
            .queries(
                new ArrayList<SecurityMonitoringRuleQueryCreate>() {
                  {
                    add(
                        new SecurityMonitoringRuleQueryCreate()
                            .query("@test:true")
                            .aggregation(SecurityMonitoringRuleQueryAggregation.COUNT)
                            .groupByFields(
                                new ArrayList<String>() {
                                  {
                                    ;
                                  }
                                })
                            .distinctFields(
                                new ArrayList<String>() {
                                  {
                                    ;
                                  }
                                })
                            .metric(""));
                  }
                })
            .filters(
                new ArrayList<SecurityMonitoringFilter>() {
                  {
                    ;
                  }
                })
            .cases(
                new ArrayList<SecurityMonitoringRuleCaseCreate>() {
                  {
                    add(
                        new SecurityMonitoringRuleCaseCreate()
                            .name("")
                            .status(SecurityMonitoringRuleSeverity.INFO)
                            .condition("a > 0")
                            .notifications(
                                new ArrayList<String>() {
                                  {
                                    ;
                                  }
                                }));
                  }
                })
            .options(
                new SecurityMonitoringRuleOptions()
                    .evaluationWindow(SecurityMonitoringRuleEvaluationWindow.FIFTEEN_MINUTES)
                    .keepAlive(SecurityMonitoringRuleKeepAlive.ONE_HOUR)
                    .maxSignalDuration(SecurityMonitoringRuleMaxSignalDuration.ONE_DAY))
            .message("Test rule")
            .tags(
                new ArrayList<String>() {
                  {
                    ;
                  }
                })
            .isEnabled(true);

    try {
      SecurityMonitoringRuleResponse result = apiInstance.createSecurityMonitoringRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudSiemApi#createSecurityMonitoringRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
