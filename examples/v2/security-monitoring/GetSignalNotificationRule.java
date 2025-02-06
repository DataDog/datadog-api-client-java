// Get details of a signal-based notification rule returns "Notification rule details." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.NotificationRuleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "valid_signal_notification_rule" in the system
    String VALID_SIGNAL_NOTIFICATION_RULE_DATA_ID =
        System.getenv("VALID_SIGNAL_NOTIFICATION_RULE_DATA_ID");

    try {
      NotificationRuleResponse result =
          apiInstance.getSignalNotificationRule(VALID_SIGNAL_NOTIFICATION_RULE_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#getSignalNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
