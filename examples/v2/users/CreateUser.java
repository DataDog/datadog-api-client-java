// Create a user returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsersApi;
import com.datadog.api.client.v2.model.UserCreateAttributes;
import com.datadog.api.client.v2.model.UserCreateData;
import com.datadog.api.client.v2.model.UserCreateRequest;
import com.datadog.api.client.v2.model.UserResponse;
import com.datadog.api.client.v2.model.UsersType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UsersApi apiInstance = new UsersApi(defaultClient);

    UserCreateRequest body =
        new UserCreateRequest()
            .data(
                new UserCreateData()
                    .type(UsersType.USERS)
                    .attributes(
                        new UserCreateAttributes()
                            .name("Datadog API Client Python")
                            .email("Example-User@datadoghq.com")));

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
