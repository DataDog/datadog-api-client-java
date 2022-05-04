// Create a new dashboard with funnel widget

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.FunnelQuery;
import com.datadog.api.v1.client.model.FunnelRequestType;
import com.datadog.api.v1.client.model.FunnelSource;
import com.datadog.api.v1.client.model.FunnelWidgetDefinition;
import com.datadog.api.v1.client.model.FunnelWidgetDefinitionType;
import com.datadog.api.v1.client.model.FunnelWidgetRequest;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .layoutType(DashboardLayoutType.ORDERED)
            .title("Example-Create_a_new_dashboard_with_funnel_widget with funnel widget")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .definition(
                            new WidgetDefinition(
                                new FunnelWidgetDefinition()
                                    .type(FunnelWidgetDefinitionType.FUNNEL)
                                    .requests(
                                        Collections.singletonList(
                                            new FunnelWidgetRequest()
                                                .query(
                                                    new FunnelQuery()
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
