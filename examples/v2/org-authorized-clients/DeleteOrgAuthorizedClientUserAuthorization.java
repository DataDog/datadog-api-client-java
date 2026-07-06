// Delete a user authorization for a client returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgAuthorizedClientsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OrgAuthorizedClientsApi apiInstance = new OrgAuthorizedClientsApi(defaultClient);

    try {
      apiInstance.deleteOrgAuthorizedClientUserAuthorization(
          "00000000-0000-0000-0000-000000000001", "00000000-0000-0000-0000-000000000002");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OrgAuthorizedClientsApi#deleteOrgAuthorizedClientUserAuthorization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
