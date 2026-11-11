// Create a heatgrid widget with bin labels and formatted row labels

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
import com.datadog.api.client.v1.model.HeatgridNestingDisplay;
import com.datadog.api.client.v1.model.HeatgridSort;
import com.datadog.api.client.v1.model.HeatgridSortBy;
import com.datadog.api.client.v1.model.HeatgridSortByLabel;
import com.datadog.api.client.v1.model.HeatgridSortByLabelProperty;
import com.datadog.api.client.v1.model.HeatgridSortOrder;
import com.datadog.api.client.v1.model.HeatgridTextFormatMatch;
import com.datadog.api.client.v1.model.HeatgridTextFormatMatchType;
import com.datadog.api.client.v1.model.HeatgridTextFormatReplace;
import com.datadog.api.client.v1.model.HeatgridTextFormatReplaceAll;
import com.datadog.api.client.v1.model.HeatgridTextFormatReplaceAllType;
import com.datadog.api.client.v1.model.HeatgridTextFormatReplaceSubstring;
import com.datadog.api.client.v1.model.HeatgridTextFormatReplaceSubstringType;
import com.datadog.api.client.v1.model.HeatgridTextFormatRule;
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
                                                            .color(new HeatgridColor("#00FF00"))
                                                            .label("Normal"),
                                                        new HeatgridColorBin()
                                                            .color(new HeatgridColor("#FF0000"))
                                                            .lowerBound(80.0)
                                                            .label("High")))))
                                    .labelColumn(
                                        new HeatgridLabelColumn()
                                            .textFormats(
                                                Arrays.asList(
                                                    new HeatgridTextFormatRule()
                                                        .match(
                                                            new HeatgridTextFormatMatch()
                                                                .type(
                                                                    HeatgridTextFormatMatchType
                                                                        .STARTS_WITH)
                                                                .value("api-"))
                                                        .replace(
                                                            new HeatgridTextFormatReplace(
                                                                new HeatgridTextFormatReplaceSubstring()
                                                                    .type(
                                                                        HeatgridTextFormatReplaceSubstringType
                                                                            .SUBSTRING)
                                                                    .substring("api-")
                                                                    .with(""))),
                                                    new HeatgridTextFormatRule()
                                                        .match(
                                                            new HeatgridTextFormatMatch()
                                                                .type(
                                                                    HeatgridTextFormatMatchType.IS)
                                                                .value("unknown"))
                                                        .replace(
                                                            new HeatgridTextFormatReplace(
                                                                new HeatgridTextFormatReplaceAll()
                                                                    .type(
                                                                        HeatgridTextFormatReplaceAllType
                                                                            .ALL)
                                                                    .with("Other"))))))))));

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
