// Remove a user from a role returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RolesApi;
import com.datadog.api.client.v2.model.UsersResponse;
import com.datadog.api.client.v2.model.RelationshipToUser;
import com.datadog.api.client.v2.model.RelationshipToUserData;
import com.datadog.api.client.v2.model.UsersType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RolesApi apiInstance = new RolesApi(defaultClient);

    // there is a valid "role" in the system
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    RelationshipToUser body = new RelationshipToUser()
.data(new RelationshipToUserData()
.id(USER_DATA_ID)
.type(UsersType.USERS));

    try {
      UsersResponse result = apiInstance.removeUserFromRole(ROLE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#removeUserFromRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}