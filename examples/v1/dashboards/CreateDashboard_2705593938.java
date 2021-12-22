// Create a new dashboard with sunburst widget and metrics data

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.FormulaAndFunctionMetricAggregation;
import com.datadog.api.v1.client.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.v1.client.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.v1.client.model.SunburstWidgetDefinition;
import com.datadog.api.v1.client.model.SunburstWidgetDefinitionType;
import com.datadog.api.v1.client.model.SunburstWidgetRequest;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetFormula;
import com.datadog.api.v1.client.model.WidgetLayout;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body = new Dashboard()
.title("Example-Create_a_new_dashboard_with_sunburst_widget_and_metrics_data")
.widgets(new ArrayList<Widget>() {{add(new Widget()
.definition(new WidgetDefinition(
new SunburstWidgetDefinition()
.title("")
.titleSize("16")
.titleAlign(WidgetTextAlign.LEFT)
.type(SunburstWidgetDefinitionType.SUNBURST)
.requests(new ArrayList<SunburstWidgetRequest>() {{add(new SunburstWidgetRequest()
.responseFormat(FormulaAndFunctionResponseFormat.SCALAR)
.formulas(new ArrayList<WidgetFormula>() {{add(new WidgetFormula()
.formula("query1"));}})
.queries(new ArrayList<FormulaAndFunctionQueryDefinition>() {{add(new FormulaAndFunctionQueryDefinition(
new FormulaAndFunctionMetricQueryDefinition()
.query("sum:system.mem.used{*} by {service}")
.dataSource(FormulaAndFunctionMetricDataSource.METRICS)
.name("query1")
.aggregator(FormulaAndFunctionMetricAggregation.SUM)));}}));}})))
.layout(new WidgetLayout()
.x(0L)
.y(0L)
.width(4L)
.height(4L)));}})
.layoutType(DashboardLayoutType.ORDERED);

    try {
      Dashboard result = apiInstance.createDashboard(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}