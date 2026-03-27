// Restore deleted dashboards returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.DashboardBulkActionData;
import com.datadog.api.client.v1.model.DashboardResourceType;
import com.datadog.api.client.v1.model.DashboardRestoreRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    // there is a valid "dashboard" in the system
    String DASHBOARD_ID = System.getenv("DASHBOARD_ID");

    DashboardRestoreRequest body =
        new DashboardRestoreRequest()
            .data(
                Collections.singletonList(
                    new DashboardBulkActionData()
                        .id(DASHBOARD_ID)
                        .type(DashboardResourceType.DASHBOARD)));

    try {
      apiInstance.restoreDashboards(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#restoreDashboards");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
