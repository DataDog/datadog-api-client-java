// Update a severity modifier rule returns "Successfully updated the severity modifier rule"
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AutomationRuleScope;
import com.datadog.api.client.v2.model.SecurityFindingType;
import com.datadog.api.client.v2.model.SeverityModifierRuleAction;
import com.datadog.api.client.v2.model.SeverityModifierRuleAttributesCreate;
import com.datadog.api.client.v2.model.SeverityModifierRuleDataCreate;
import com.datadog.api.client.v2.model.SeverityModifierRuleResponse;
import com.datadog.api.client.v2.model.SeverityModifierRuleSetAction;
import com.datadog.api.client.v2.model.SeverityModifierRuleSetActionType;
import com.datadog.api.client.v2.model.SeverityModifierRuleType;
import com.datadog.api.client.v2.model.SeverityModifierRuleUpdateRequest;
import com.datadog.api.client.v2.model.SeverityModifierSeverity;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.updateSecurityFindingsAutomationSeverityModifierRule", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "valid_severity_modifier_rule" in the system
    UUID VALID_SEVERITY_MODIFIER_RULE_DATA_ID = null;
    try {
      VALID_SEVERITY_MODIFIER_RULE_DATA_ID =
          UUID.fromString(System.getenv("VALID_SEVERITY_MODIFIER_RULE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    SeverityModifierRuleUpdateRequest body =
        new SeverityModifierRuleUpdateRequest()
            .data(
                new SeverityModifierRuleDataCreate()
                    .attributes(
                        new SeverityModifierRuleAttributesCreate()
                            .action(
                                new SeverityModifierRuleAction(
                                    new SeverityModifierRuleSetAction()
                                        .description("Lower severity for dev environment noise")
                                        .severity(SeverityModifierSeverity.LOW)
                                        .type(SeverityModifierRuleSetActionType.SET)))
                            .enabled(true)
                            .name("Downgrade misconfigurations in dev")
                            .rule(
                                new AutomationRuleScope()
                                    .findingTypes(
                                        Collections.singletonList(
                                            SecurityFindingType.MISCONFIGURATION))
                                    .query("env:prod team:platform")))
                    .type(SeverityModifierRuleType.SEVERITY_MODIFIER_RULES));

    try {
      SeverityModifierRuleResponse result =
          apiInstance.updateSecurityFindingsAutomationSeverityModifierRule(
              VALID_SEVERITY_MODIFIER_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#updateSecurityFindingsAutomationSeverityModifierRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
