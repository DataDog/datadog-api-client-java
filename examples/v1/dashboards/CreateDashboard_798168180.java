// Create a new dashboard with apm dependency stats widget

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.FormulaAndFunctionApmDependencyStatName;
import com.datadog.api.v1.client.model.FormulaAndFunctionApmDependencyStatsDataSource;
import com.datadog.api.v1.client.model.FormulaAndFunctionApmDependencyStatsQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.v1.client.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.v1.client.model.TableWidgetDefinition;
import com.datadog.api.v1.client.model.TableWidgetDefinitionType;
import com.datadog.api.v1.client.model.TableWidgetRequest;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetLayout;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Create_a_new_dashboard_with_apm_dependency_stats_widget")
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
                                                            new FormulaAndFunctionApmDependencyStatsQueryDefinition()
                                                                .primaryTagValue(
                                                                    "edge-eu1.prod.dog")
                                                                .stat(
                                                                    FormulaAndFunctionApmDependencyStatName
                                                                        .AVG_DURATION)
                                                                .resourceName(
                                                                    "DELETE FROM"
                                                                        + " monitor_history.monitor_state_change_history"
                                                                        + " WHERE org_id = ? AND"
                                                                        + " monitor_id IN ? AND"
                                                                        + " group = ?")
                                                                .name("query1")
                                                                .service("cassandra")
                                                                .dataSource(
                                                                    FormulaAndFunctionApmDependencyStatsDataSource
                                                                        .APM_DEPENDENCY_STATS)
                                                                .env("ci")
                                                                .primaryTagName("datacenter")
                                                                .operationName(
                                                                    "cassandra.query"))))))))
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
