// Update api handle returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MicrosoftTeamsIntegrationApi;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleResponse;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleAttributes;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleType;
import com.datadog.api.client.v2.model.MicrosoftTeamsUpdateTenantBasedHandleRequest;
import com.datadog.api.client.v2.model.MicrosoftTeamsUpdateTenantBasedHandleRequestData;
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

    // there is a valid "tenant_based_handle" in the system
    String TENANT_BASED_HANDLE_DATA_ATTRIBUTES_NAME = System.getenv("TENANT_BASED_HANDLE_DATA_ATTRIBUTES_NAME");
    String TENANT_BASED_HANDLE_DATA_ID = System.getenv("TENANT_BASED_HANDLE_DATA_ID");

    MicrosoftTeamsUpdateTenantBasedHandleRequest body = new MicrosoftTeamsUpdateTenantBasedHandleRequest()
.data(new MicrosoftTeamsUpdateTenantBasedHandleRequestData()
.attributes(new MicrosoftTeamsTenantBasedHandleAttributes()
.name("fake-handle-name--updated"))
.type(MicrosoftTeamsTenantBasedHandleType.TENANT_BASED_HANDLE));

    try {
      MicrosoftTeamsTenantBasedHandleResponse result = apiInstance.updateTenantBasedHandle(TENANT_BASED_HANDLE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrosoftTeamsIntegrationApi#updateTenantBasedHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}