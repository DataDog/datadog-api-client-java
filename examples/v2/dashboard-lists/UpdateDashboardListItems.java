// Update items of a dashboard list returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.DashboardListsApi;
import com.datadog.api.client.v2.model.DashboardListUpdateItemsResponse;
import com.datadog.api.client.v2.model.DashboardListItemRequest;
import com.datadog.api.client.v2.model.DashboardListUpdateItemsRequest;
import com.datadog.api.client.v2.model.DashboardType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardListsApi apiInstance = new DashboardListsApi(defaultClient);

    // there is a valid "dashboard_list" in the system
    Long DASHBOARD_LIST_ID = Long.parseLong(System.getenv("DASHBOARD_LIST_ID"));

    // there is a valid "screenboard_dashboard" in the system
    String SCREENBOARD_DASHBOARD_ID = System.getenv("SCREENBOARD_DASHBOARD_ID");

    DashboardListUpdateItemsRequest body = new DashboardListUpdateItemsRequest()
.dashboards(Collections.singletonList(new DashboardListItemRequest()
.id(SCREENBOARD_DASHBOARD_ID)
.type(DashboardType.CUSTOM_SCREENBOARD)));

    try {
      DashboardListUpdateItemsResponse result = apiInstance.updateDashboardListItems(DASHBOARD_LIST_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardListsApi#updateDashboardListItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}