// Create a new dashboard with logs query table widget and storage parameter

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventAggregation;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinitionCompute;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventQueryDefinitionSearch;
import com.datadog.api.client.v1.model.FormulaAndFunctionEventsDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.FormulaType;
import com.datadog.api.client.v1.model.TableWidgetCellDisplayMode;
import com.datadog.api.client.v1.model.TableWidgetDefinition;
import com.datadog.api.client.v1.model.TableWidgetDefinitionType;
import com.datadog.api.client.v1.model.TableWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetFormula;
import com.datadog.api.client.v1.model.WidgetFormulaSort;
import com.datadog.api.client.v1.model.WidgetSort;
import com.datadog.api.client.v1.model.WidgetSortBy;
import com.datadog.api.client.v1.model.WidgetSortOrderBy;
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
.layoutType(DashboardLayoutType.ORDERED)
.title("Example-Dashboard with query table widget and storage parameter")
.widgets(Collections.singletonList(new Widget()
.definition(new WidgetDefinition(
new TableWidgetDefinition()
.type(TableWidgetDefinitionType.QUERY_TABLE)
.requests(Collections.singletonList(new TableWidgetRequest()
.queries(Collections.singletonList(new FormulaAndFunctionQueryDefinition(
new FormulaAndFunctionEventQueryDefinition()
.dataSource(FormulaAndFunctionEventsDataSource.LOGS)
.name("query1")
.search(new FormulaAndFunctionEventQueryDefinitionSearch()
.query(""))
.indexes(Collections.singletonList("*"))
.compute(new FormulaAndFunctionEventQueryDefinitionCompute()
.aggregation(FormulaAndFunctionEventAggregation.COUNT))
.storage("online_archives"))))
.formulas(Collections.singletonList(new WidgetFormula()
.cellDisplayMode(TableWidgetCellDisplayMode.BAR)
.formula("query1")))
.sort(new WidgetSortBy()
.count(50L)
.orderBy(Collections.singletonList(new WidgetSortOrderBy(
new WidgetFormulaSort()
.type(FormulaType.FORMULA)
.index(0L)
.order(WidgetSort.DESCENDING)))))
.responseFormat(FormulaAndFunctionResponseFormat.SCALAR)))))));

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