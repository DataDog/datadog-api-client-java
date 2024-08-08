// Create a new dashboard with apm dependency stats widget

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FormulaAndFunctionApmDependencyStatName;
import com.datadog.api.client.v1.model.FormulaAndFunctionApmDependencyStatsDataSource;
import com.datadog.api.client.v1.model.FormulaAndFunctionApmDependencyStatsQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionQueryDefinition;
import com.datadog.api.client.v1.model.FormulaAndFunctionResponseFormat;
import com.datadog.api.client.v1.model.TableWidgetDefinition;
import com.datadog.api.client.v1.model.TableWidgetDefinitionType;
import com.datadog.api.client.v1.model.TableWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetTextAlign;
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
.title("Example-Dashboard")
.widgets(Collections.singletonList(new Widget()
.definition(new WidgetDefinition(
new TableWidgetDefinition()
.title("")
.titleSize("16")
.titleAlign(WidgetTextAlign.LEFT)
.type(TableWidgetDefinitionType.QUERY_TABLE)
.requests(Collections.singletonList(new TableWidgetRequest()
.responseFormat(FormulaAndFunctionResponseFormat.SCALAR)
.queries(Collections.singletonList(new FormulaAndFunctionQueryDefinition(
new FormulaAndFunctionApmDependencyStatsQueryDefinition()
.primaryTagValue("edge-eu1.prod.dog")
.stat(FormulaAndFunctionApmDependencyStatName.AVG_DURATION)
.resourceName("DELETE FROM monitor_history.monitor_state_change_history WHERE org_id = ? AND monitor_id IN ? AND group = ?")
.name("query1")
.service("cassandra")
.dataSource(FormulaAndFunctionApmDependencyStatsDataSource.APM_DEPENDENCY_STATS)
.env("ci")
.primaryTagName("datacenter")
.operationName("cassandra.query"))))))))
.layout(new WidgetLayout()
.x(0L)
.y(0L)
.width(4L)
.height(4L))))
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