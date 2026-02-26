// Update a cloud configuration rule's details returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleResponse;
import com.datadog.api.client.v2.model.CloudConfigurationComplianceRuleOptions;
import com.datadog.api.client.v2.model.CloudConfigurationRegoRule;
import com.datadog.api.client.v2.model.CloudConfigurationRuleComplianceSignalOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCase;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleUpdatePayload;
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

    // there is a valid "cloud_configuration_rule" in the system
    String CLOUD_CONFIGURATION_RULE_ID = System.getenv("CLOUD_CONFIGURATION_RULE_ID");

    SecurityMonitoringRuleUpdatePayload body = new SecurityMonitoringRuleUpdatePayload()
.name("Example-Security-Monitoring_cloud_updated")
.isEnabled(false)
.cases(Collections.singletonList(new SecurityMonitoringRuleCase()
.status(SecurityMonitoringRuleSeverity.INFO)))
.options(new SecurityMonitoringRuleOptions()
.complianceRuleOptions(new CloudConfigurationComplianceRuleOptions()
.resourceType("gcp_compute_disk")
.regoRule(new CloudConfigurationRegoRule()
.policy("""
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
.resourceTypes(Collections.singletonList("gcp_compute_disk")))))
.message("ddd")
.complianceSignalOptions(new CloudConfigurationRuleComplianceSignalOptions()
.userActivationStatus(false));

    try {
      SecurityMonitoringRuleResponse result = apiInstance.updateSecurityMonitoringRule(CLOUD_CONFIGURATION_RULE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#updateSecurityMonitoringRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}