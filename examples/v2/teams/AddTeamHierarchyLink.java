// Create a team hierarchy link returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.TeamHierarchyLinkResponse;
import com.datadog.api.client.v2.model.TeamHierarchyLinkCreate;
import com.datadog.api.client.v2.model.TeamHierarchyLinkCreateRelationships;
import com.datadog.api.client.v2.model.TeamHierarchyLinkCreateRequest;
import com.datadog.api.client.v2.model.TeamHierarchyLinkCreateTeam;
import com.datadog.api.client.v2.model.TeamHierarchyLinkCreateTeamRelationship;
import com.datadog.api.client.v2.model.TeamHierarchyLinkType;
import com.datadog.api.client.v2.model.TeamType;
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

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    // there is a valid "dd_team_2" in the system
    String DD_TEAM_2_DATA_ID = System.getenv("DD_TEAM_2_DATA_ID");

    TeamHierarchyLinkCreateRequest body = new TeamHierarchyLinkCreateRequest()
.data(new TeamHierarchyLinkCreate()
.relationships(new TeamHierarchyLinkCreateRelationships()
.parentTeam(new TeamHierarchyLinkCreateTeamRelationship()
.data(new TeamHierarchyLinkCreateTeam()
.id(DD_TEAM_DATA_ID)
.type(TeamType.TEAM)))
.subTeam(new TeamHierarchyLinkCreateTeamRelationship()
.data(new TeamHierarchyLinkCreateTeam()
.id(DD_TEAM_2_DATA_ID)
.type(TeamType.TEAM))))
.type(TeamHierarchyLinkType.TEAM_HIERARCHY_LINKS));

    try {
      TeamHierarchyLinkResponse result = apiInstance.addTeamHierarchyLink(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#addTeamHierarchyLink");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}