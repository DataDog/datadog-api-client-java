// Update a user returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsersApi;
import com.datadog.api.client.v2.model.UserResponse;
import com.datadog.api.client.v2.model.UserUpdateAttributes;
import com.datadog.api.client.v2.model.UserUpdateData;
import com.datadog.api.client.v2.model.UserUpdateRequest;
import com.datadog.api.client.v2.model.UsersType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UsersApi apiInstance = new UsersApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    UserUpdateRequest body =
        new UserUpdateRequest()
            .data(
                new UserUpdateData()
                    .id(USER_DATA_ID)
                    .type(UsersType.USERS)
                    .attributes(new UserUpdateAttributes().name("updated").disabled(true)));

    try {
      UserResponse result = apiInstance.updateUser(USER_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
