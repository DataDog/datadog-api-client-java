// Create a new dashboard with funnel widget

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.FunnelQuery;
import com.datadog.api.client.v1.model.FunnelRequestType;
import com.datadog.api.client.v1.model.FunnelSource;
import com.datadog.api.client.v1.model.FunnelWidgetDefinition;
import com.datadog.api.client.v1.model.FunnelWidgetDefinitionType;
import com.datadog.api.client.v1.model.FunnelWidgetRequest;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
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
.layoutType(DashboardLayoutType.ORDERED)
.title("Example-Dashboard with funnel widget")
.widgets(Collections.singletonList(new Widget()
.definition(new WidgetDefinition(
new FunnelWidgetDefinition()
.type(FunnelWidgetDefinitionType.FUNNEL)
.requests(Collections.singletonList(new FunnelWidgetRequest()
.query(new FunnelQuery()
.dataSource(FunnelSource.RUM)
.queryString(""))
.requestType(FunnelRequestType.FUNNEL)))))));

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