// Get a monitor notification rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MonitorsApi;
import com.datadog.api.client.v2.model.MonitorNotificationRuleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getMonitorNotificationRule", true);
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    // there is a valid "monitor_notification_rule" in the system
    String MONITOR_NOTIFICATION_RULE_DATA_ID = System.getenv("MONITOR_NOTIFICATION_RULE_DATA_ID");

    try {
      MonitorNotificationRuleResponse result =
          apiInstance.getMonitorNotificationRule(MONITOR_NOTIFICATION_RULE_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#getMonitorNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
