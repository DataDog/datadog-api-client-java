// Create a new dashboard with a formulas and functions change widget

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.ChangeWidgetDefinition;
import com.datadog.api.v1.client.model.ChangeWidgetDefinitionType;
import com.datadog.api.v1.client.model.ChangeWidgetRequest;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventAggregation;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventQueryDefinitionSearch;
import com.datadog.api.v1.client.model.FormulaAndFunctionEventsDataSource;
import com.datadog.api.v1.client.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetChangeType;
import com.datadog.api.v1.client.model.WidgetCompareTo;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetFormula;
import com.datadog.api.v1.client.model.WidgetLayout;
import com.datadog.api.v1.client.model.WidgetOrderBy;
import com.datadog.api.v1.client.model.WidgetSort;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import com.datadog.api.v1.client.model.WidgetTime;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Create_a_new_dashboard_with_a_formulas_and_functions_change_widget")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new ChangeWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .time(new WidgetTime())
                                    .type(ChangeWidgetDefinitionType.CHANGE)
                                    .requests(
                                        Collections.singletonList(
                                            new ChangeWidgetRequest()
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
                                                    FormulaAndFunctionResponseFormat.SCALAR)
                                                .compareTo(WidgetCompareTo.HOUR_BEFORE)
                                                .increaseGood(true)
                                                .orderBy(WidgetOrderBy.CHANGE)
                                                .changeType(WidgetChangeType.ABSOLUTE)
                                                .orderDir(WidgetSort.DESCENDING)))))
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
