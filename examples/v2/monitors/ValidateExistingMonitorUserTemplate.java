// Validate an existing monitor user template returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MonitorsApi;
import com.datadog.api.client.v2.model.MonitorUserTemplateRequestAttributes;
import com.datadog.api.client.v2.model.MonitorUserTemplateResourceType;
import com.datadog.api.client.v2.model.MonitorUserTemplateTemplateVariablesItems;
import com.datadog.api.client.v2.model.MonitorUserTemplateUpdateData;
import com.datadog.api.client.v2.model.MonitorUserTemplateUpdateRequest;
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
    defaultClient.setUnstableOperationEnabled("v2.validateExistingMonitorUserTemplate", true);
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    // there is a valid "monitor_user_template" in the system
    String MONITOR_USER_TEMPLATE_DATA_ID = System.getenv("MONITOR_USER_TEMPLATE_DATA_ID");

    MonitorUserTemplateUpdateRequest body = new MonitorUserTemplateUpdateRequest()
.data(new MonitorUserTemplateUpdateData()
.attributes(new MonitorUserTemplateRequestAttributes()
.description("A description.")
.monitorDefinition(Map.ofEntries(Map.entry("message", "A msg."),Map.entry("name", "A name example-monitor"),Map.entry("query", "avg(last_5m):sum:system.net.bytes_rcvd{host:host0} > 100"),Map.entry("type", "query alert")))
.tags(Collections.singletonList("integration:Azure"))
.templateVariables(Collections.singletonList(new MonitorUserTemplateTemplateVariablesItems()
.availableValues(Arrays.asList("value1", "value2"))
.defaults(Collections.singletonList("defaultValue"))
.name("regionName")
.tagKey("datacenter")))
.title("Postgres DB example-monitor"))
.id(MONITOR_USER_TEMPLATE_DATA_ID)
.type(MonitorUserTemplateResourceType.MONITOR_USER_TEMPLATE));

    try {
      apiInstance.validateExistingMonitorUserTemplate(MONITOR_USER_TEMPLATE_DATA_ID, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#validateExistingMonitorUserTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}