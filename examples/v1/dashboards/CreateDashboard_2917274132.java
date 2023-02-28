// Create a new dashboard with manage_status widget

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.MonitorSummaryWidgetDefinition;
import com.datadog.api.client.v1.model.MonitorSummaryWidgetDefinitionType;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetColorPreference;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetMonitorSummaryDisplayFormat;
import com.datadog.api.client.v1.model.WidgetMonitorSummarySort;
import com.datadog.api.client.v1.model.WidgetSummaryType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Create_a_new_dashboard_with_manage_status_widget")
            .description("")
            .widgets(
                Collections.singletonList(
                    new Widget()
                        .layout(new WidgetLayout().x(0L).y(0L).width(50L).height(25L))
                        .definition(
                            new WidgetDefinition(
                                new MonitorSummaryWidgetDefinition()
                                    .type(MonitorSummaryWidgetDefinitionType.MANAGE_STATUS)
                                    .summaryType(WidgetSummaryType.MONITORS)
                                    .displayFormat(
                                        WidgetMonitorSummaryDisplayFormat.COUNTS_AND_LIST)
                                    .colorPreference(WidgetColorPreference.TEXT)
                                    .hideZeroCounts(true)
                                    .showLastTriggered(false)
                                    .query("")
                                    .sort(WidgetMonitorSummarySort.STATUS_ASCENDING)
                                    .count(50L)
                                    .start(0L)))))
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
