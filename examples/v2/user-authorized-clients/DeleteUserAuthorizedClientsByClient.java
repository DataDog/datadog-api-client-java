// Delete all user authorized clients for a client returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UserAuthorizedClientsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UserAuthorizedClientsApi apiInstance = new UserAuthorizedClientsApi(defaultClient);

    try {
      apiInstance.deleteUserAuthorizedClientsByClient("00000000-0000-0000-0000-000000000010");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling UserAuthorizedClientsApi#deleteUserAuthorizedClientsByClient");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
