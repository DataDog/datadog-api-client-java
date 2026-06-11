// List user authorized clients returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UserAuthorizedClientsApi;
import com.datadog.api.client.v2.model.UserAuthorizedClientsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UserAuthorizedClientsApi apiInstance = new UserAuthorizedClientsApi(defaultClient);

    try {
      UserAuthorizedClientsResponse result = apiInstance.listUserAuthorizedClients();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling UserAuthorizedClientsApi#listUserAuthorizedClients");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
