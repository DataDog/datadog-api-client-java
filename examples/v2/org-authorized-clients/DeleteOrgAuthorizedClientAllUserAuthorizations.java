// Delete a user's authorizations for a client returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgAuthorizedClientsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OrgAuthorizedClientsApi apiInstance = new OrgAuthorizedClientsApi(defaultClient);

    try {
      apiInstance.deleteOrgAuthorizedClientAllUserAuthorizations(
          "00000000-0000-0000-0000-000000000001", "00000000-0000-9999-0000-000000000001");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OrgAuthorizedClientsApi#deleteOrgAuthorizedClientAllUserAuthorizations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
