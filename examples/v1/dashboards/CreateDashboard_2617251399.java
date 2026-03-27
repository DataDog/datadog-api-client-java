// Create a new dashboard with bar_chart widget sorted by group

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.BarChartWidgetDefinition;
import com.datadog.api.client.v1.model.BarChartWidgetDefinitionType;
import com.datadog.api.client.v1.model.BarChartWidgetDisplay;
import com.datadog.api.client.v1.model.BarChartWidgetLegend;
import com.datadog.api.client.v1.model.BarChartWidgetRequest;
import com.datadog.api.client.v1.model.BarChartWidgetScaling;
import com.datadog.api.client.v1.model.BarChartWidgetStacked;
import com.datadog.api.client.v1.model.BarChartWidgetStackedType;
import com.datadog.api.client.v1.model.BarChartWidgetStyle;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricAggregation;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.GroupType;
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
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body = new Dashboard()
.title("Example-Dashboard")
.description("")
.widgets(Collections.singletonList(new Widget()
.layout(new WidgetLayout()
.x(0L)
.y(0L)
.width(47L)
.height(15L))
.definition(new WidgetDefinition(
new BarChartWidgetDefinition()
.title("")
.titleSize("16")
.titleAlign(WidgetTextAlign.LEFT)
.time(new WidgetTime(
new WidgetLegacyLiveSpan()))
.style(new BarChartWidgetStyle()
.display(new BarChartWidgetDisplay(
new BarChartWidgetStacked()
.type(BarChartWidgetStackedType.STACKED)
.legend(BarChartWidgetLegend.INLINE)))
.scaling(BarChartWidgetScaling.RELATIVE)
.palette("dog_classic"))
.type(BarChartWidgetDefinitionType.BAR_CHART)
.requests(Collections.singletonList(new BarChartWidgetRequest()
.queries(Collections.singletonList(new FormulaAndFunctionQueryDefinition(
new FormulaAndFunctionMetricQueryDefinition()
.dataSource(FormulaAndFunctionMetricDataSource.METRICS)
.name("query1")
.query("avg:system.cpu.user{*} by {service}")
.aggregator(FormulaAndFunctionMetricAggregation.AVG))))
.formulas(Collections.singletonList(new WidgetFormula()
.formula("query1")))
.sort(new WidgetSortBy()
.count(10L)
.orderBy(Collections.singletonList(new WidgetSortOrderBy(
new WidgetGroupSort()
.type(GroupType.GROUP)
.name("service")
.order(WidgetSort.ASCENDING)))))
.responseFormat(FormulaAndFunctionResponseFormat.SCALAR)))))))
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