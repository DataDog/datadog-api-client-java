// Create a cloud_configuration rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.CloudConfigurationComplianceRuleOptions;
import com.datadog.api.client.v2.model.CloudConfigurationRegoRule;
import com.datadog.api.client.v2.model.CloudConfigurationRuleCaseCreate;
import com.datadog.api.client.v2.model.CloudConfigurationRuleComplianceSignalOptions;
import com.datadog.api.client.v2.model.CloudConfigurationRuleCreatePayload;
import com.datadog.api.client.v2.model.CloudConfigurationRuleOptions;
import com.datadog.api.client.v2.model.CloudConfigurationRuleType;
import com.datadog.api.client.v2.model.SecurityMonitoringFilter;
import com.datadog.api.client.v2.model.SecurityMonitoringFilterAction;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringRuleCreatePayload body =
        new SecurityMonitoringRuleCreatePayload(
            new CloudConfigurationRuleCreatePayload()
                .type(CloudConfigurationRuleType.CLOUD_CONFIGURATION)
                .name("Example-Security-Monitoring_cloud")
                .isEnabled(false)
                .cases(
                    Collections.singletonList(
                        new CloudConfigurationRuleCaseCreate()
                            .status(SecurityMonitoringRuleSeverity.INFO)
                            .notifications(Collections.singletonList("channel"))))
                .options(
                    new CloudConfigurationRuleOptions()
                        .complianceRuleOptions(
                            new CloudConfigurationComplianceRuleOptions()
                                .resourceType("gcp_compute_disk")
                                .complexRule(false)
                                .regoRule(
                                    new CloudConfigurationRegoRule()
                                        .policy(
                                            """
package datadog

import data.datadog.output as dd_output

import future.keywords.contains
import future.keywords.if
import future.keywords.in

milliseconds_in_a_day := ((1000 * 60) * 60) * 24

eval(iam_service_account_key) = "skip" if {
	iam_service_account_key.disabled
} else = "pass" if {
	(iam_service_account_key.resource_seen_at / milliseconds_in_a_day) - (iam_service_account_key.valid_after_time / milliseconds_in_a_day) <= 90
} else = "fail"

# This part remains unchanged for all rules
results contains result if {
	some resource in input.resources[input.main_resource_type]
	result := dd_output.format(resource, eval(resource))
}

""")
                                        .resourceTypes(
                                            Collections.singletonList("gcp_compute_disk")))))
                .message("ddd")
                .tags(Collections.singletonList("my:tag"))
                .complianceSignalOptions(
                    new CloudConfigurationRuleComplianceSignalOptions()
                        .userActivationStatus(true)
                        .userGroupByFields(Collections.singletonList("@account_id")))
                .filters(
                    Arrays.asList(
                        new SecurityMonitoringFilter()
                            .action(SecurityMonitoringFilterAction.REQUIRE)
                            .query("resource_id:helo*"),
                        new SecurityMonitoringFilter()
                            .action(SecurityMonitoringFilterAction.SUPPRESS)
                            .query("control:helo*"))));

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
