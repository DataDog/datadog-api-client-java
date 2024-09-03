// Create a new dashboard with team tags returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.ChangeWidgetDefinition;
import com.datadog.api.client.v1.model.ChangeWidgetDefinitionType;
import com.datadog.api.client.v1.model.ChangeWidgetRequest;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventAggregation;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinitionSearch;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventsDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetChangeType;
import com.datadog.api.client.v1.model.WidgetCompareTo;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetFormula;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetLegacyLiveSpan;
import com.datadog.api.client.v1.model.WidgetOrderBy;
import com.datadog.api.client.v1.model.WidgetSort;
import com.datadog.api.client.v1.model.WidgetTextAlign;
import com.datadog.api.client.v1.model.WidgetTime;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Dashboard")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new ChangeWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .time(new WidgetTime(new WidgetLegacyLiveSpan()))
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
            .tags(Collections.singletonList("team:foobar"))
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
