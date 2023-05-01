// Create a shared dashboard returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.DashboardGlobalTime;
import com.datadog.api.client.v1.model.DashboardGlobalTimeLiveSpan;
import com.datadog.api.client.v1.model.DashboardShareType;
import com.datadog.api.client.v1.model.DashboardType;
import com.datadog.api.client.v1.model.SharedDashboard;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    // there is a valid "dashboard" in the system
    String DASHBOARD_ID = System.getenv("DASHBOARD_ID");

    SharedDashboard body =
        new SharedDashboard()
            .dashboardId(DASHBOARD_ID)
            .dashboardType(DashboardType.CUSTOM_TIMEBOARD)
            .shareType(DashboardShareType.OPEN)
            .globalTime(
                new DashboardGlobalTime().liveSpan(DashboardGlobalTimeLiveSpan.PAST_ONE_HOUR));

    try {
      SharedDashboard result = apiInstance.createPublicDashboard(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#createPublicDashboard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
