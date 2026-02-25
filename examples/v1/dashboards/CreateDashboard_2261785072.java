// Create a new dashboard with a timeseries widget and an overlay request

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinition;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.client.v1.model.TimeseriesWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetDisplayType;
import com.datadog.api.client.v1.model.WidgetLineType;
import com.datadog.api.client.v1.model.WidgetLineWidth;
import com.datadog.api.client.v1.model.WidgetRequestStyle;
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
.title("Example-Dashboard")
.widgets(Collections.singletonList(new Widget()
.definition(new WidgetDefinition(
new TimeseriesWidgetDefinition()
.type(TimeseriesWidgetDefinitionType.TIMESERIES)
.requests(Arrays.asList(new TimeseriesWidgetRequest()
.onRightYaxis(false)
.queries(Collections.singletonList(new FormulaAndFunctionQueryDefinition(
new FormulaAndFunctionMetricQueryDefinition()
.dataSource(FormulaAndFunctionMetricDataSource.METRICS)
.name("mymetric")
.query("avg:system.cpu.user{*}"))))
.responseFormat(FormulaAndFunctionResponseFormat.TIMESERIES)
.displayType(WidgetDisplayType.LINE), new TimeseriesWidgetRequest()
.responseFormat(FormulaAndFunctionResponseFormat.TIMESERIES)
.queries(Collections.singletonList(new FormulaAndFunctionQueryDefinition(
new FormulaAndFunctionMetricQueryDefinition()
.dataSource(FormulaAndFunctionMetricDataSource.METRICS)
.name("mymetricoverlay")
.query("avg:system.cpu.user{*}"))))
.style(new WidgetRequestStyle()
.palette("purple")
.lineType(WidgetLineType.SOLID)
.lineWidth(WidgetLineWidth.NORMAL))
.displayType(WidgetDisplayType.OVERLAY)))))));

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