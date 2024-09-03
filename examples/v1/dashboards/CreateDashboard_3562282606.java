// Create a new dashboard with a change widget using formulas and functions slo query

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.ChangeWidgetDefinition;
import com.datadog.api.client.v1.model.ChangeWidgetDefinitionType;
import com.datadog.api.client.v1.model.ChangeWidgetRequest;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.FormulaAndFunctionSLODataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionSLOGroupMode;
import com.datadog.api.client.v1.model.FormulaAndFunctionSLOMeasure;
import com.datadog.api.client.v1.model.FormulaAndFunctionSLOQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionSLOQueryType;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetChangeType;
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

    // there is a valid "slo" in the system
    String SLO_DATA_0_ID = System.getenv("SLO_DATA_0_ID");

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
                                                            new FormulaAndFunctionSLOQueryDefinition()
                                                                .name("query1")
                                                                .dataSource(
                                                                    FormulaAndFunctionSLODataSource
                                                                        .SLO)
                                                                .sloId(SLO_DATA_0_ID)
                                                                .measure(
                                                                    FormulaAndFunctionSLOMeasure
                                                                        .SLO_STATUS)
                                                                .groupMode(
                                                                    FormulaAndFunctionSLOGroupMode
                                                                        .OVERALL)
                                                                .sloQueryType(
                                                                    FormulaAndFunctionSLOQueryType
                                                                        .METRIC)
                                                                .additionalQueryFilters("*"))))
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.SCALAR)
                                                .orderBy(WidgetOrderBy.CHANGE)
                                                .changeType(WidgetChangeType.ABSOLUTE)
                                                .increaseGood(true)
                                                .orderDir(WidgetSort.ASCENDING)))))
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
