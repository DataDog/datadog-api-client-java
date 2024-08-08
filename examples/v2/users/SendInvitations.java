// Send invitation emails returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.UsersApi;
import com.datadog.api.client.v2.model.UserInvitationsResponse;
import com.datadog.api.client.v2.model.RelationshipToUser;
import com.datadog.api.client.v2.model.RelationshipToUserData;
import com.datadog.api.client.v2.model.UserInvitationData;
import com.datadog.api.client.v2.model.UserInvitationRelationships;
import com.datadog.api.client.v2.model.UserInvitationsRequest;
import com.datadog.api.client.v2.model.UserInvitationsType;
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
    UsersApi apiInstance = new UsersApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    UserInvitationsRequest body = new UserInvitationsRequest()
.data(Collections.singletonList(new UserInvitationData()
.type(UserInvitationsType.USER_INVITATIONS)
.relationships(new UserInvitationRelationships()
.user(new RelationshipToUser()
.data(new RelationshipToUserData()
.type(UsersType.USERS)
.id(USER_DATA_ID))))));

    try {
      UserInvitationsResponse result = apiInstance.sendInvitations(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#sendInvitations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}