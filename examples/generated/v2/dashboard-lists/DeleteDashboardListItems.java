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
        Long dashboardListId = 56L; // Long | ID of the dashboard list to delete items from.
        DashboardListDeleteItemsRequest body = new DashboardListDeleteItemsRequest(); // DashboardListDeleteItemsRequest | Dashboards to delete from the dashboard list.
        try {
            DashboardListDeleteItemsResponse result = apiInstance.deleteDashboardListItems(dashboardListId, body);
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
