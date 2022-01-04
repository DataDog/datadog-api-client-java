// Create a new dashboard with query_value widget

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.DashboardTemplateVariable;
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
            .title("Example-Create_a_new_dashboard_with_query_value_widget")
            .description("")
            .widgets(
                new ArrayList<Widget>() {
                  {
                    add(
                        new Widget()
                            .layout(new WidgetLayout().x(0L).y(0L).width(47L).height(15L))
                            .definition(
                                new WidgetDefinition(
                                    new QueryValueWidgetDefinition()
                                        .title("")
                                        .titleSize("16")
                                        .titleAlign(WidgetTextAlign.LEFT)
                                        .time(new WidgetTime())
                                        .type(QueryValueWidgetDefinitionType.QUERY_VALUE)
                                        .requests(
                                            new ArrayList<QueryValueWidgetRequest>() {
                                              {
                                                add(
                                                    new QueryValueWidgetRequest()
                                                        .responseFormat(
                                                            FormulaAndFunctionResponseFormat.SCALAR)
                                                        .queries(
                                                            new ArrayList<
                                                                FormulaAndFunctionQueryDefinition>() {
                                                              {
                                                                add(
                                                                    new FormulaAndFunctionQueryDefinition(
                                                                        new FormulaAndFunctionMetricQueryDefinition()
                                                                            .name("query1")
                                                                            .dataSource(
                                                                                FormulaAndFunctionMetricDataSource
                                                                                    .METRICS)
                                                                            .query(
                                                                                "avg:system.cpu.user{*}")
                                                                            .aggregator(
                                                                                FormulaAndFunctionMetricAggregation
                                                                                    .AVG)));
                                                              }
                                                            }));
                                              }
                                            })
                                        .autoscale(true)
                                        .precision(2L))));
                  }
                })
            .templateVariables(
                new ArrayList<DashboardTemplateVariable>() {
                  {
                    ;
                  }
                })
            .layoutType(DashboardLayoutType.FREE)
            .isReadOnly(false)
            .notifyList(
                new ArrayList<String>() {
                  {
                    ;
                  }
                });

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
