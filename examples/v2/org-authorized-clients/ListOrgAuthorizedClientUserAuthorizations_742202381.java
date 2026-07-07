// List user authorizations for a client returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.OrgAuthorizedClientsApi;
import com.datadog.api.client.v2.model.UserAuthorizedClientData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OrgAuthorizedClientsApi apiInstance = new OrgAuthorizedClientsApi(defaultClient);

    try {
      PaginationIterable<UserAuthorizedClientData> iterable =
          apiInstance.listOrgAuthorizedClientUserAuthorizationsWithPagination(
              "00000000-0000-0000-0000-000000000001");

      for (UserAuthorizedClientData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling"
              + " OrgAuthorizedClientsApi#listOrgAuthorizedClientUserAuthorizationsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
