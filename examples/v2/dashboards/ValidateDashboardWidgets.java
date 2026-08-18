// Validate dashboard widgets returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DashboardsApi;
import com.datadog.api.client.v2.model.DashboardWidgetValidationLayoutType;
import com.datadog.api.client.v2.model.DashboardWidgetValidationReflowType;
import com.datadog.api.client.v2.model.DashboardWidgetValidationRequest;
import com.datadog.api.client.v2.model.DashboardWidgetValidationResponse;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.validateDashboardWidgets", true);
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    DashboardWidgetValidationRequest body =
        new DashboardWidgetValidationRequest()
            .layoutType(DashboardWidgetValidationLayoutType.ORDERED)
            .reflowType(DashboardWidgetValidationReflowType.AUTO)
            .widgets(
                Collections.singletonList(
                    Map.ofEntries(
                        Map.entry("definition", "{'content': 'Valid note', 'type': 'note'}"))));

    try {
      DashboardWidgetValidationResponse result = apiInstance.validateDashboardWidgets(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#validateDashboardWidgets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
