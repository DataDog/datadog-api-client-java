// Delete a notification rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "notification_rule" in the system
    String NOTIFICATION_RULE_DATA_ID = System.getenv("NOTIFICATION_RULE_DATA_ID");

    try {
      apiInstance.deleteSecurityMonitoringNotificationRule(NOTIFICATION_RULE_DATA_ID);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#deleteSecurityMonitoringNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
