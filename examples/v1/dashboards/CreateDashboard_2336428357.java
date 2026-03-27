// Create a new dashboard with query_table widget

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricAggregation;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.FormulaType;
import com.datadog.api.client.v1.model.TableWidgetCellDisplayMode;
import com.datadog.api.client.v1.model.TableWidgetDefinition;
import com.datadog.api.client.v1.model.TableWidgetDefinitionType;
import com.datadog.api.client.v1.model.TableWidgetHasSearchBar;
import com.datadog.api.client.v1.model.TableWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetFormula;
import com.datadog.api.client.v1.model.WidgetFormulaSort;
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
.width(54L)
.height(32L))
.definition(new WidgetDefinition(
new TableWidgetDefinition()
.title("")
.titleSize("16")
.titleAlign(WidgetTextAlign.LEFT)
.time(new WidgetTime(
new WidgetLegacyLiveSpan()))
.type(TableWidgetDefinitionType.QUERY_TABLE)
.requests(Collections.singletonList(new TableWidgetRequest()
.queries(Collections.singletonList(new FormulaAndFunctionQueryDefinition(
new FormulaAndFunctionMetricQueryDefinition()
.dataSource(FormulaAndFunctionMetricDataSource.METRICS)
.name("query1")
.query("avg:system.cpu.user{*} by {host}")
.aggregator(FormulaAndFunctionMetricAggregation.AVG))))
.formulas(Collections.singletonList(new WidgetFormula()
.formula("query1")
.cellDisplayMode(TableWidgetCellDisplayMode.BAR)))
.sort(new WidgetSortBy()
.count(500L)
.orderBy(Collections.singletonList(new WidgetSortOrderBy(
new WidgetFormulaSort()
.type(FormulaType.FORMULA)
.index(0L)
.order(WidgetSort.DESCENDING)))))
.responseFormat(FormulaAndFunctionResponseFormat.SCALAR)))
.hasSearchBar(TableWidgetHasSearchBar.AUTO)))))
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