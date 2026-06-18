// Update a ticket creation rule returns "Successfully updated the ticket creation rule" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AutomationRuleScope;
import com.datadog.api.client.v2.model.SecurityFindingType;
import com.datadog.api.client.v2.model.TicketCreationRuleAction;
import com.datadog.api.client.v2.model.TicketCreationRuleAttributesCreate;
import com.datadog.api.client.v2.model.TicketCreationRuleDataCreate;
import com.datadog.api.client.v2.model.TicketCreationRuleResponse;
import com.datadog.api.client.v2.model.TicketCreationRuleType;
import com.datadog.api.client.v2.model.TicketCreationRuleUpdateRequest;
import com.datadog.api.client.v2.model.TicketCreationTarget;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.updateSecurityFindingsAutomationTicketCreationRule", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "valid_ticket_creation_rule" in the system
    UUID VALID_TICKET_CREATION_RULE_DATA_ID = null;
    try {
      VALID_TICKET_CREATION_RULE_DATA_ID =
          UUID.fromString(System.getenv("VALID_TICKET_CREATION_RULE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    TicketCreationRuleUpdateRequest body =
        new TicketCreationRuleUpdateRequest()
            .data(
                new TicketCreationRuleDataCreate()
                    .attributes(
                        new TicketCreationRuleAttributesCreate()
                            .action(
                                new TicketCreationRuleAction()
                                    .maxTicketsPerDay(5L)
                                    .projectId(
                                        UUID.fromString("11111111-1111-1111-1111-111111111111"))
                                    .target(TicketCreationTarget.JIRA))
                            .enabled(false)
                            .name("Example-Security-Monitoring")
                            .rule(
                                new AutomationRuleScope()
                                    .findingTypes(
                                        Collections.singletonList(
                                            SecurityFindingType.MISCONFIGURATION))
                                    .query("env:staging")))
                    .type(TicketCreationRuleType.TICKET_CREATION_RULES));

    try {
      TicketCreationRuleResponse result =
          apiInstance.updateSecurityFindingsAutomationTicketCreationRule(
              VALID_TICKET_CREATION_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#updateSecurityFindingsAutomationTicketCreationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
