// Create a new dashboard with a query value widget using the percentile aggregator

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.FormulaAndFunctionMetricAggregation;
import com.datadog.api.v1.client.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.v1.client.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.v1.client.model.QueryValueWidgetDefinition;
import com.datadog.api.v1.client.model.QueryValueWidgetDefinitionType;
import com.datadog.api.v1.client.model.QueryValueWidgetRequest;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetFormula;
import com.datadog.api.v1.client.model.WidgetLayout;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import com.datadog.api.v1.client.model.WidgetTime;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .layoutType(DashboardLayoutType.ORDERED)
            .title(
                "Example-Create_a_new_dashboard_with_a_query_value_widget_using_the_percentile_aggregator"
                    + " with QVW Percentile Aggregator")
            .widgets(
                new ArrayList<Widget>() {
                  {
                    add(
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
                                            new ArrayList<QueryValueWidgetRequest>() {
                                              {
                                                add(
                                                    new QueryValueWidgetRequest()
                                                        .formulas(
                                                            new ArrayList<WidgetFormula>() {
                                                              {
                                                                add(
                                                                    new WidgetFormula()
                                                                        .formula("query1"));
                                                              }
                                                            })
                                                        .responseFormat(
                                                            FormulaAndFunctionResponseFormat.SCALAR)
                                                        .queries(
                                                            new ArrayList<
                                                                FormulaAndFunctionQueryDefinition>() {
                                                              {
                                                                add(
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
                                                                                    .PERCENTILE)));
                                                              }
                                                            }));
                                              }
                                            })
                                        .type(QueryValueWidgetDefinitionType.QUERY_VALUE)))
                            .layout(new WidgetLayout().y(0L).x(0L).height(2L).width(2L)));
                  }
                });

    try {
      Dashboard result = apiInstance.createDashboard(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
