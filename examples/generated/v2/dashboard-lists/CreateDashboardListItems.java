import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.DashboardListsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DashboardListsApi apiInstance = new DashboardListsApi(defaultClient);
        Long dashboardListId = 56L; // Long | ID of the dashboard list to add items to.
        DashboardListAddItemsRequest body = new DashboardListAddItemsRequest(); // DashboardListAddItemsRequest | Dashboards to add to the dashboard list.
        try {
            DashboardListAddItemsResponse result = apiInstance.createDashboardListItems(dashboardListId, body);
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
