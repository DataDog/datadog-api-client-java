// Revoke shared dashboard invitations returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.DashboardInviteType;
import com.datadog.api.client.v1.model.SharedDashboardInvites;
import com.datadog.api.client.v1.model.SharedDashboardInvitesData;
import com.datadog.api.client.v1.model.SharedDashboardInvitesDataObject;
import com.datadog.api.client.v1.model.SharedDashboardInvitesDataObjectAttributes;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    SharedDashboardInvites body = new SharedDashboardInvites()
.data(new SharedDashboardInvitesData(Collections.singletonList(new SharedDashboardInvitesDataObject()
.attributes(new SharedDashboardInvitesDataObjectAttributes()
.email("test@datadoghq.com"))
.type(DashboardInviteType.PUBLIC_DASHBOARD_INVITATION))));

    try {
      apiInstance.deletePublicDashboardInvitation("token", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#deletePublicDashboardInvitation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}