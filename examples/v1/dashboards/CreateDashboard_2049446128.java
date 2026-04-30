// Create a new dashboard with point_plot widget

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.DataProjectionQuery;
import com.datadog.api.client.v1.model.DataProjectionRequestType;
import com.datadog.api.client.v1.model.PointPlotDimension;
import com.datadog.api.client.v1.model.PointPlotProjection;
import com.datadog.api.client.v1.model.PointPlotProjectionDimension;
import com.datadog.api.client.v1.model.PointPlotProjectionType;
import com.datadog.api.client.v1.model.PointPlotWidgetDefinition;
import com.datadog.api.client.v1.model.PointPlotWidgetDefinitionType;
import com.datadog.api.client.v1.model.PointPlotWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetTextAlign;
import java.util.Arrays;
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
                                new PointPlotWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .type(PointPlotWidgetDefinitionType.POINT_PLOT)
                                    .requests(
                                        Collections.singletonList(
                                            new PointPlotWidgetRequest()
                                                .requestType(
                                                    DataProjectionRequestType.DATA_PROJECTION)
                                                .query(
                                                    new DataProjectionQuery()
                                                        .queryString("service:web-store")
                                                        .dataSource("logs"))
                                                .projection(
                                                    new PointPlotProjection()
                                                        .type(PointPlotProjectionType.POINT_PLOT)
                                                        .dimensions(
                                                            Arrays.asList(
                                                                new PointPlotProjectionDimension()
                                                                    .column("host")
                                                                    .dimension(
                                                                        PointPlotDimension.GROUP),
                                                                new PointPlotProjectionDimension()
                                                                    .column("@duration")
                                                                    .dimension(
                                                                        PointPlotDimension
                                                                            .Y))))))))));

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
