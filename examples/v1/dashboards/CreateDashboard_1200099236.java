// Create a new dashboard with hostmap widget

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.HostMapRequest;
import com.datadog.api.client.v1.model.HostMapWidgetDefinition;
import com.datadog.api.client.v1.model.HostMapWidgetDefinitionRequests;
import com.datadog.api.client.v1.model.HostMapWidgetDefinitionStyle;
import com.datadog.api.client.v1.model.HostMapWidgetDefinitionType;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetNodeType;
import com.datadog.api.client.v1.model.WidgetTextAlign;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Dashboard")
            .description(null)
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .layout(new WidgetLayout().x(0L).y(0L).width(47L).height(22L))
                        .definition(
                            new WidgetDefinition(
                                new HostMapWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .type(HostMapWidgetDefinitionType.HOSTMAP)
                                    .requests(
                                        new HostMapWidgetDefinitionRequests()
                                            .fill(
                                                new HostMapRequest()
                                                    .q("avg:system.cpu.user{*} by {host}")))
                                    .nodeType(WidgetNodeType.HOST)
                                    .noMetricHosts(true)
                                    .noGroupHosts(true)
                                    .style(
                                        new HostMapWidgetDefinitionStyle()
                                            .palette("green_to_orange")
                                            .paletteFlip(false))))))
            .layoutType(DashboardLayoutType.FREE);

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
