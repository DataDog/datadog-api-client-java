// Create a monitor notification rule returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MonitorsApi;
import com.datadog.api.client.v2.model.MonitorNotificationRuleResponse;
import com.datadog.api.client.v2.model.MonitorNotificationRuleAttributes;
import com.datadog.api.client.v2.model.MonitorNotificationRuleCreateRequest;
import com.datadog.api.client.v2.model.MonitorNotificationRuleCreateRequestData;
import com.datadog.api.client.v2.model.MonitorNotificationRuleFilter;
import com.datadog.api.client.v2.model.MonitorNotificationRuleFilterTags;
import com.datadog.api.client.v2.model.MonitorNotificationRuleResourceType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    MonitorNotificationRuleCreateRequest body = new MonitorNotificationRuleCreateRequest()
.data(new MonitorNotificationRuleCreateRequestData()
.attributes(new MonitorNotificationRuleAttributes()
.filter(new MonitorNotificationRuleFilter(
new MonitorNotificationRuleFilterTags()
.tags(Collections.singletonList("test:example-monitor"))))
.name("test rule")
.recipients(Arrays.asList("slack-test-channel", "jira-test")))
.type(MonitorNotificationRuleResourceType.MONITOR_NOTIFICATION_RULE));

    try {
      MonitorNotificationRuleResponse result = apiInstance.createMonitorNotificationRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#createMonitorNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}