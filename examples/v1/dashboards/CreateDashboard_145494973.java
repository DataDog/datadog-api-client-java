// Create a new dashboard with apm resource stats widget

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionApmResourceStatName;
import com.datadog.api.client.v1.model.FormulaAndFunctionApmResourceStatsDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionApmResourceStatsQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.TableWidgetDefinition;
import com.datadog.api.client.v1.model.TableWidgetDefinitionType;
import com.datadog.api.client.v1.model.TableWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetTextAlign;
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
                                new TableWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .type(TableWidgetDefinitionType.QUERY_TABLE)
                                    .requests(
                                        Collections.singletonList(
                                            new TableWidgetRequest()
                                                .responseFormat(
                                                    FormulaAndFunctionResponseFormat.SCALAR)
                                                .queries(
                                                    Collections.singletonList(
                                                        new FormulaAndFunctionQueryDefinition(
                                                            new FormulaAndFunctionApmResourceStatsQueryDefinition()
                                                                .primaryTagValue(
                                                                    "edge-eu1.prod.dog")
                                                                .stat(
                                                                    FormulaAndFunctionApmResourceStatName
                                                                        .HITS)
                                                                .name("query1")
                                                                .service("cassandra")
                                                                .dataSource(
                                                                    FormulaAndFunctionApmResourceStatsDataSource
                                                                        .APM_RESOURCE_STATS)
                                                                .env("ci")
                                                                .primaryTagName("datacenter")
                                                                .operationName("cassandra.query")
                                                                .groupBy(
                                                                    Collections.singletonList(
                                                                        "resource_name")))))))))
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
