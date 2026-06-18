// Reorder ticket creation rules returns "Successfully reordered the ticket creation rules" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.TicketCreationRuleReorderItem;
import com.datadog.api.client.v2.model.TicketCreationRuleReorderRequest;
import com.datadog.api.client.v2.model.TicketCreationRuleType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.reorderSecurityFindingsAutomationTicketCreationRules", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "valid_ticket_creation_rule" in the system
    UUID VALID_TICKET_CREATION_RULE_DATA_ID = null;
    try {
      VALID_TICKET_CREATION_RULE_DATA_ID =
          UUID.fromString(System.getenv("VALID_TICKET_CREATION_RULE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    TicketCreationRuleReorderRequest body =
        new TicketCreationRuleReorderRequest()
            .data(
                Collections.singletonList(
                    new TicketCreationRuleReorderItem()
                        .id(VALID_TICKET_CREATION_RULE_DATA_ID)
                        .type(TicketCreationRuleType.TICKET_CREATION_RULES)));

    try {
      TicketCreationRuleReorderRequest result =
          apiInstance.reorderSecurityFindingsAutomationTicketCreationRules(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#reorderSecurityFindingsAutomationTicketCreationRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
