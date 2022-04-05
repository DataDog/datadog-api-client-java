import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardsApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    DashboardsApi apiInstance = new DashboardsApi(defaultClient);
    Boolean filterShared =
        true; // Boolean | When `true`, this query only returns shared custom created or cloned
    // dashboards.
    Boolean filterDeleted =
        true; // Boolean | When `true`, this query returns only deleted custom-created or cloned
    // dashboards. This parameter is incompatible with `filter[shared]`.
    try {
      DashboardSummary result =
          apiInstance.listDashboards(
              new DashboardsApi.ListDashboardsOptionalParameters()
                  .filterShared(filterShared)
                  .filterDeleted(filterDeleted));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#listDashboards");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
