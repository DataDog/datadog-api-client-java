// Create a distribution widget using a histogram request containing a formulas and functions
// metrics query

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.DistributionWidgetDefinition;
import com.datadog.api.client.v1.model.DistributionWidgetDefinitionType;
import com.datadog.api.client.v1.model.DistributionWidgetHistogramRequestQuery;
import com.datadog.api.client.v1.model.DistributionWidgetRequest;
import com.datadog.api.client.v1.model.DistributionWidgetXAxis;
import com.datadog.api.client.v1.model.DistributionWidgetYAxis;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetCustomLink;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetHistogramRequestType;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetStyle;
import com.datadog.api.client.v1.model.WidgetTextAlign;
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
                                new DistributionWidgetDefinition()
                                    .title("Metrics HOP")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .showLegend(false)
                                    .type(DistributionWidgetDefinitionType.DISTRIBUTION)
                                    .customLinks(
                                        Collections.singletonList(
                                            new WidgetCustomLink()
                                                .label("Example")
                                                .link("https://example.org/")))
                                    .xaxis(
                                        new DistributionWidgetXAxis()
                                            .max("auto")
                                            .includeZero(true)
                                            .scale("linear")
                                            .min("auto"))
                                    .yaxis(
                                        new DistributionWidgetYAxis()
                                            .max("auto")
                                            .includeZero(true)
                                            .scale("linear")
                                            .min("auto"))
                                    .requests(
                                        Collections.singletonList(
                                            new DistributionWidgetRequest()
                                                .query(
                                                    new DistributionWidgetHistogramRequestQuery(
                                                        new FormulaAndFunctionMetricQueryDefinition()
                                                            .query("histogram:trace.Load{*}")
                                                            .dataSource(
                                                                FormulaAndFunctionMetricDataSource
                                                                    .METRICS)
                                                            .name("query1")))
                                                .requestType(WidgetHistogramRequestType.HISTOGRAM)
                                                .style(new WidgetStyle().palette("dog_classic"))))))
                        .layout(new WidgetLayout().x(0L).y(0L).width(4L).height(2L))))
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
