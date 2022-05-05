// Create a new dashboard with formulas and functions scatterplot widget

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
import com.datadog.api.v1.client.model.ScatterPlotWidgetDefinition;
import com.datadog.api.v1.client.model.ScatterPlotWidgetDefinitionRequests;
import com.datadog.api.v1.client.model.ScatterPlotWidgetDefinitionType;
import com.datadog.api.v1.client.model.ScatterplotDimension;
import com.datadog.api.v1.client.model.ScatterplotTableRequest;
import com.datadog.api.v1.client.model.ScatterplotWidgetFormula;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetLayout;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Create_a_new_dashboard_with_formulas_and_functions_scatterplot_widget")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .id(5346764334358972L)
                        .definition(
                            new WidgetDefinition(
                                new ScatterPlotWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .type(ScatterPlotWidgetDefinitionType.SCATTERPLOT)
                                    .requests(
                                        new ScatterPlotWidgetDefinitionRequests()
                                            .table(
                                                new ScatterplotTableRequest()
                                                    .formulas(
                                                        Arrays.asList(
                                                            new ScatterplotWidgetFormula()
                                                                .formula("query1")
                                                                .dimension(ScatterplotDimension.X)
                                                                .alias("my-query1"),
                                                            new ScatterplotWidgetFormula()
                                                                .formula("query2")
                                                                .dimension(ScatterplotDimension.Y)
                                                                .alias("my-query2")))
                                                    .queries(
                                                        Arrays.asList(
                                                            new FormulaAndFunctionQueryDefinition(
                                                                new FormulaAndFunctionMetricQueryDefinition()
                                                                    .dataSource(
                                                                        FormulaAndFunctionMetricDataSource
                                                                            .METRICS)
                                                                    .name("query1")
                                                                    .query(
                                                                        "avg:system.cpu.user{*} by"
                                                                            + " {service}")
                                                                    .aggregator(
                                                                        FormulaAndFunctionMetricAggregation
                                                                            .AVG)),
                                                            new FormulaAndFunctionQueryDefinition(
                                                                new FormulaAndFunctionMetricQueryDefinition()
                                                                    .dataSource(
                                                                        FormulaAndFunctionMetricDataSource
                                                                            .METRICS)
                                                                    .name("query2")
                                                                    .query(
                                                                        "avg:system.mem.used{*} by"
                                                                            + " {service}")
                                                                    .aggregator(
                                                                        FormulaAndFunctionMetricAggregation
                                                                            .AVG))))
                                                    .responseFormat(
                                                        FormulaAndFunctionResponseFormat.SCALAR)))))
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
