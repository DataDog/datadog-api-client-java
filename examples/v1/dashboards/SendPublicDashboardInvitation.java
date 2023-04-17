// Send shared dashboard invitation email returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.DashboardInviteType;
import com.datadog.api.client.v1.model.SharedDashboardInvites;
import com.datadog.api.client.v1.model.SharedDashboardInvitesData;
import com.datadog.api.client.v1.model.SharedDashboardInvitesDataObject;
import com.datadog.api.client.v1.model.SharedDashboardInvitesDataObjectAttributes;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    // there is a valid "shared_dashboard" in the system
    String SHARED_DASHBOARD_TOKEN = System.getenv("SHARED_DASHBOARD_TOKEN");

    SharedDashboardInvites body =
        new SharedDashboardInvites()
            .data(
                new SharedDashboardInvitesData(
                    new SharedDashboardInvitesDataObject()
                        .attributes(
                            new SharedDashboardInvitesDataObjectAttributes()
                                .email("exampledashboard@datadoghq.com"))
                        .type(DashboardInviteType.PUBLIC_DASHBOARD_INVITATION)));

    try {
      SharedDashboardInvites result =
          apiInstance.sendPublicDashboardInvitation(SHARED_DASHBOARD_TOKEN, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#sendPublicDashboardInvitation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
