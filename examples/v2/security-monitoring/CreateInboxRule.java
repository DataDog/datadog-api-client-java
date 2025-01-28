// Create a new inbox rule returns "Successfully created the inbox rule" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.ActionInbox;
import com.datadog.api.client.v2.model.AutomationRule;
import com.datadog.api.client.v2.model.CreateInboxRuleParameters;
import com.datadog.api.client.v2.model.CreateInboxRuleParametersData;
import com.datadog.api.client.v2.model.CreateInboxRuleParametersDataAttributes;
import com.datadog.api.client.v2.model.InboxRuleResponse;
import com.datadog.api.client.v2.model.InboxRulesType;
import com.datadog.api.client.v2.model.IssueType;
import com.datadog.api.client.v2.model.SecurityRuleSeverity;
import com.datadog.api.client.v2.model.SecurityRuleTypesItems;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    CreateInboxRuleParameters body =
        new CreateInboxRuleParameters()
            .data(
                new CreateInboxRuleParametersData()
                    .attributes(
                        new CreateInboxRuleParametersDataAttributes()
                            .action(
                                new ActionInbox()
                                    .reasonDescription("We want to focus on these items."))
                            .enabled(true)
                            .name("Rule 1")
                            .rule(
                                new AutomationRule()
                                    .issueType(IssueType.VULNERABILITY)
                                    .query("key:val")
                                    .ruleIds(Collections.singletonList("rule-id-1"))
                                    .ruleTypes(
                                        Collections.singletonList(
                                            SecurityRuleTypesItems.APPLICATION_CODE_VULNERABILITY))
                                    .severities(
                                        Collections.singletonList(SecurityRuleSeverity.CRITICAL))))
                    .type(InboxRulesType.INBOX_RULES));

    try {
      InboxRuleResponse result = apiInstance.createInboxRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createInboxRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
