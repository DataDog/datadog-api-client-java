// List user authorizations for a client returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrgAuthorizedClientsApi;
import com.datadog.api.client.v2.model.UserAuthorizedClientsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OrgAuthorizedClientsApi apiInstance = new OrgAuthorizedClientsApi(defaultClient);

    try {
      UserAuthorizedClientsResponse result =
          apiInstance.listOrgAuthorizedClientUserAuthorizations(
              "00000000-0000-0000-0000-000000000001");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OrgAuthorizedClientsApi#listOrgAuthorizedClientUserAuthorizations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
