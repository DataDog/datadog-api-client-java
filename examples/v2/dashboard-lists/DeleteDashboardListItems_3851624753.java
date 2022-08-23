// Delete custom screenboard dashboard from an existing dashboard list returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.DashboardListsApi;
import com.datadog.api.client.v2.model.DashboardListDeleteItemsResponse;
import com.datadog.api.client.v2.model.DashboardListDeleteItemsRequest;
import com.datadog.api.client.v2.model.DashboardListItemRequest;
import com.datadog.api.client.v2.model.DashboardType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardListsApi apiInstance = new DashboardListsApi(defaultClient);

    // there is a valid "dashboard_list" in the system
    Long DASHBOARD_LIST_ID = Long.parseLong(System.getenv("DASHBOARD_LIST_ID"));

    // there is a valid "screenboard_dashboard" in the system
    String SCREENBOARD_DASHBOARD_ID = System.getenv("SCREENBOARD_DASHBOARD_ID");

    DashboardListDeleteItemsRequest body = new DashboardListDeleteItemsRequest()
.dashboards(Collections.singletonList(new DashboardListItemRequest()
.id(SCREENBOARD_DASHBOARD_ID)
.type(DashboardType.CUSTOM_SCREENBOARD)));

    try {
      DashboardListDeleteItemsResponse result = apiInstance.deleteDashboardListItems(DASHBOARD_LIST_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardListsApi#deleteDashboardListItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}