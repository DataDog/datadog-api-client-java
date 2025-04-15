// Update a monitor notification rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MonitorsApi;
import com.datadog.api.client.v2.model.MonitorNotificationRuleAttributes;
import com.datadog.api.client.v2.model.MonitorNotificationRuleFilter;
import com.datadog.api.client.v2.model.MonitorNotificationRuleFilterTags;
import com.datadog.api.client.v2.model.MonitorNotificationRuleResourceType;
import com.datadog.api.client.v2.model.MonitorNotificationRuleResponse;
import com.datadog.api.client.v2.model.MonitorNotificationRuleUpdateRequest;
import com.datadog.api.client.v2.model.MonitorNotificationRuleUpdateRequestData;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateMonitorNotificationRule", true);
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    // there is a valid "monitor_notification_rule" in the system
    String MONITOR_NOTIFICATION_RULE_DATA_ID = System.getenv("MONITOR_NOTIFICATION_RULE_DATA_ID");

    MonitorNotificationRuleUpdateRequest body =
        new MonitorNotificationRuleUpdateRequest()
            .data(
                new MonitorNotificationRuleUpdateRequestData()
                    .attributes(
                        new MonitorNotificationRuleAttributes()
                            .filter(
                                new MonitorNotificationRuleFilter(
                                    new MonitorNotificationRuleFilterTags()
                                        .tags(Arrays.asList("test:example-monitor", "host:abc"))))
                            .name("updated rule")
                            .recipients(Collections.singletonList("slack-test-channel")))
                    .id(MONITOR_NOTIFICATION_RULE_DATA_ID)
                    .type(MonitorNotificationRuleResourceType.MONITOR_NOTIFICATION_RULE));

    try {
      MonitorNotificationRuleResponse result =
          apiInstance.updateMonitorNotificationRule(MONITOR_NOTIFICATION_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#updateMonitorNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
