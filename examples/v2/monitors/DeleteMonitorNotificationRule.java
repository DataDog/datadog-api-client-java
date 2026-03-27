// Delete a monitor notification rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MonitorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    // there is a valid "monitor_notification_rule" in the system
    String MONITOR_NOTIFICATION_RULE_DATA_ID = System.getenv("MONITOR_NOTIFICATION_RULE_DATA_ID");

    try {
      apiInstance.deleteMonitorNotificationRule(MONITOR_NOTIFICATION_RULE_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#deleteMonitorNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
