// Create tenant-based handle returns "CREATED" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MicrosoftTeamsIntegrationApi;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsCreateTenantBasedHandleRequest;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleRequestAttributes;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleRequestData;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleType;
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
    MicrosoftTeamsIntegrationApi apiInstance = new MicrosoftTeamsIntegrationApi(defaultClient);

    MicrosoftTeamsCreateTenantBasedHandleRequest body = new MicrosoftTeamsCreateTenantBasedHandleRequest()
.data(new MicrosoftTeamsTenantBasedHandleRequestData()
.attributes(new MicrosoftTeamsTenantBasedHandleRequestAttributes()
.channelId("fake-channel-id")
.name("fake-handle-name")
.teamId("00000000-0000-0000-0000-000000000000")
.tenantId("00000000-0000-0000-0000-000000000001"))
.type(MicrosoftTeamsTenantBasedHandleType.TENANT_BASED_HANDLE));

    try {
      MicrosoftTeamsTenantBasedHandleResponse result = apiInstance.createTenantBasedHandle(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrosoftTeamsIntegrationApi#createTenantBasedHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}