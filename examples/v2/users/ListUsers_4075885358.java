// List all users returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.UsersApi;
import com.datadog.api.client.v2.api.UsersApi.ListUsersOptionalParameters;
import com.datadog.api.client.v2.model.User;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UsersApi apiInstance = new UsersApi(defaultClient);

    try {
      PaginationIterable<User> iterable =
          apiInstance.listUsersWithPagination(new ListUsersOptionalParameters().pageSize(2L));

      for (User item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling UsersApi#listUsersWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
