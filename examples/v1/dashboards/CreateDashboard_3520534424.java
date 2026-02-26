// Create a new dashboard with timeseries widget with custom_unit

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.DashboardReflowType;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.NumberFormatUnit;
import com.datadog.api.client.v1.model.NumberFormatUnitCanonical;
import com.datadog.api.client.v1.model.NumberFormatUnitScale;
import com.datadog.api.client.v1.model.NumberFormatUnitScaleType;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinition;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.client.v1.model.TimeseriesWidgetLegendLayout;
import com.datadog.api.client.v1.model.TimeseriesWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetDisplayType;
import com.datadog.api.client.v1.model.WidgetFormula;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetLegacyLiveSpan;
import com.datadog.api.client.v1.model.WidgetNumberFormat;
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
                        .definition(
                            new WidgetDefinition(
                                new TimeseriesWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .showLegend(true)
                                    .legendLayout(TimeseriesWidgetLegendLayout.AUTO)
                                    .time(new WidgetTime(new WidgetLegacyLiveSpan()))
                                    .type(TimeseriesWidgetDefinitionType.TIMESERIES)
                                    .requests(
                                        Collections.singletonList(
                                            new TimeseriesWidgetRequest()
                                                .formulas(
                                                    Collections.singletonList(
                                                        new WidgetFormula()
                                                            .formula("query1")
                                                            .numberFormat(
                                                                new WidgetNumberFormat()
                                                                    .unitScale(
                                                                        new NumberFormatUnitScale()
                                                                            .type(
                                                                                NumberFormatUnitScaleType
                                                                                    .CANONICAL_UNIT)
                                                                            .unitName("apdex"))
                                                                    .unit(
                                                                        new NumberFormatUnit(
                                                                            new NumberFormatUnitCanonical()
                                                                                .type(
                                                                                    NumberFormatUnitScaleType
                                                                                        .CANONICAL_UNIT)
                                                                                .unitName(
                                                                                    "fraction"))))))
                                                .queries(
                                                    Collections.singletonList(
                                                        new FormulaAndFunctionQueryDefinition(
                                                            new FormulaAndFunctionMetricQueryDefinition()
                                                                .dataSource(
                                                                    FormulaAndFunctionMetricDataSource
                                                                        .METRICS)
                                                                .name("query1")
                                                                .query("avg:system.cpu.user{*}"))))
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.TIMESERIES)
                                                .displayType(WidgetDisplayType.LINE)))))
                        .layout(new WidgetLayout().x(0L).y(0L).width(12L).height(5L))))
            .layoutType(DashboardLayoutType.ORDERED)
            .reflowType(DashboardReflowType.FIXED);

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
