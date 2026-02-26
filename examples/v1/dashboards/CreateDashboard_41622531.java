// Create a new dashboard with timeseries widget and formula style attributes

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
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinition;
import com.datadog.api.client.v1.model.TimeseriesWidgetDefinitionType;
import com.datadog.api.client.v1.model.TimeseriesWidgetLegendColumn;
import com.datadog.api.client.v1.model.TimeseriesWidgetLegendLayout;
import com.datadog.api.client.v1.model.TimeseriesWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetDisplayType;
import com.datadog.api.client.v1.model.WidgetFormula;
import com.datadog.api.client.v1.model.WidgetFormulaStyle;
import com.datadog.api.client.v1.model.WidgetLegacyLiveSpan;
import com.datadog.api.client.v1.model.WidgetLineType;
import com.datadog.api.client.v1.model.WidgetLineWidth;
import com.datadog.api.client.v1.model.WidgetRequestStyle;
import com.datadog.api.client.v1.model.WidgetTime;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Dashboard with formula style")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new TimeseriesWidgetDefinition()
                                    .title("styled timeseries")
                                    .showLegend(true)
                                    .legendLayout(TimeseriesWidgetLegendLayout.AUTO)
                                    .legendColumns(
                                        Arrays.asList(
                                            TimeseriesWidgetLegendColumn.AVG,
                                            TimeseriesWidgetLegendColumn.MIN,
                                            TimeseriesWidgetLegendColumn.MAX,
                                            TimeseriesWidgetLegendColumn.VALUE,
                                            TimeseriesWidgetLegendColumn.SUM))
                                    .time(new WidgetTime(new WidgetLegacyLiveSpan()))
                                    .type(TimeseriesWidgetDefinitionType.TIMESERIES)
                                    .requests(
                                        Collections.singletonList(
                                            new TimeseriesWidgetRequest()
                                                .formulas(
                                                    Collections.singletonList(
                                                        new WidgetFormula()
                                                            .formula("query1")
                                                            .style(
                                                                new WidgetFormulaStyle()
                                                                    .paletteIndex(4L)
                                                                    .palette("classic"))))
                                                .queries(
                                                    Collections.singletonList(
                                                        new FormulaAndFunctionQueryDefinition(
                                                            new FormulaAndFunctionMetricQueryDefinition()
                                                                .query("avg:system.cpu.user{*}")
                                                                .dataSource(
                                                                    FormulaAndFunctionMetricDataSource
                                                                        .METRICS)
                                                                .name("query1"))))
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.TIMESERIES)
                                                .style(
                                                    new WidgetRequestStyle()
                                                        .palette("dog_classic")
                                                        .lineType(WidgetLineType.SOLID)
                                                        .lineWidth(WidgetLineWidth.NORMAL))
                                                .displayType(WidgetDisplayType.LINE)))))))
            .layoutType(DashboardLayoutType.ORDERED)
            .reflowType(DashboardReflowType.AUTO);

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
