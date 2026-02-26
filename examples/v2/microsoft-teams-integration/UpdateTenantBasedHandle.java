// Update tenant-based handle returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MicrosoftTeamsIntegrationApi;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleAttributes;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleType;
import com.datadog.api.client.v2.model.MicrosoftTeamsUpdateTenantBasedHandleRequest;
import com.datadog.api.client.v2.model.MicrosoftTeamsUpdateTenantBasedHandleRequestData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MicrosoftTeamsIntegrationApi apiInstance = new MicrosoftTeamsIntegrationApi(defaultClient);

    MicrosoftTeamsUpdateTenantBasedHandleRequest body =
        new MicrosoftTeamsUpdateTenantBasedHandleRequest()
            .data(
                new MicrosoftTeamsUpdateTenantBasedHandleRequestData()
                    .attributes(
                        new MicrosoftTeamsTenantBasedHandleAttributes()
                            .channelId("fake-channel-id")
                            .name("fake-handle-name")
                            .teamId("00000000-0000-0000-0000-000000000000")
                            .tenantId("00000000-0000-0000-0000-000000000001"))
                    .type(MicrosoftTeamsTenantBasedHandleType.TENANT_BASED_HANDLE));

    try {
      MicrosoftTeamsTenantBasedHandleResponse result =
          apiInstance.updateTenantBasedHandle("handle_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling MicrosoftTeamsIntegrationApi#updateTenantBasedHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
