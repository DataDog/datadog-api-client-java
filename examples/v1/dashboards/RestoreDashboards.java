// Restore deleted dashboards returns "No Content" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.DashboardBulkActionData;
import com.datadog.api.v1.client.model.DashboardResourceType;
import com.datadog.api.v1.client.model.DashboardRestoreRequest;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    // there is a valid "dashboard" in the system
    String DASHBOARD_ID = System.getenv("DASHBOARD_ID");

    DashboardRestoreRequest body =
        new DashboardRestoreRequest()
            .data(
                new ArrayList<DashboardBulkActionData>() {
                  {
                    add(
                        new DashboardBulkActionData()
                            .id(DASHBOARD_ID)
                            .type(DashboardResourceType.DASHBOARD));
                  }
                });

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
