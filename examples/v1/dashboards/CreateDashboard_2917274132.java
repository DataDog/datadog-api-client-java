// Create a new dashboard with manage_status widget

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.MonitorSummaryWidgetDefinition;
import com.datadog.api.v1.client.model.MonitorSummaryWidgetDefinitionType;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetColorPreference;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetLayout;
import com.datadog.api.v1.client.model.WidgetMonitorSummaryDisplayFormat;
import com.datadog.api.v1.client.model.WidgetMonitorSummarySort;
import com.datadog.api.v1.client.model.WidgetSummaryType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
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
