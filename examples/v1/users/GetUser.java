// Get user details returns "OK for get user" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.UsersApi;
import com.datadog.api.client.v1.model.UserResponse;

public class GetUser {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    UsersApi apiInstance = new UsersApi(defaultClient);

    try {
      UserResponse result = apiInstance.getUser("test@datadoghq.com");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
