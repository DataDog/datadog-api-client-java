// Disable a user returns "User disabled" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.UsersApi;
import com.datadog.api.v1.client.model.UserDisableResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    UsersApi apiInstance = new UsersApi(defaultClient);

    try {
      UserDisableResponse result = apiInstance.disableUser("test@datadoghq.com");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#disableUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
