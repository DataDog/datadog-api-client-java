// Send invitation emails returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.UsersApi;
import com.datadog.api.v2.client.model.RelationshipToUser;
import com.datadog.api.v2.client.model.RelationshipToUserData;
import com.datadog.api.v2.client.model.UserInvitationData;
import com.datadog.api.v2.client.model.UserInvitationRelationships;
import com.datadog.api.v2.client.model.UserInvitationsRequest;
import com.datadog.api.v2.client.model.UserInvitationsResponse;
import com.datadog.api.v2.client.model.UserInvitationsType;
import com.datadog.api.v2.client.model.UsersType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    UsersApi apiInstance = new UsersApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    UserInvitationsRequest body =
        new UserInvitationsRequest()
            .data(
                Collections.singletonList(
                    new UserInvitationData()
                        .type(UserInvitationsType.USER_INVITATIONS)
                        .relationships(
                            new UserInvitationRelationships()
                                .user(
                                    new RelationshipToUser()
                                        .data(
                                            new RelationshipToUserData()
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
