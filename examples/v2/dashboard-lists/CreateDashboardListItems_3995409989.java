// Add custom timeboard dashboard to an existing dashboard list returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.DashboardListsApi;
import com.datadog.api.v2.client.model.DashboardListAddItemsRequest;
import com.datadog.api.v2.client.model.DashboardListAddItemsResponse;
import com.datadog.api.v2.client.model.DashboardListItemRequest;
import com.datadog.api.v2.client.model.DashboardType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardListsApi apiInstance = new DashboardListsApi(defaultClient);

    // there is a valid "dashboard_list" in the system
    Long DASHBOARD_LIST_ID = Long.parseLong(System.getenv("DASHBOARD_LIST_ID"));

    // there is a valid "dashboard" in the system
    String DASHBOARD_ID = System.getenv("DASHBOARD_ID");

    DashboardListAddItemsRequest body =
        new DashboardListAddItemsRequest()
            .dashboards(
                Collections.singletonList(
                    new DashboardListItemRequest()
                        .id(DASHBOARD_ID)
                        .type(DashboardType.CUSTOM_TIMEBOARD)));

    try {
      DashboardListAddItemsResponse result =
          apiInstance.createDashboardListItems(DASHBOARD_LIST_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardListsApi#createDashboardListItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
