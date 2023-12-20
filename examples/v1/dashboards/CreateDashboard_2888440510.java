// Create a new dashboard with split graph widget from distribution widget

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.DistributionWidgetDefinition;
import com.datadog.api.client.v1.model.DistributionWidgetDefinitionType;
import com.datadog.api.client.v1.model.DistributionWidgetRequest;
import com.datadog.api.client.v1.model.DistributionWidgetXAxis;
import com.datadog.api.client.v1.model.DistributionWidgetYAxis;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricAggregation;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionMetricQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.SplitConfig;
import com.datadog.api.client.v1.model.SplitConfigSortCompute;
import com.datadog.api.client.v1.model.SplitDimension;
import com.datadog.api.client.v1.model.SplitGraphSourceWidgetDefinition;
import com.datadog.api.client.v1.model.SplitGraphVizSize;
import com.datadog.api.client.v1.model.SplitGraphWidgetDefinition;
import com.datadog.api.client.v1.model.SplitGraphWidgetDefinitionType;
import com.datadog.api.client.v1.model.SplitSort;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetSort;
import com.datadog.api.client.v1.model.WidgetTextAlign;
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
                        .layout(new WidgetLayout().x(0L).y(0L).width(12L).height(8L))
                        .definition(
                            new WidgetDefinition(
                                new SplitGraphWidgetDefinition()
                                    .title("")
                                    .type(SplitGraphWidgetDefinitionType.SPLIT_GROUP)
                                    .sourceWidgetDefinition(
                                        new SplitGraphSourceWidgetDefinition(
                                            new DistributionWidgetDefinition()
                                                .title("")
                                                .titleSize("16")
                                                .titleAlign(WidgetTextAlign.LEFT)
                                                .type(DistributionWidgetDefinitionType.DISTRIBUTION)
                                                .requests(
                                                    Collections.singletonList(
                                                        new DistributionWidgetRequest()
                                                            .responseFormat(
                                                                FormulaAndFunctionResponseFormat
                                                                    .SCALAR)
                                                            .queries(
                                                                Collections.singletonList(
                                                                    new FormulaAndFunctionQueryDefinition(
                                                                        new FormulaAndFunctionMetricQueryDefinition()
                                                                            .dataSource(
                                                                                FormulaAndFunctionMetricDataSource
                                                                                    .METRICS)
                                                                            .name("query1")
                                                                            .query(
                                                                                "avg:system.cpu.user{*}"
                                                                                    + " by {service}")
                                                                            .aggregator(
                                                                                FormulaAndFunctionMetricAggregation
                                                                                    .AVG))))))
                                                .xaxis(
                                                    new DistributionWidgetXAxis()
                                                        .scale("linear")
                                                        .includeZero(true)
                                                        .min("auto")
                                                        .max("auto"))
                                                .yaxis(
                                                    new DistributionWidgetYAxis()
                                                        .scale("linear")
                                                        .includeZero(true)
                                                        .min("auto")
                                                        .max("auto"))))
                                    .splitConfig(
                                        new SplitConfig()
                                            .splitDimensions(
                                                Collections.singletonList(
                                                    new SplitDimension().oneGraphPer("service")))
                                            .limit(6L)
                                            .sort(
                                                new SplitSort()
                                                    .compute(
                                                        new SplitConfigSortCompute()
                                                            .aggregation("sum")
                                                            .metric("system.cpu.user"))
                                                    .order(WidgetSort.DESCENDING)))
                                    .size(SplitGraphVizSize.MD)))))
            .layoutType(DashboardLayoutType.ORDERED)
            .isReadOnly(false);

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
