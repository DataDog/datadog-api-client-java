// Add Items to a Dashboard List returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.DashboardListsApi;
import com.datadog.api.v2.client.model.DashboardListAddItemsRequest;
import com.datadog.api.v2.client.model.DashboardListAddItemsResponse;
import com.datadog.api.v2.client.model.DashboardListItemRequest;
import com.datadog.api.v2.client.model.DashboardType;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardListsApi apiInstance = new DashboardListsApi(defaultClient);

    DashboardListAddItemsRequest body =
        new DashboardListAddItemsRequest()
            .dashboards(
                Collections.singletonList(
                    new DashboardListItemRequest()
                        .id("q5j-nti-fv6")
                        .type(DashboardType.HOST_TIMEBOARD)));

    try {
      DashboardListAddItemsResponse result =
          apiInstance.createDashboardListItems(9223372036854775807L, body);
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
