// Create a new dashboard with topology_map widget

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.TopologyMapWidgetDefinition;
import com.datadog.api.client.v1.model.TopologyMapWidgetDefinitionType;
import com.datadog.api.client.v1.model.TopologyQuery;
import com.datadog.api.client.v1.model.TopologyQueryDataSource;
import com.datadog.api.client.v1.model.TopologyRequest;
import com.datadog.api.client.v1.model.TopologyRequestType;
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
.description("")
.widgets(Collections.singletonList(new Widget()
.layout(new WidgetLayout()
.x(0L)
.y(0L)
.width(47L)
.height(15L))
.definition(new WidgetDefinition(
new TopologyMapWidgetDefinition()
.title("")
.titleSize("16")
.titleAlign(WidgetTextAlign.LEFT)
.type(TopologyMapWidgetDefinitionType.TOPOLOGY_MAP)
.requests(Collections.singletonList(new TopologyRequest()
.requestType(TopologyRequestType.TOPOLOGY)
.query(new TopologyQuery()
.dataSource(TopologyQueryDataSource.SERVICE_MAP)
.service("")
.filters(Arrays.asList("env:none", "environment:*")))))))))
.layoutType(DashboardLayoutType.FREE);

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