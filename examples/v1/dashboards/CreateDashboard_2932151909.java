// Create a new dashboard with sankey widget and rum data source

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.SankeyRumDataSource;
import com.datadog.api.client.v1.model.SankeyRumQuery;
import com.datadog.api.client.v1.model.SankeyRumQueryMode;
import com.datadog.api.client.v1.model.SankeyRumRequest;
import com.datadog.api.client.v1.model.SankeyWidgetDefinition;
import com.datadog.api.client.v1.model.SankeyWidgetDefinitionType;
import com.datadog.api.client.v1.model.SankeyWidgetRequest;
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
                                new SankeyWidgetDefinition()
                                    .title("")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .type(SankeyWidgetDefinitionType.SANKEY)
                                    .requests(
                                        Collections.singletonList(
                                            new SankeyWidgetRequest(
                                                new SankeyRumRequest()
                                                    .query(
                                                        new SankeyRumQuery()
                                                            .dataSource(SankeyRumDataSource.RUM)
                                                            .queryString("@type:view")
                                                            .mode(SankeyRumQueryMode.SOURCE))
                                                    .requestType(
                                                        SankeyWidgetDefinitionType.SANKEY))))))))
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
