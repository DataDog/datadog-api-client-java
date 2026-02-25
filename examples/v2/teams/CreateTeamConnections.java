// Create team connections returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.TeamConnectionsResponse;
import com.datadog.api.client.v2.model.ConnectedTeamRef;
import com.datadog.api.client.v2.model.ConnectedTeamRefData;
import com.datadog.api.client.v2.model.ConnectedTeamRefDataType;
import com.datadog.api.client.v2.model.TeamConnectionAttributes;
import com.datadog.api.client.v2.model.TeamConnectionCreateData;
import com.datadog.api.client.v2.model.TeamConnectionCreateRequest;
import com.datadog.api.client.v2.model.TeamConnectionRelationships;
import com.datadog.api.client.v2.model.TeamConnectionType;
import com.datadog.api.client.v2.model.TeamRef;
import com.datadog.api.client.v2.model.TeamRefData;
import com.datadog.api.client.v2.model.TeamRefDataType;
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
    defaultClient.setUnstableOperationEnabled("v2.createTeamConnections", true);
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    TeamConnectionCreateRequest body = new TeamConnectionCreateRequest()
.data(Collections.singletonList(new TeamConnectionCreateData()
.type(TeamConnectionType.TEAM_CONNECTION)
.attributes(new TeamConnectionAttributes()
.source("github")
.managedBy("datadog"))
.relationships(new TeamConnectionRelationships()
.team(new TeamRef()
.data(new TeamRefData()
.id(DD_TEAM_DATA_ID)
.type(TeamRefDataType.TEAM)))
.connectedTeam(new ConnectedTeamRef()
.data(new ConnectedTeamRefData()
.id("@MyGitHubAccount/my-team-name")
.type(ConnectedTeamRefDataType.GITHUB_TEAM))))));

    try {
      TeamConnectionsResponse result = apiInstance.createTeamConnections(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#createTeamConnections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}