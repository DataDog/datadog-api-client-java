// Add a user to a team returns "Represents a user's association to a team" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.RelationshipToUserTeamUser;
import com.datadog.api.client.v2.model.RelationshipToUserTeamUserData;
import com.datadog.api.client.v2.model.UserTeamAttributes;
import com.datadog.api.client.v2.model.UserTeamCreate;
import com.datadog.api.client.v2.model.UserTeamRelationships;
import com.datadog.api.client.v2.model.UserTeamRequest;
import com.datadog.api.client.v2.model.UserTeamResponse;
import com.datadog.api.client.v2.model.UserTeamRole;
import com.datadog.api.client.v2.model.UserTeamType;
import com.datadog.api.client.v2.model.UserTeamUserType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    UserTeamRequest body =
        new UserTeamRequest()
            .data(
                new UserTeamCreate()
                    .attributes(new UserTeamAttributes().role(UserTeamRole.ADMIN))
                    .relationships(
                        new UserTeamRelationships()
                            .user(
                                new RelationshipToUserTeamUser()
                                    .data(
                                        new RelationshipToUserTeamUserData()
                                            .id(USER_DATA_ID)
                                            .type(UserTeamUserType.USERS))))
                    .type(UserTeamType.TEAM_MEMBERSHIPS));

    try {
      UserTeamResponse result = apiInstance.createTeamMembership(DD_TEAM_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#createTeamMembership");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
