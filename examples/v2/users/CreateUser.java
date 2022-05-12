// Create a user returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.UsersApi;
import com.datadog.api.v2.client.model.UserCreateAttributes;
import com.datadog.api.v2.client.model.UserCreateData;
import com.datadog.api.v2.client.model.UserCreateRequest;
import com.datadog.api.v2.client.model.UserResponse;
import com.datadog.api.v2.client.model.UsersType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    UsersApi apiInstance = new UsersApi(defaultClient);

    UserCreateRequest body =
        new UserCreateRequest()
            .data(
                new UserCreateData()
                    .type(UsersType.USERS)
                    .attributes(
                        new UserCreateAttributes()
                            .name("Datadog API Client Python")
                            .email("Example-Create_a_user_returns_OK_response@datadoghq.com")));

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
