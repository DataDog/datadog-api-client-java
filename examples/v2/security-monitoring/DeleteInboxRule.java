// Delete an inbox rule returns "Rule successfully deleted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
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

    try {
      apiInstance.deleteInboxRule(VALID_INBOX_RULE_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#deleteInboxRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
