// Create a new dashboard with a timeseries widget using formulas and functions metrics query with combined semantic_mode

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricSemanticMode;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinition;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.client.v1.model.TimeseriesWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetDisplayType;
import com.datadog.api.client.v1.model.WidgetFormula;
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
.title("Example-Dashboard with combined semantic_mode")
.widgets(Collections.singletonList(new Widget()
.definition(new WidgetDefinition(
new TimeseriesWidgetDefinition()
.type(TimeseriesWidgetDefinitionType.TIMESERIES)
.requests(Collections.singletonList(new TimeseriesWidgetRequest()
.queries(Collections.singletonList(new FormulaAndFunctionQueryDefinition(
new FormulaAndFunctionMetricQueryDefinition()
.dataSource(FormulaAndFunctionMetricDataSource.METRICS)
.name("query1")
.query("avg:system.cpu.user{*}")
.semanticMode(FormulaAndFunctionMetricSemanticMode.COMBINED))))
.responseFormat(FormulaAndFunctionResponseFormat.TIMESERIES)
.formulas(Collections.singletonList(new WidgetFormula()
.formula("query1")))
.displayType(WidgetDisplayType.LINE)))))));

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