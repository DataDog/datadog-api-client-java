// Get a user authorized client returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UserAuthorizedClientsApi;
import com.datadog.api.client.v2.model.UserAuthorizedClientResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UserAuthorizedClientsApi apiInstance = new UserAuthorizedClientsApi(defaultClient);

    try {
      UserAuthorizedClientResponse result =
          apiInstance.getUserAuthorizedClient("00000000-0000-0000-0000-000000000001");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAuthorizedClientsApi#getUserAuthorizedClient");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
