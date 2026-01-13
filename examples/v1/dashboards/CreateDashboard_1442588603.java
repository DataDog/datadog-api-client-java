// Create a distribution widget using a histogram request containing a formulas and functions APM
// Stats query

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.DistributionWidgetDefinition;
import com.datadog.api.client.v1.model.DistributionWidgetDefinitionType;
import com.datadog.api.client.v1.model.DistributionWidgetHistogramRequestQuery;
import com.datadog.api.client.v1.model.DistributionWidgetRequest;
import com.datadog.api.client.v1.model.DistributionWidgetXAxis;
import com.datadog.api.client.v1.model.DistributionWidgetYAxis;
import com.datadog.api.client.v1.model.FormulaAndFunctionApmResourceStatName;
import com.datadog.api.client.v1.model.FormulaAndFunctionApmResourceStatsDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionApmResourceStatsQueryDefinition;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetHistogramRequestType;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetStyle;
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
                        .definition(
                            new WidgetDefinition(
                                new DistributionWidgetDefinition()
                                    .title("APM Stats - Request latency HOP")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .showLegend(false)
                                    .type(DistributionWidgetDefinitionType.DISTRIBUTION)
                                    .xaxis(
                                        new DistributionWidgetXAxis()
                                            .max("auto")
                                            .includeZero(true)
                                            .scale("linear")
                                            .min("auto"))
                                    .yaxis(
                                        new DistributionWidgetYAxis()
                                            .max("auto")
                                            .includeZero(true)
                                            .scale("linear")
                                            .min("auto"))
                                    .requests(
                                        Collections.singletonList(
                                            new DistributionWidgetRequest()
                                                .query(
                                                    new DistributionWidgetHistogramRequestQuery(
                                                        new FormulaAndFunctionApmResourceStatsQueryDefinition()
                                                            .primaryTagValue("*")
                                                            .stat(
                                                                FormulaAndFunctionApmResourceStatName
                                                                    .LATENCY_DISTRIBUTION)
                                                            .dataSource(
                                                                FormulaAndFunctionApmResourceStatsDataSource
                                                                    .APM_RESOURCE_STATS)
                                                            .name("query1")
                                                            .service("azure-bill-import")
                                                            .groupBy(
                                                                Collections.singletonList(
                                                                    "resource_name"))
                                                            .env("staging")
                                                            .primaryTagName("datacenter")
                                                            .operationName(
                                                                "universal.http.client")))
                                                .requestType(WidgetHistogramRequestType.HISTOGRAM)
                                                .style(new WidgetStyle().palette("dog_classic"))))))
                        .layout(new WidgetLayout().x(8L).y(0L).width(4L).height(2L))))
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
