// Create a new dashboard with sunburst widget and metrics data

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
import com.datadog.api.client.v1.model.SunburstWidgetDefinition;
import com.datadog.api.client.v1.model.SunburstWidgetDefinitionType;
import com.datadog.api.client.v1.model.SunburstWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetFormula;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetStyle;
import com.datadog.api.client.v1.model.WidgetTextAlign;
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
.widgets(Collections.singletonList(new Widget()
.definition(new WidgetDefinition(
new SunburstWidgetDefinition()
.title("")
.titleSize("16")
.titleAlign(WidgetTextAlign.LEFT)
.type(SunburstWidgetDefinitionType.SUNBURST)
.requests(Collections.singletonList(new SunburstWidgetRequest()
.responseFormat(FormulaAndFunctionResponseFormat.SCALAR)
.formulas(Collections.singletonList(new WidgetFormula()
.formula("query1")))
.queries(Collections.singletonList(new FormulaAndFunctionQueryDefinition(
new FormulaAndFunctionMetricQueryDefinition()
.query("sum:system.mem.used{*} by {service}")
.dataSource(FormulaAndFunctionMetricDataSource.METRICS)
.name("query1")
.aggregator(FormulaAndFunctionMetricAggregation.SUM))))
.style(new WidgetStyle()
.palette("dog_classic"))))))
.layout(new WidgetLayout()
.x(0L)
.y(0L)
.width(4L)
.height(4L))))
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