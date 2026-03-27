// Validate a monitor user template returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MonitorsApi;
import com.datadog.api.client.v2.model.MonitorUserTemplateCreateData;
import com.datadog.api.client.v2.model.MonitorUserTemplateCreateRequest;
import com.datadog.api.client.v2.model.MonitorUserTemplateRequestAttributes;
import com.datadog.api.client.v2.model.MonitorUserTemplateResourceType;
import com.datadog.api.client.v2.model.MonitorUserTemplateTemplateVariablesItems;
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
    defaultClient.setUnstableOperationEnabled("v2.validateMonitorUserTemplate", true);
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    MonitorUserTemplateCreateRequest body = new MonitorUserTemplateCreateRequest()
.data(new MonitorUserTemplateCreateData()
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
.type(MonitorUserTemplateResourceType.MONITOR_USER_TEMPLATE));

    try {
      apiInstance.validateMonitorUserTemplate(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#validateMonitorUserTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}