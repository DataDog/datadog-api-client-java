// Patch an inbox rule returns "Inbox rule successfully patched" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.ActionInbox;
import com.datadog.api.client.v2.model.InboxRuleResponse;
import com.datadog.api.client.v2.model.InboxRulesType;
import com.datadog.api.client.v2.model.IssueType;
import com.datadog.api.client.v2.model.PatchInboxRulesParameters;
import com.datadog.api.client.v2.model.PatchInboxRulesParametersData;
import com.datadog.api.client.v2.model.PatchInboxRulesParametersDataAttributes;
import com.datadog.api.client.v2.model.Rule;
import com.datadog.api.client.v2.model.RuleSeverity;
import com.datadog.api.client.v2.model.RuleTypesItems;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "valid_inbox_rule" in the system
    UUID VALID_INBOX_RULE_DATA_ID = null;
    try {
      VALID_INBOX_RULE_DATA_ID = UUID.fromString(System.getenv("VALID_INBOX_RULE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    PatchInboxRulesParameters body =
        new PatchInboxRulesParameters()
            .data(
                new PatchInboxRulesParametersData()
                    .attributes(
                        new PatchInboxRulesParametersDataAttributes()
                            .action(
                                new ActionInbox()
                                    .reasonDescription("We want to focus on these items."))
                            .enabled(true)
                            .name("Rule 1")
                            .rule(
                                new Rule()
                                    .issueType(IssueType.VULNERABILITY)
                                    .query("key:val")
                                    .ruleIds(Collections.singletonList("rule-id-1"))
                                    .ruleTypes(
                                        Collections.singletonList(
                                            RuleTypesItems.APPLICATION_CODE_VULNERABILITY))
                                    .severities(Collections.singletonList(RuleSeverity.CRITICAL))))
                    .id(VALID_INBOX_RULE_DATA_ID)
                    .type(InboxRulesType.INBOX_RULES));

    try {
      InboxRuleResponse result = apiInstance.patchInboxRule(VALID_INBOX_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#patchInboxRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
