// Update an inbox rule returns "Successfully updated the inbox rule" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AutomationRuleScope;
import com.datadog.api.client.v2.model.InboxRuleAction;
import com.datadog.api.client.v2.model.InboxRuleAttributesCreate;
import com.datadog.api.client.v2.model.InboxRuleDataUpdate;
import com.datadog.api.client.v2.model.InboxRuleResponse;
import com.datadog.api.client.v2.model.InboxRuleType;
import com.datadog.api.client.v2.model.InboxRuleUpdateRequest;
import com.datadog.api.client.v2.model.SecurityFindingType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateSecurityFindingsAutomationInboxRule", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "valid_inbox_rule" in the system
    UUID VALID_INBOX_RULE_DATA_ID = null;
    try {
      VALID_INBOX_RULE_DATA_ID = UUID.fromString(System.getenv("VALID_INBOX_RULE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    InboxRuleUpdateRequest body =
        new InboxRuleUpdateRequest()
            .data(
                new InboxRuleDataUpdate()
                    .attributes(
                        new InboxRuleAttributesCreate()
                            .action(new InboxRuleAction().description("Needs triage"))
                            .enabled(false)
                            .name("Example-Security-Monitoring")
                            .rule(
                                new AutomationRuleScope()
                                    .findingTypes(
                                        Collections.singletonList(
                                            SecurityFindingType.MISCONFIGURATION))
                                    .query("env:staging")))
                    .id(VALID_INBOX_RULE_DATA_ID)
                    .type(InboxRuleType.INBOX_RULES));

    try {
      InboxRuleResponse result =
          apiInstance.updateSecurityFindingsAutomationInboxRule(VALID_INBOX_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#updateSecurityFindingsAutomationInboxRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
