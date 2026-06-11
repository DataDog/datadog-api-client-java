// List user authorized clients returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.UserAuthorizedClientsApi;
import com.datadog.api.client.v2.model.UserAuthorizedClientData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UserAuthorizedClientsApi apiInstance = new UserAuthorizedClientsApi(defaultClient);

    try {
      PaginationIterable<UserAuthorizedClientData> iterable =
          apiInstance.listUserAuthorizedClientsWithPagination();

      for (UserAuthorizedClientData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling"
              + " UserAuthorizedClientsApi#listUserAuthorizedClientsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
