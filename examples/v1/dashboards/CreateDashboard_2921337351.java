// Create a new dashboard with trace_service widget

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.ServiceSummaryWidgetDefinition;
import com.datadog.api.client.v1.model.ServiceSummaryWidgetDefinitionType;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetLegacyLiveSpan;
import com.datadog.api.client.v1.model.WidgetServiceSummaryDisplayFormat;
import com.datadog.api.client.v1.model.WidgetSizeFormat;
import com.datadog.api.client.v1.model.WidgetTime;
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
                        .layout(new WidgetLayout().x(0L).y(0L).width(72L).height(72L))
                        .definition(
                            new WidgetDefinition(
                                new ServiceSummaryWidgetDefinition()
                                    .title("Service Summary")
                                    .time(new WidgetTime(new WidgetLegacyLiveSpan()))
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
                                    .displayFormat(WidgetServiceSummaryDisplayFormat.TWO_COLUMN)))))
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
