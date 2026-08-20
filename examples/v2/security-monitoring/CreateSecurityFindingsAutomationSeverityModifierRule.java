// Create a severity modifier rule returns "Successfully created the severity modifier rule"
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AutomationRuleScope;
import com.datadog.api.client.v2.model.SecurityFindingType;
import com.datadog.api.client.v2.model.SeverityModifierRuleAction;
import com.datadog.api.client.v2.model.SeverityModifierRuleAttributesCreate;
import com.datadog.api.client.v2.model.SeverityModifierRuleCreateRequest;
import com.datadog.api.client.v2.model.SeverityModifierRuleDataCreate;
import com.datadog.api.client.v2.model.SeverityModifierRuleResponse;
import com.datadog.api.client.v2.model.SeverityModifierRuleSetAction;
import com.datadog.api.client.v2.model.SeverityModifierRuleSetActionType;
import com.datadog.api.client.v2.model.SeverityModifierRuleType;
import com.datadog.api.client.v2.model.SeverityModifierSeverity;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.createSecurityFindingsAutomationSeverityModifierRule", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SeverityModifierRuleCreateRequest body =
        new SeverityModifierRuleCreateRequest()
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
          apiInstance.createSecurityFindingsAutomationSeverityModifierRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#createSecurityFindingsAutomationSeverityModifierRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
