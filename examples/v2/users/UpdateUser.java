// Update a user returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.UsersApi;
import com.datadog.api.v2.client.model.UserResponse;
import com.datadog.api.v2.client.model.UserUpdateAttributes;
import com.datadog.api.v2.client.model.UserUpdateData;
import com.datadog.api.v2.client.model.UserUpdateRequest;
import com.datadog.api.v2.client.model.UsersType;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
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
