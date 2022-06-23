// Create a distribution widget using a histogram request containing a formulas and functions events
// query

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
import com.datadog.api.v1.client.model.FormulaAndFunctionEventAggregation;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryDefinitionSearch;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventsDataSource;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetLayout;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title(
                "Example-Create_a_distribution_widget_using_a_histogram_request_containing_a_formulas_and_functions_events_qu")
            .description(
                "Example-Create_a_distribution_widget_using_a_histogram_request_containing_a_formulas_and_functions_events_qu")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new DistributionWidgetDefinition()
                                    .title("Events Platform - Request latency HOP")
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
                                                        new FormulaAndFunctionEventQueryDefinition()
                                                            .search(
                                                                new FormulaAndFunctionEventQueryDefinitionSearch()
                                                                    .query(""))
                                                            .dataSource(
                                                                FormulaAndFunctionEventsDataSource
                                                                    .EVENTS)
                                                            .compute(
                                                                new FormulaAndFunctionEventQueryDefinitionCompute()
                                                                    .metric("@duration")
                                                                    .aggregation(
                                                                        FormulaAndFunctionEventAggregation
                                                                            .MIN))
                                                            .name("query1")
                                                            .indexes(
                                                                Collections.singletonList("*"))))
                                                .requestType(
                                                    DistributionWidgetHistogramRequestType
                                                        .HISTOGRAM)))))
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
