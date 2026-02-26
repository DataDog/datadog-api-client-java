// Create a new dashboard with a toplist widget with stacked type and no legend specified

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
import com.datadog.api.client.v1.model.GroupType;
import com.datadog.api.client.v1.model.ToplistWidgetDefinition;
import com.datadog.api.client.v1.model.ToplistWidgetDefinitionType;
import com.datadog.api.client.v1.model.ToplistWidgetDisplay;
import com.datadog.api.client.v1.model.ToplistWidgetRequest;
import com.datadog.api.client.v1.model.ToplistWidgetScaling;
import com.datadog.api.client.v1.model.ToplistWidgetStacked;
import com.datadog.api.client.v1.model.ToplistWidgetStackedType;
import com.datadog.api.client.v1.model.ToplistWidgetStyle;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetFormula;
import com.datadog.api.client.v1.model.WidgetGroupSort;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetLegacyLiveSpan;
import com.datadog.api.client.v1.model.WidgetSort;
import com.datadog.api.client.v1.model.WidgetSortBy;
import com.datadog.api.client.v1.model.WidgetSortOrderBy;
import com.datadog.api.client.v1.model.WidgetTextAlign;
import com.datadog.api.client.v1.model.WidgetTime;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Dashboard")
            .description("")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .layout(new WidgetLayout().x(0L).y(0L).width(47L).height(15L))
                        .definition(
                            new WidgetDefinition(
                                new ToplistWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .time(new WidgetTime(new WidgetLegacyLiveSpan()))
                                    .style(
                                        new ToplistWidgetStyle()
                                            .display(
                                                new ToplistWidgetDisplay(
                                                    new ToplistWidgetStacked()
                                                        .type(ToplistWidgetStackedType.STACKED)))
                                            .scaling(ToplistWidgetScaling.RELATIVE)
                                            .palette("dog_classic"))
                                    .type(ToplistWidgetDefinitionType.TOPLIST)
                                    .requests(
                                        Collections.singletonList(
                                            new ToplistWidgetRequest()
                                                .queries(
                                                    Collections.singletonList(
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
                                                                        .AVG))))
                                                .formulas(
                                                    Collections.singletonList(
                                                        new WidgetFormula().formula("query1")))
                                                .sort(
                                                    new WidgetSortBy()
                                                        .count(10L)
                                                        .orderBy(
                                                            Collections.singletonList(
                                                                new WidgetSortOrderBy(
                                                                    new WidgetGroupSort()
                                                                        .type(GroupType.GROUP)
                                                                        .name("service")
                                                                        .order(
                                                                            WidgetSort
                                                                                .ASCENDING)))))
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.SCALAR)))))))
            .layoutType(DashboardLayoutType.FREE);

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
