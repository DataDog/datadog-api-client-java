// Create a new dashboard with a formulas and functions treemap widget

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventAggregation;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryDefinitionSearch;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventsDataSource;
import com.datadog.api.v1.client.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.v1.client.model.TreeMapWidgetDefinition;
import com.datadog.api.v1.client.model.TreeMapWidgetDefinitionType;
import com.datadog.api.v1.client.model.TreeMapWidgetRequest;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetFormula;
import com.datadog.api.v1.client.model.WidgetLayout;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Create_a_new_dashboard_with_a_formulas_and_functions_treemap_widget")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new TreeMapWidgetDefinition()
                                    .title("")
                                    .type(TreeMapWidgetDefinitionType.TREEMAP)
                                    .requests(
                                        Collections.singletonList(
                                            new TreeMapWidgetRequest()
                                                .formulas(
                                                    Arrays.asList(
                                                        new WidgetFormula()
                                                            .formula("hour_before(query1)"),
                                                        new WidgetFormula().formula("query1")))
                                                .queries(
                                                    Collections.singletonList(
                                                        new FormulaAndFunctionQueryDefinition(
                                                            new FormulaAndFunctionEventQueryDefinition()
                                                                .dataSource(
                                                                    FormulaAndFunctionEventsDataSource
                                                                        .LOGS)
                                                                .name("query1")
                                                                .search(
                                                                    new FormulaAndFunctionEventQueryDefinitionSearch()
                                                                        .query(""))
                                                                .indexes(
                                                                    Collections.singletonList("*"))
                                                                .compute(
                                                                    new FormulaAndFunctionEventQueryDefinitionCompute()
                                                                        .aggregation(
                                                                            FormulaAndFunctionEventAggregation
                                                                                .COUNT)))))
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.SCALAR)))))
                        .layout(new WidgetLayout().x(0L).y(0L).width(4L).height(4L))))
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
