// Create a cloud configuration rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.CloudConfigurationRuleCaseCreate;
import com.datadog.api.client.v2.model.CloudConfigurationRuleComplianceSignalOptions;
import com.datadog.api.client.v2.model.CloudConfigurationRuleCreatePayload;
import com.datadog.api.client.v2.model.CloudConfigurationRuleOptions;
import com.datadog.api.client.v2.model.CloudConfigurationRuleType;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleCreatePayload;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringRuleCreatePayload body =
        new SecurityMonitoringRuleCreatePayload(
            new CloudConfigurationRuleCreatePayload()
                .name("Example-Create_a_cloud_configuration_rule_returns_OK_response")
                .cases(
                    Collections.singletonList(
                        new CloudConfigurationRuleCaseCreate()
                            .status(SecurityMonitoringRuleSeverity.INFO)))
                .options(new CloudConfigurationRuleOptions())
                .complianceSignalOptions(
                    new CloudConfigurationRuleComplianceSignalOptions().userActivationStatus(false))
                .message("Test rule")
                .isEnabled(true)
                .type(CloudConfigurationRuleType.CLOUD_CONFIGURATION));

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
