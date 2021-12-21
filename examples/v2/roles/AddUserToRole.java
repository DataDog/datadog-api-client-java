// Add a user to a role returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.RolesApi;
import com.datadog.api.v2.client.model.RelationshipToUser;
import com.datadog.api.v2.client.model.RelationshipToUserData;
import com.datadog.api.v2.client.model.UsersResponse;
import com.datadog.api.v2.client.model.UsersType;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    RolesApi apiInstance = new RolesApi(defaultClient);

    // there is a valid "role" in the system
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    RelationshipToUser body =
        new RelationshipToUser()
            .data(new RelationshipToUserData().id(USER_DATA_ID).type(UsersType.USERS));

    try {
      UsersResponse result = apiInstance.addUserToRole(ROLE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
