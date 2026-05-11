// Update current user returns "OK" response

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

    UserUpdateRequest body =
        new UserUpdateRequest()
            .data(
                new UserUpdateData()
                    .attributes(new UserUpdateAttributes().title(null))
                    .id("00000000-0000-feed-0000-000000000000")
                    .type(UsersType.USERS));

    try {
      UserResponse result = apiInstance.updateCurrentUser(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateCurrentUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
