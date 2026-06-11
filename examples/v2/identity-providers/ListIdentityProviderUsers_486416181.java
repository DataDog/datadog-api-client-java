// List users with an identity provider override returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.IdentityProvidersApi;
import com.datadog.api.client.v2.model.User;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    IdentityProvidersApi apiInstance = new IdentityProvidersApi(defaultClient);

    try {
      PaginationIterable<User> iterable =
          apiInstance.listIdentityProviderUsersWithPagination(
              "00000000-0000-0000-0000-000000000001");

      for (User item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling IdentityProvidersApi#listIdentityProviderUsersWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
