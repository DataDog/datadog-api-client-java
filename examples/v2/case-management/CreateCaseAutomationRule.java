// Create an automation rule returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.AutomationRuleAction;
import com.datadog.api.client.v2.model.AutomationRuleActionData;
import com.datadog.api.client.v2.model.AutomationRuleActionType;
import com.datadog.api.client.v2.model.AutomationRuleCreate;
import com.datadog.api.client.v2.model.AutomationRuleCreateAttributes;
import com.datadog.api.client.v2.model.AutomationRuleCreateRequest;
import com.datadog.api.client.v2.model.AutomationRuleResponse;
import com.datadog.api.client.v2.model.AutomationRuleTrigger;
import com.datadog.api.client.v2.model.AutomationRuleTriggerData;
import com.datadog.api.client.v2.model.AutomationRuleTriggerType;
import com.datadog.api.client.v2.model.CaseAutomationRuleResourceType;
import com.datadog.api.client.v2.model.CaseAutomationRuleState;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    AutomationRuleCreateRequest body =
        new AutomationRuleCreateRequest()
            .data(
                new AutomationRuleCreate()
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
          apiInstance.createCaseAutomationRule("e555e290-ed65-49bd-ae18-8acbfcf18db7", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#createCaseAutomationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
