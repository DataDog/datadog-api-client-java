// Create a new dashboard with slo list widget

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.SLOListWidgetDefinition;
import com.datadog.api.client.v1.model.SLOListWidgetDefinitionType;
import com.datadog.api.client.v1.model.SLOListWidgetQuery;
import com.datadog.api.client.v1.model.SLOListWidgetRequest;
import com.datadog.api.client.v1.model.SLOListWidgetRequestType;
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
            .title("Example-Create_a_new_dashboard_with_slo_list_widget")
            .description("")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .layout(new WidgetLayout().x(0L).y(0L).width(60L).height(21L))
                        .definition(
                            new WidgetDefinition(
                                new SLOListWidgetDefinition()
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .type(SLOListWidgetDefinitionType.SLO_LIST)
                                    .requests(
                                        Collections.singletonList(
                                            new SLOListWidgetRequest()
                                                .query(
                                                    new SLOListWidgetQuery()
                                                        .queryString("env:prod AND service:my-app")
                                                        .limit(75L))
                                                .requestType(
                                                    SLOListWidgetRequestType.SLO_LIST)))))))
            .layoutType(DashboardLayoutType.FREE)
            .isReadOnly(false);

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
