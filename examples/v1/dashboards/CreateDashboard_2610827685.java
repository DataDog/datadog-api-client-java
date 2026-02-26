// Create a new dashboard with run-workflow widget

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;
import com.datadog.api.client.v1.model.DashboardLayoutType;
import com.datadog.api.client.v1.model.RunWorkflowWidgetDefinition;
import com.datadog.api.client.v1.model.RunWorkflowWidgetDefinitionType;
import com.datadog.api.client.v1.model.RunWorkflowWidgetInput;
import com.datadog.api.client.v1.model.Widget;
import com.datadog.api.client.v1.model.WidgetDefinition;
import com.datadog.api.client.v1.model.WidgetLayout;
import com.datadog.api.client.v1.model.WidgetLegacyLiveSpan;
import com.datadog.api.client.v1.model.WidgetTextAlign;
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
                        .layout(new WidgetLayout().x(0L).y(0L).width(47L).height(15L))
                        .definition(
                            new WidgetDefinition(
                                new RunWorkflowWidgetDefinition()
                                    .title("Run workflow title")
                                    .titleSize("16")
                                    .titleAlign(WidgetTextAlign.LEFT)
                                    .time(new WidgetTime(new WidgetLegacyLiveSpan()))
                                    .type(RunWorkflowWidgetDefinitionType.RUN_WORKFLOW)
                                    .workflowId("2e055f16-8b6a-4cdd-b452-17a34c44b160")
                                    .inputs(
                                        Collections.singletonList(
                                            new RunWorkflowWidgetInput()
                                                .name("environment")
                                                .value("$env.value")))))))
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
