// Create a new dashboard with trace_service widget

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.Dashboard;
import com.datadog.api.v1.client.model.DashboardLayoutType;
import com.datadog.api.v1.client.model.DashboardTemplateVariable;
import com.datadog.api.v1.client.model.ServiceSummaryWidgetDefinition;
import com.datadog.api.v1.client.model.ServiceSummaryWidgetDefinitionType;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.datadog.api.v1.client.model.WidgetLayout;
import com.datadog.api.v1.client.model.WidgetServiceSummaryDisplayFormat;
import com.datadog.api.v1.client.model.WidgetSizeFormat;
import com.datadog.api.v1.client.model.WidgetTime;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    Dashboard body =
        new Dashboard()
            .title("Test-Example-Create_a_new_dashboard_with_trace_service_widget")
            .description("")
            .widgets(
                new ArrayList<Widget>() {
                  {
                    add(
                        new Widget()
                            .layout(new WidgetLayout().x(0L).y(0L).width(72L).height(72L))
                            .definition(
                                new WidgetDefinition(
                                    new ServiceSummaryWidgetDefinition()
                                        .title("Service Summary")
                                        .time(new WidgetTime())
                                        .type(ServiceSummaryWidgetDefinitionType.TRACE_SERVICE)
                                        .env("none")
                                        .service("")
                                        .spanName("")
                                        .showHits(true)
                                        .showErrors(true)
                                        .showLatency(true)
                                        .showBreakdown(true)
                                        .showDistribution(true)
                                        .showResourceList(false)
                                        .sizeFormat(WidgetSizeFormat.MEDIUM)
                                        .displayFormat(
                                            WidgetServiceSummaryDisplayFormat.TWO_COLUMN))));
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
