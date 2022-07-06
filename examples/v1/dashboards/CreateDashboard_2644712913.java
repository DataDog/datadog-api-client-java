// Create a new dashboard with a query value widget using the percentile aggregator

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
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetFormula;
import com.datadog.api.client.v1.model.WidgetLayout;
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
            .title(
                "Example-Create_a_new_dashboard_with_a_query_value_widget_using_the_percentile_aggregator"
                    + " with QVW Percentile Aggregator")
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
                                    .time(new WidgetTime())
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
                                                                    "p90:dist.dd.dogweb.latency{*}")
                                                                .dataSource(
                                                                    FormulaAndFunctionMetricDataSource
                                                                        .METRICS)
                                                                .name("query1")
                                                                .aggregator(
                                                                    FormulaAndFunctionMetricAggregation
                                                                        .PERCENTILE))))))
                                    .type(QueryValueWidgetDefinitionType.QUERY_VALUE)))
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
