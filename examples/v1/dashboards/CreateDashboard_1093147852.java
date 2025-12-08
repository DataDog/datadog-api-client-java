// Create a new dashboard with distribution widget with markers and num_buckets

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
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetMarker;
import com.datadog.api.client.v1.model.WidgetTextAlign;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Dashboard")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new DistributionWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .type(DistributionWidgetDefinitionType.DISTRIBUTION)
                                    .xaxis(
                                        new DistributionWidgetXAxis()
                                            .scale("linear")
                                            .min("auto")
                                            .max("auto")
                                            .includeZero(true)
                                            .numBuckets(55L))
                                    .yaxis(
                                        new DistributionWidgetYAxis()
                                            .scale("linear")
                                            .min("auto")
                                            .max("auto")
                                            .includeZero(true))
                                    .markers(
                                        Arrays.asList(
                                            new WidgetMarker()
                                                .displayType("percentile")
                                                .value("50"),
                                            new WidgetMarker()
                                                .displayType("percentile")
                                                .value("99"),
                                            new WidgetMarker()
                                                .displayType("percentile")
                                                .value("90")))
                                    .requests(
                                        Collections.singletonList(
                                            new DistributionWidgetRequest()
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.SCALAR)
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
                                                                        + " {service}")
                                                                .aggregator(
                                                                    FormulaAndFunctionMetricAggregation
                                                                        .AVG))))))))
                        .layout(new WidgetLayout().x(0L).y(0L).width(4L).height(4L))))
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
