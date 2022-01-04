// Create a new dashboard with log_stream widget

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.DashboardTemplateVariable;
import com.datadog.api.v1.client.model.LogStreamWidgetDefinition;
import com.datadog.api.v1.client.model.LogStreamWidgetDefinitionType;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetFieldSort;
import com.datadog.api.v1.client.model.WidgetLayout;
import com.datadog.api.v1.client.model.WidgetMessageDisplay;
import com.datadog.api.v1.client.model.WidgetSort;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Example-Create_a_new_dashboard_with_log_stream_widget")
            .description("")
            .widgets(
                new ArrayList<Widget>() {
                  {
                    add(
                        new Widget()
                            .layout(new WidgetLayout().x(0L).y(0L).width(47L).height(36L))
                            .definition(
                                new WidgetDefinition(
                                    new LogStreamWidgetDefinition()
                                        .title("")
                                        .titleSize("16")
                                        .titleAlign(WidgetTextAlign.LEFT)
                                        .type(LogStreamWidgetDefinitionType.LOG_STREAM)
                                        .indexes(
                                            new ArrayList<String>() {
                                              {
                                                add("main");
                                              }
                                            })
                                        .query("")
                                        .sort(
                                            new WidgetFieldSort()
                                                .column("time")
                                                .order(WidgetSort.DESCENDING))
                                        .columns(
                                            new ArrayList<String>() {
                                              {
                                                add("host");
                                                add("service");
                                              }
                                            })
                                        .showDateColumn(true)
                                        .showMessageColumn(true)
                                        .messageDisplay(WidgetMessageDisplay.EXPANDED_MEDIUM))));
                  }
                })
            .templateVariables(
                new ArrayList<DashboardTemplateVariable>() {
                  {
                    ;
                  }
                })
            .layoutType(DashboardLayoutType.FREE)
            .isReadOnly(false)
            .notifyList(
                new ArrayList<String>() {
                  {
                    ;
                  }
                });

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
