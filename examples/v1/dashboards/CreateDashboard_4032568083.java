// Create a new dashboard with a live default_timeframe returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardDefaultTimeframeSetting;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.DashboardLiveTimeframe;
import com.datadog.api.client.v1.model.DashboardLiveTimeframeType;
import com.datadog.api.client.v1.model.NoteWidgetDefinition;
import com.datadog.api.client.v1.model.NoteWidgetDefinitionType;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLiveSpanUnit;
import com.datadog.api.client.v1.model.WidgetTextAlign;
import com.datadog.api.client.v1.model.WidgetTickEdge;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Dashboard")
            .layoutType(DashboardLayoutType.ORDERED)
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new NoteWidgetDefinition()
                                    .type(NoteWidgetDefinitionType.NOTE)
                                    .content("test")
                                    .backgroundColor("white")
                                    .fontSize("14")
                                    .textAlign(WidgetTextAlign.LEFT)
                                    .showTick(false)
                                    .tickPos("50%")
                                    .tickEdge(WidgetTickEdge.LEFT)))))
            .defaultTimeframe(
                new DashboardDefaultTimeframeSetting(
                    new DashboardLiveTimeframe()
                        .type(DashboardLiveTimeframeType.LIVE)
                        .unit(WidgetLiveSpanUnit.HOUR)
                        .value(4L)));

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
