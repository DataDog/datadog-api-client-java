// Update a shared dashboard with selectable_template_vars returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.DashboardGlobalTimeLiveSpan;
import com.datadog.api.client.v1.model.DashboardShareType;
import com.datadog.api.client.v1.model.SelectableTemplateVariableItems;
import com.datadog.api.client.v1.model.SharedDashboard;
import com.datadog.api.client.v1.model.SharedDashboardUpdateRequest;
import com.datadog.api.client.v1.model.SharedDashboardUpdateRequestGlobalTime;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    // there is a valid "shared_dashboard" in the system
    String SHARED_DASHBOARD_TOKEN = System.getenv("SHARED_DASHBOARD_TOKEN");

    SharedDashboardUpdateRequest body =
        new SharedDashboardUpdateRequest()
            .globalTime(
                new SharedDashboardUpdateRequestGlobalTime()
                    .liveSpan(DashboardGlobalTimeLiveSpan.PAST_FIFTEEN_MINUTES))
            .shareType(DashboardShareType.OPEN)
            .selectableTemplateVars(
                Collections.singletonList(
                    new SelectableTemplateVariableItems()
                        .defaultValue("*")
                        .name("group_by_var")
                        .type("group")
                        .visibleTags(Arrays.asList("selectableValue1", "selectableValue2"))));

    try {
      SharedDashboard result = apiInstance.updatePublicDashboard(SHARED_DASHBOARD_TOKEN, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#updatePublicDashboard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
