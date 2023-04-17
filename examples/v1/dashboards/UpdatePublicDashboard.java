// Update a shared dashboard returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.DashboardGlobalTimeLiveSpan;
import com.datadog.api.client.v1.model.DashboardShareType;
import com.datadog.api.client.v1.model.SharedDashboard;
import com.datadog.api.client.v1.model.SharedDashboardUpdateRequest;
import com.datadog.api.client.v1.model.SharedDashboardUpdateRequestGlobalTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    // there is a valid "shared_dashboard" in the system
    String SHARED_DASHBOARD_TOKEN = System.getenv("SHARED_DASHBOARD_TOKEN");

    SharedDashboardUpdateRequest body =
        new SharedDashboardUpdateRequest()
            .globalTime(
                new SharedDashboardUpdateRequestGlobalTime()
                    .liveSpan(DashboardGlobalTimeLiveSpan.PAST_FIFTEEN_MINUTES))
            .shareType(DashboardShareType.OPEN);

    try {
      SharedDashboard result = apiInstance.updatePublicDashboard(SHARED_DASHBOARD_TOKEN, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#updatePublicDashboard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
