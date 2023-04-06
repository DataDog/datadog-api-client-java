// Update a cloud configuration rule's details returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.CloudConfigurationComplianceRuleOptions;
import com.datadog.api.client.v2.model.CloudConfigurationRegoRule;
import com.datadog.api.client.v2.model.CloudConfigurationRuleComplianceSignalOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCase;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleOptions;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleUpdatePayload;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "cloud_configuration_rule" in the system
    String CLOUD_CONFIGURATION_RULE_ID = System.getenv("CLOUD_CONFIGURATION_RULE_ID");

    SecurityMonitoringRuleUpdatePayload body =
        new SecurityMonitoringRuleUpdatePayload()
            .name("Example-Security-Monitoring_cloud_updated")
            .isEnabled(false)
            .cases(
                Collections.singletonList(
                    new SecurityMonitoringRuleCase().status(SecurityMonitoringRuleSeverity.INFO)))
            .options(
                new SecurityMonitoringRuleOptions()
                    .complianceRuleOptions(
                        new CloudConfigurationComplianceRuleOptions()
                            .resourceType("gcp_compute_disk")
                            .regoRule(
                                new CloudConfigurationRegoRule()
                                    .policy("""
package datadog

""")
                                    .resourceTypes(Collections.singletonList("gcp_compute_disk")))))
            .message("ddd")
            .complianceSignalOptions(
                new CloudConfigurationRuleComplianceSignalOptions().userActivationStatus(false));

    try {
      SecurityMonitoringRuleResponse result =
          apiInstance.updateSecurityMonitoringRule(CLOUD_CONFIGURATION_RULE_ID, body);
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
