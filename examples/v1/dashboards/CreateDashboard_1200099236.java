// Create a new dashboard with hostmap widget

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.HostMapRequest;
import com.datadog.api.v1.client.model.HostMapWidgetDefinition;
import com.datadog.api.v1.client.model.HostMapWidgetDefinitionRequests;
import com.datadog.api.v1.client.model.HostMapWidgetDefinitionStyle;
import com.datadog.api.v1.client.model.HostMapWidgetDefinitionType;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetLayout;
import com.datadog.api.v1.client.model.WidgetNodeType;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Create_a_new_dashboard_with_hostmap_widget")
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
            .layoutType(DashboardLayoutType.FREE)
            .isReadOnly(false);

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
