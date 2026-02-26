// Create a distribution widget using a histogram request containing a formulas and functions events
// query

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
import com.datadog.api.client.v1.model.FormulaAndFunctionEventAggregation;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinitionSearch;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventsDataSource;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetHistogramRequestType;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetTextAlign;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Dashboard")
            .description("Example-Dashboard")
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
                                                    WidgetHistogramRequestType.HISTOGRAM)))))
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
