// Create a new dashboard with template variable presets using values returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.DashboardReflowType;
import com.datadog.api.client.v1.model.DashboardTemplateVariable;
import com.datadog.api.client.v1.model.DashboardTemplateVariablePreset;
import com.datadog.api.client.v1.model.DashboardTemplateVariablePresetValue;
import com.datadog.api.client.v1.model.HostMapRequest;
import com.datadog.api.client.v1.model.HostMapWidgetDefinition;
import com.datadog.api.client.v1.model.HostMapWidgetDefinitionRequests;
import com.datadog.api.client.v1.model.HostMapWidgetDefinitionType;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .description(null)
            .layoutType(DashboardLayoutType.ORDERED)
            .reflowType(DashboardReflowType.AUTO)
            .templateVariablePresets(
                Collections.singletonList(
                    new DashboardTemplateVariablePreset()
                        .name("my saved view")
                        .templateVariables(
                            Collections.singletonList(
                                new DashboardTemplateVariablePresetValue()
                                    .name("datacenter")
                                    .values(Arrays.asList("*", "my-host"))))))
            .templateVariables(
                Collections.singletonList(
                    new DashboardTemplateVariable()
                        .availableValues(Arrays.asList("my-host", "host1", "host2"))
                        .defaults(Collections.singletonList("my-host"))
                        .name("host1")
                        .prefix("host")))
            .title("")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new HostMapWidgetDefinition()
                                    .requests(
                                        new HostMapWidgetDefinitionRequests()
                                            .fill(new HostMapRequest().q("avg:system.cpu.user{*}")))
                                    .type(HostMapWidgetDefinitionType.HOSTMAP)))));

    try {
      Dashboard result = apiInstance.createDashboard(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#createDashboard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
