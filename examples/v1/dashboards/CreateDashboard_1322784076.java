// Create a heatgrid widget with custom discrete thresholds

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.HeatgridColor;
import com.datadog.api.client.v1.model.HeatgridColorBin;
import com.datadog.api.client.v1.model.HeatgridColorConfig;
import com.datadog.api.client.v1.model.HeatgridCustomColorSource;
import com.datadog.api.client.v1.model.HeatgridDiscreteCustomColor;
import com.datadog.api.client.v1.model.HeatgridDiscreteMode;
import com.datadog.api.client.v1.model.HeatgridLabelColumn;
import com.datadog.api.client.v1.model.HeatgridLabelColumnWidth;
import com.datadog.api.client.v1.model.HeatgridLegend;
import com.datadog.api.client.v1.model.HeatgridNestingDisplay;
import com.datadog.api.client.v1.model.HeatgridSort;
import com.datadog.api.client.v1.model.HeatgridSortBy;
import com.datadog.api.client.v1.model.HeatgridSortByLabel;
import com.datadog.api.client.v1.model.HeatgridSortByLabelProperty;
import com.datadog.api.client.v1.model.HeatgridSortOrder;
import com.datadog.api.client.v1.model.HeatgridWidgetDefinition;
import com.datadog.api.client.v1.model.HeatgridWidgetDefinitionType;
import com.datadog.api.client.v1.model.HeatgridWidgetFormula;
import com.datadog.api.client.v1.model.HeatgridWidgetRequest;
import com.datadog.api.client.v1.model.HeatgridWidgetResponseFormat;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Dashboard")
            .layoutType(DashboardLayoutType.ORDERED)
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new HeatgridWidgetDefinition()
                                    .type(HeatgridWidgetDefinitionType.HEATGRID)
                                    .requests(
                                        Collections.singletonList(
                                            new HeatgridWidgetRequest()
                                                .responseFormat(
                                                    HeatgridWidgetResponseFormat.TIMESERIES)
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
                                                                        + " {host}"))))
                                                .formulas(
                                                    Collections.singletonList(
                                                        new HeatgridWidgetFormula()
                                                            .formula("query1")))))
                                    .sort(
                                        new HeatgridSort()
                                            .nestingDisplay(HeatgridNestingDisplay.FLAT)
                                            .sortBy(
                                                new HeatgridSortBy(
                                                    new HeatgridSortByLabel()
                                                        .property(HeatgridSortByLabelProperty.LABEL)
                                                        .order(HeatgridSortOrder.ASC))))
                                    .color(
                                        new HeatgridColorConfig(
                                            new HeatgridDiscreteCustomColor()
                                                .mode(HeatgridDiscreteMode.DISCRETE)
                                                .source(HeatgridCustomColorSource.CUSTOM)
                                                .bins(
                                                    Arrays.asList(
                                                        new HeatgridColorBin()
                                                            .color(new HeatgridColor("#00FF00")),
                                                        new HeatgridColorBin()
                                                            .color(new HeatgridColor("#FF0000"))
                                                            .lowerBound(80.0)))))
                                    .legend(new HeatgridLegend().showCaption(true))
                                    .labelColumn(
                                        new HeatgridLabelColumn()
                                            .width(HeatgridLabelColumnWidth.M))))));

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
