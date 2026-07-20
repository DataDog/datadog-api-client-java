// Create a new dashboard with topology_map data_streams widget

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.TopologyMapWidgetDefinition;
import com.datadog.api.client.v1.model.TopologyMapWidgetDefinitionDataStreams;
import com.datadog.api.client.v1.model.TopologyMapWidgetDefinitionType;
import com.datadog.api.client.v1.model.TopologyQueryDataStreams;
import com.datadog.api.client.v1.model.TopologyQueryDataStreamsDataSource;
import com.datadog.api.client.v1.model.TopologyRequestDataStreams;
import com.datadog.api.client.v1.model.TopologyRequestType;
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
            .description("")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .layout(new WidgetLayout().x(0L).y(0L).width(47L).height(15L))
                        .definition(
                            new WidgetDefinition(
                                new TopologyMapWidgetDefinition(
                                    new TopologyMapWidgetDefinitionDataStreams()
                                        .title("")
                                        .titleSize("16")
                                        .titleAlign(WidgetTextAlign.LEFT)
                                        .type(TopologyMapWidgetDefinitionType.TOPOLOGY_MAP)
                                        .requests(
                                            Collections.singletonList(
                                                new TopologyRequestDataStreams()
                                                    .requestType(TopologyRequestType.TOPOLOGY)
                                                    .query(
                                                        new TopologyQueryDataStreams()
                                                            .dataSource(
                                                                TopologyQueryDataStreamsDataSource
                                                                    .DATA_STREAMS)
                                                            .service("")
                                                            .filters(
                                                                Collections.singletonList(
                                                                    "env:prod"))
                                                            .queryString(
                                                                "service:myservice")))))))))
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
