// Create a user returns "User created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.UsersApi;
import com.datadog.api.client.v1.model.AccessRole;
import com.datadog.api.client.v1.model.User;
import com.datadog.api.client.v1.model.UserResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UsersApi apiInstance = new UsersApi(defaultClient);

    User body =
        new User()
            .accessRole(AccessRole.READ_ONLY)
            .disabled(false)
            .email("test@datadoghq.com")
            .handle("test@datadoghq.com")
            .name("test user");

    try {
      UserResponse result = apiInstance.createUser(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
