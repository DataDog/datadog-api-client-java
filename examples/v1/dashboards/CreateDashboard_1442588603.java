// Create a distribution widget using a histogram request containing a formulas and functions APM
// Stats query

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.DistributionWidgetDefinition;
import com.datadog.api.v1.client.model.DistributionWidgetDefinitionType;
import com.datadog.api.v1.client.model.DistributionWidgetHistogramRequestQuery;
import com.datadog.api.v1.client.model.DistributionWidgetHistogramRequestType;
import com.datadog.api.v1.client.model.DistributionWidgetRequest;
import com.datadog.api.v1.client.model.DistributionWidgetXAxis;
import com.datadog.api.v1.client.model.DistributionWidgetYAxis;
import com.datadog.api.v1.client.model.FormulaAndFunctionApmResourceStatName;
import com.datadog.api.v1.client.model.FormulaAndFunctionApmResourceStatsDataSource;
import com.datadog.api.v1.client.model.FormulaAndFunctionApmResourceStatsQueryDefinition;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetLayout;
import com.datadog.api.v1.client.model.WidgetStyle;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title(
                "Example-Create_a_distribution_widget_using_a_histogram_request_containing_a_formulas_and_functions_APM_Stats")
            .description("")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new DistributionWidgetDefinition()
                                    .title("APM Stats - Request latency HOP")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .showLegend(false)
                                    .type(DistributionWidgetDefinitionType.DISTRIBUTION)
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
                                                        new FormulaAndFunctionApmResourceStatsQueryDefinition()
                                                            .primaryTagValue("*")
                                                            .stat(
                                                                FormulaAndFunctionApmResourceStatName
                                                                    .LATENCY_DISTRIBUTION)
                                                            .dataSource(
                                                                FormulaAndFunctionApmResourceStatsDataSource
                                                                    .APM_RESOURCE_STATS)
                                                            .name("query1")
                                                            .service("azure-bill-import")
                                                            .groupBy(
                                                                Collections.singletonList(
                                                                    "resource_name"))
                                                            .env("staging")
                                                            .primaryTagName("datacenter")
                                                            .operationName(
                                                                "universal.http.client")))
                                                .requestType(
                                                    DistributionWidgetHistogramRequestType
                                                        .HISTOGRAM)
                                                .style(new WidgetStyle().palette("dog_classic"))))))
                        .layout(new WidgetLayout().x(8L).y(0L).width(4L).height(2L))))
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