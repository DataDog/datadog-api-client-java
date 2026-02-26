// Create a new dashboard with timeseries widget containing style attributes

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinition;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.client.v1.model.TimeseriesWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetDisplayType;
import com.datadog.api.client.v1.model.WidgetLineType;
import com.datadog.api.client.v1.model.WidgetLineWidth;
import com.datadog.api.client.v1.model.WidgetRequestStyle;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .layoutType(DashboardLayoutType.ORDERED)
            .title("Example-Dashboard with timeseries widget")
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
