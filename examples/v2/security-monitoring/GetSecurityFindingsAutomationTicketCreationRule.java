// Get a ticket creation rule returns "Successfully retrieved the ticket creation rule" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.TicketCreationRuleResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.getSecurityFindingsAutomationTicketCreationRule", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "valid_ticket_creation_rule" in the system
    UUID VALID_TICKET_CREATION_RULE_DATA_ID = null;
    try {
      VALID_TICKET_CREATION_RULE_DATA_ID =
          UUID.fromString(System.getenv("VALID_TICKET_CREATION_RULE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      TicketCreationRuleResponse result =
          apiInstance.getSecurityFindingsAutomationTicketCreationRule(
              VALID_TICKET_CREATION_RULE_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#getSecurityFindingsAutomationTicketCreationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
