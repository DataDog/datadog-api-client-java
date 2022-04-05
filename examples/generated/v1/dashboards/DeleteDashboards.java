import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.DashboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        DashboardsApi apiInstance = new DashboardsApi(defaultClient);
        DashboardBulkDeleteRequest body = new DashboardBulkDeleteRequest(); // DashboardBulkDeleteRequest | Delete dashboards request body.
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
