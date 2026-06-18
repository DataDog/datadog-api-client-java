// Create a ticket creation rule returns "Successfully created the ticket creation rule" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AutomationRuleScope;
import com.datadog.api.client.v2.model.SecurityFindingType;
import com.datadog.api.client.v2.model.TicketCreationRuleAction;
import com.datadog.api.client.v2.model.TicketCreationRuleAttributesCreate;
import com.datadog.api.client.v2.model.TicketCreationRuleCreateRequest;
import com.datadog.api.client.v2.model.TicketCreationRuleDataCreate;
import com.datadog.api.client.v2.model.TicketCreationRuleResponse;
import com.datadog.api.client.v2.model.TicketCreationRuleType;
import com.datadog.api.client.v2.model.TicketCreationTarget;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.createSecurityFindingsAutomationTicketCreationRule", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    TicketCreationRuleCreateRequest body =
        new TicketCreationRuleCreateRequest()
            .data(
                new TicketCreationRuleDataCreate()
                    .attributes(
                        new TicketCreationRuleAttributesCreate()
                            .action(
                                new TicketCreationRuleAction()
                                    .maxTicketsPerDay(10L)
                                    .projectId(
                                        UUID.fromString("11111111-1111-1111-1111-111111111111"))
                                    .target(TicketCreationTarget.JIRA))
                            .enabled(true)
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
          apiInstance.createSecurityFindingsAutomationTicketCreationRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#createSecurityFindingsAutomationTicketCreationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
