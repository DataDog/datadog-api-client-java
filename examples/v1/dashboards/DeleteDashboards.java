// Delete dashboards returns "No Content" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.DashboardBulkActionData;
import com.datadog.api.v1.client.model.DashboardBulkDeleteRequest;
import com.datadog.api.v1.client.model.DashboardResourceType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    // there is a valid "dashboard" in the system
    String DASHBOARD_ID = System.getenv("DASHBOARD_ID");

    DashboardBulkDeleteRequest body =
        new DashboardBulkDeleteRequest()
            .data(
                Collections.singletonList(
                    new DashboardBulkActionData()
                        .id(DASHBOARD_ID)
                        .type(DashboardResourceType.DASHBOARD)));

    try {
      apiInstance.deleteDashboards(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#deleteDashboards");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
