// Add a user to a team returns "Represents a user's association to a team" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.UserTeamResponse;
import com.datadog.api.client.v2.model.RelationshipToUserTeamTeam;
import com.datadog.api.client.v2.model.RelationshipToUserTeamTeamData;
import com.datadog.api.client.v2.model.RelationshipToUserTeamUser;
import com.datadog.api.client.v2.model.RelationshipToUserTeamUserData;
import com.datadog.api.client.v2.model.UserTeamAttributes;
import com.datadog.api.client.v2.model.UserTeamCreate;
import com.datadog.api.client.v2.model.UserTeamRelationships;
import com.datadog.api.client.v2.model.UserTeamRequest;
import com.datadog.api.client.v2.model.UserTeamRole;
import com.datadog.api.client.v2.model.UserTeamTeamType;
import com.datadog.api.client.v2.model.UserTeamType;
import com.datadog.api.client.v2.model.UserTeamUserType;
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
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    UserTeamRequest body = new UserTeamRequest()
.data(new UserTeamCreate()
.attributes(new UserTeamAttributes()
.role(UserTeamRole.ADMIN))
.relationships(new UserTeamRelationships()
.team(new RelationshipToUserTeamTeam()
.data(new RelationshipToUserTeamTeamData()
.id("d7e15d9d-d346-43da-81d8-3d9e71d9a5e9")
.type(UserTeamTeamType.TEAM)))
.user(new RelationshipToUserTeamUser()
.data(new RelationshipToUserTeamUserData()
.id("b8626d7e-cedd-11eb-abf5-da7ad0900001")
.type(UserTeamUserType.USERS))))
.type(UserTeamType.TEAM_MEMBERSHIPS));

    try {
      UserTeamResponse result = apiInstance.createTeamMembership("team_id", body);
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