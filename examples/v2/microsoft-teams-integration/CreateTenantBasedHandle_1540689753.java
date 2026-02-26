// Create api handle returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MicrosoftTeamsIntegrationApi;
import com.datadog.api.client.v2.model.MicrosoftTeamsCreateTenantBasedHandleRequest;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleRequestAttributes;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleRequestData;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MicrosoftTeamsIntegrationApi apiInstance = new MicrosoftTeamsIntegrationApi(defaultClient);

    MicrosoftTeamsCreateTenantBasedHandleRequest body =
        new MicrosoftTeamsCreateTenantBasedHandleRequest()
            .data(
                new MicrosoftTeamsTenantBasedHandleRequestData()
                    .attributes(
                        new MicrosoftTeamsTenantBasedHandleRequestAttributes()
                            .channelId(
                                "19:iD_D2xy_sAa-JV851JJYwIa6mlW9F9Nxm3SLyZq68qY1@thread.tacv2")
                            .name("Example-Microsoft-Teams-Integration")
                            .teamId("e5f50a58-c929-4fb3-8866-e2cd836de3c2")
                            .tenantId("4d3bac44-0230-4732-9e70-cc00736f0a97"))
                    .type(MicrosoftTeamsTenantBasedHandleType.TENANT_BASED_HANDLE));

    try {
      MicrosoftTeamsTenantBasedHandleResponse result = apiInstance.createTenantBasedHandle(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling MicrosoftTeamsIntegrationApi#createTenantBasedHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
