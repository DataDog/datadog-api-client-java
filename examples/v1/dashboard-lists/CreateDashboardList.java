// Create a dashboard list returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.DashboardListsApi;
import com.datadog.api.v1.client.model.DashboardList;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    DashboardListsApi apiInstance = new DashboardListsApi(defaultClient);

    DashboardList body =
        new DashboardList().name("Example-Create_a_dashboard_list_returns_OK_response");

    try {
      DashboardList result = apiInstance.createDashboardList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
