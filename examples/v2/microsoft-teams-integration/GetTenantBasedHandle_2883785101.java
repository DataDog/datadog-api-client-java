// Get api handle information returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MicrosoftTeamsIntegrationApi;
import com.datadog.api.client.v2.model.MicrosoftTeamsTenantBasedHandleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MicrosoftTeamsIntegrationApi apiInstance = new MicrosoftTeamsIntegrationApi(defaultClient);

    // there is a valid "tenant_based_handle" in the system
    String TENANT_BASED_HANDLE_DATA_ID = System.getenv("TENANT_BASED_HANDLE_DATA_ID");

    try {
      MicrosoftTeamsTenantBasedHandleResponse result =
          apiInstance.getTenantBasedHandle(TENANT_BASED_HANDLE_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling MicrosoftTeamsIntegrationApi#getTenantBasedHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
