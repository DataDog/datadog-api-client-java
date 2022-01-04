// Create a new dashboard with query_table widget

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
import com.datadog.api.v1.client.model.QuerySortOrder;
import com.datadog.api.v1.client.model.TableWidgetCellDisplayMode;
import com.datadog.api.v1.client.model.TableWidgetDefinition;
import com.datadog.api.v1.client.model.TableWidgetDefinitionType;
import com.datadog.api.v1.client.model.TableWidgetHasSearchBar;
import com.datadog.api.v1.client.model.TableWidgetRequest;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetConditionalFormat;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetFormula;
import com.datadog.api.v1.client.model.WidgetFormulaLimit;
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
            .title("Example-Create_a_new_dashboard_with_query_table_widget")
            .description("")
            .widgets(
                new ArrayList<Widget>() {
                  {
                    add(
                        new Widget()
                            .layout(new WidgetLayout().x(0L).y(0L).width(54L).height(32L))
                            .definition(
                                new WidgetDefinition(
                                    new TableWidgetDefinition()
                                        .title("")
                                        .titleSize("16")
                                        .titleAlign(WidgetTextAlign.LEFT)
                                        .time(new WidgetTime())
                                        .type(TableWidgetDefinitionType.QUERY_TABLE)
                                        .requests(
                                            new ArrayList<TableWidgetRequest>() {
                                              {
                                                add(
                                                    new TableWidgetRequest()
                                                        .queries(
                                                            new ArrayList<
                                                                FormulaAndFunctionQueryDefinition>() {
                                                              {
                                                                add(
                                                                    new FormulaAndFunctionQueryDefinition(
                                                                        new FormulaAndFunctionMetricQueryDefinition()
                                                                            .dataSource(
                                                                                FormulaAndFunctionMetricDataSource
                                                                                    .METRICS)
                                                                            .name("query1")
                                                                            .query(
                                                                                "avg:system.cpu.user{*}"
                                                                                    + " by {host}")
                                                                            .aggregator(
                                                                                FormulaAndFunctionMetricAggregation
                                                                                    .AVG)));
                                                              }
                                                            })
                                                        .formulas(
                                                            new ArrayList<WidgetFormula>() {
                                                              {
                                                                add(
                                                                    new WidgetFormula()
                                                                        .formula("query1")
                                                                        .limit(
                                                                            new WidgetFormulaLimit()
                                                                                .count(500L)
                                                                                .order(
                                                                                    QuerySortOrder
                                                                                        .DESC))
                                                                        .conditionalFormats(
                                                                            new ArrayList<
                                                                                WidgetConditionalFormat>() {
                                                                              {
                                                                                ;
                                                                              }
                                                                            })
                                                                        .cellDisplayMode(
                                                                            TableWidgetCellDisplayMode
                                                                                .BAR));
                                                              }
                                                            })
                                                        .responseFormat(
                                                            FormulaAndFunctionResponseFormat
                                                                .SCALAR));
                                              }
                                            })
                                        .hasSearchBar(TableWidgetHasSearchBar.AUTO))));
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
