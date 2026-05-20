// Update an automation rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.AutomationRuleAction;
import com.datadog.api.client.v2.model.AutomationRuleActionData;
import com.datadog.api.client.v2.model.AutomationRuleActionType;
import com.datadog.api.client.v2.model.AutomationRuleCreateAttributes;
import com.datadog.api.client.v2.model.AutomationRuleResponse;
import com.datadog.api.client.v2.model.AutomationRuleTrigger;
import com.datadog.api.client.v2.model.AutomationRuleTriggerData;
import com.datadog.api.client.v2.model.AutomationRuleTriggerType;
import com.datadog.api.client.v2.model.AutomationRuleUpdate;
import com.datadog.api.client.v2.model.AutomationRuleUpdateRequest;
import com.datadog.api.client.v2.model.CaseAutomationRuleResourceType;
import com.datadog.api.client.v2.model.CaseAutomationRuleState;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateCaseAutomationRule", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    AutomationRuleUpdateRequest body =
        new AutomationRuleUpdateRequest()
            .data(
                new AutomationRuleUpdate()
                    .attributes(
                        new AutomationRuleCreateAttributes()
                            .action(
                                new AutomationRuleAction()
                                    .data(
                                        new AutomationRuleActionData()
                                            .handle("workflow-handle-123"))
                                    .type(AutomationRuleActionType.EXECUTE_WORKFLOW))
                            .name("Auto-assign workflow")
                            .state(CaseAutomationRuleState.ENABLED)
                            .trigger(
                                new AutomationRuleTrigger()
                                    .data(new AutomationRuleTriggerData())
                                    .type(AutomationRuleTriggerType.CASE_CREATED)))
                    .type(CaseAutomationRuleResourceType.RULE));

    try {
      AutomationRuleResponse result =
          apiInstance.updateCaseAutomationRule(
              "e555e290-ed65-49bd-ae18-8acbfcf18db7", "e6773723-fe58-49ff-9975-dff00f14e28d", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateCaseAutomationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
