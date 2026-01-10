// Create a new dashboard with heatmap widget with markers and num_buckets

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.HeatMapWidgetDefinition;
import com.datadog.api.client.v1.model.HeatMapWidgetDefinitionType;
import com.datadog.api.client.v1.model.HeatMapWidgetRequest;
import com.datadog.api.client.v1.model.HeatMapWidgetXAxis;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetAxis;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetHistogramRequestType;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetMarker;
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
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new HeatMapWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .type(HeatMapWidgetDefinitionType.HEATMAP)
                                    .xaxis(new HeatMapWidgetXAxis().numBuckets(75L))
                                    .yaxis(
                                        new WidgetAxis()
                                            .scale("linear")
                                            .min("auto")
                                            .max("auto")
                                            .includeZero(true))
                                    .markers(
                                        Arrays.asList(
                                            new WidgetMarker()
                                                .displayType("percentile")
                                                .value("50"),
                                            new WidgetMarker()
                                                .displayType("percentile")
                                                .value("99")))
                                    .requests(
                                        Collections.singletonList(
                                            new HeatMapWidgetRequest()
                                                .requestType(WidgetHistogramRequestType.HISTOGRAM)
                                                .query(
                                                    new FormulaAndFunctionMetricQueryDefinition()
                                                        .dataSource(
                                                            FormulaAndFunctionMetricDataSource
                                                                .METRICS)
                                                        .name("query1")
                                                        .query(
                                                            "histogram:trace.servlet.request{*}"))))))
                        .layout(new WidgetLayout().x(0L).y(0L).width(4L).height(4L))))
            .layoutType(DashboardLayoutType.ORDERED);

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
