// Create a new dashboard with distribution widget and apm stats data

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.ApmStatsQueryDefinition;
import com.datadog.api.v1.client.model.ApmStatsQueryRowType;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.DistributionWidgetDefinition;
import com.datadog.api.v1.client.model.DistributionWidgetDefinitionType;
import com.datadog.api.v1.client.model.DistributionWidgetRequest;
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
            .title("Example-Create_a_new_dashboard_with_distribution_widget_and_apm_stats_data")
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
                                    .requests(
                                        Collections.singletonList(
                                            new DistributionWidgetRequest()
                                                .apmStatsQuery(
                                                    new ApmStatsQueryDefinition()
                                                        .env("prod")
                                                        .service("cassandra")
                                                        .name("cassandra.query")
                                                        .primaryTag("datacenter:dc1")
                                                        .rowType(ApmStatsQueryRowType.SERVICE))))))
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
