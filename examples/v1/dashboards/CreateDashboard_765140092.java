// Create a new dashboard with a query value widget using timeseries background

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricAggregation;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.QueryValueWidgetDefinition;
import com.datadog.api.client.v1.model.QueryValueWidgetDefinitionType;
import com.datadog.api.client.v1.model.QueryValueWidgetRequest;
import com.datadog.api.client.v1.model.TimeseriesBackground;
import com.datadog.api.client.v1.model.TimeseriesBackgroundType;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetAxis;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetFormula;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetLegacyLiveSpan;
import com.datadog.api.client.v1.model.WidgetTextAlign;
import com.datadog.api.client.v1.model.WidgetTime;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .layoutType(DashboardLayoutType.ORDERED)
            .title("Example-Dashboard with QVW Timeseries Background")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new QueryValueWidgetDefinition()
                                    .titleSize("16")
                                    .title("")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .precision(2L)
                                    .time(new WidgetTime(new WidgetLegacyLiveSpan()))
                                    .autoscale(true)
                                    .requests(
                                        Collections.singletonList(
                                            new QueryValueWidgetRequest()
                                                .formulas(
                                                    Collections.singletonList(
                                                        new WidgetFormula().formula("query1")))
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.SCALAR)
                                                .queries(
                                                    Collections.singletonList(
                                                        new FormulaAndFunctionQueryDefinition(
                                                            new FormulaAndFunctionMetricQueryDefinition()
                                                                .query(
                                                                    "sum:my.cool.count.metric{*}")
                                                                .dataSource(
                                                                    FormulaAndFunctionMetricDataSource
                                                                        .METRICS)
                                                                .name("query1")
                                                                .aggregator(
                                                                    FormulaAndFunctionMetricAggregation
                                                                        .PERCENTILE))))))
                                    .type(QueryValueWidgetDefinitionType.QUERY_VALUE)
                                    .timeseriesBackground(
                                        new TimeseriesBackground()
                                            .type(TimeseriesBackgroundType.AREA)
                                            .yaxis(new WidgetAxis().includeZero(true)))))
                        .layout(new WidgetLayout().y(0L).x(0L).height(2L).width(2L))));

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
