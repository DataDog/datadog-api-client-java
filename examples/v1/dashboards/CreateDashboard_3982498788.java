// Create a new dashboard with timeseries widget containing style attributes

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.TimeseriesWidgetDefinition;
import com.datadog.api.v1.client.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.v1.client.model.TimeseriesWidgetRequest;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetDisplayType;
import com.datadog.api.v1.client.model.WidgetLineType;
import com.datadog.api.v1.client.model.WidgetLineWidth;
import com.datadog.api.v1.client.model.WidgetRequestStyle;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .layoutType(DashboardLayoutType.ORDERED)
            .title(
                "Example-Create_a_new_dashboard_with_timeseries_widget_containing_style_attributes"
                    + " with timeseries widget")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new TimeseriesWidgetDefinition()
                                    .type(TimeseriesWidgetDefinitionType.TIMESERIES)
                                    .requests(
                                        Collections.singletonList(
                                            new TimeseriesWidgetRequest()
                                                .q(
                                                    "sum:trace.test.errors{env:prod,service:datadog-api-spec}"
                                                        + " by {resource_name}.as_count()")
                                                .onRightYaxis(false)
                                                .style(
                                                    new WidgetRequestStyle()
                                                        .palette("warm")
                                                        .lineType(WidgetLineType.SOLID)
                                                        .lineWidth(WidgetLineWidth.NORMAL))
                                                .displayType(WidgetDisplayType.BARS)))))));

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
