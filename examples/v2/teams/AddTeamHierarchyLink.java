// Create a team hierarchy link returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.TeamHierarchyLinkCreate;
import com.datadog.api.client.v2.model.TeamHierarchyLinkCreateRelationships;
import com.datadog.api.client.v2.model.TeamHierarchyLinkCreateRequest;
import com.datadog.api.client.v2.model.TeamHierarchyLinkCreateTeam;
import com.datadog.api.client.v2.model.TeamHierarchyLinkCreateTeamRelationship;
import com.datadog.api.client.v2.model.TeamHierarchyLinkResponse;
import com.datadog.api.client.v2.model.TeamHierarchyLinkType;
import com.datadog.api.client.v2.model.TeamType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    TeamHierarchyLinkCreateRequest body =
        new TeamHierarchyLinkCreateRequest()
            .data(
                new TeamHierarchyLinkCreate()
                    .relationships(
                        new TeamHierarchyLinkCreateRelationships()
                            .parentTeam(
                                new TeamHierarchyLinkCreateTeamRelationship()
                                    .data(
                                        new TeamHierarchyLinkCreateTeam()
                                            .id("692e8073-12c4-4c71-8408-5090bd44c9c8")
                                            .type(TeamType.TEAM)))
                            .subTeam(
                                new TeamHierarchyLinkCreateTeamRelationship()
                                    .data(
                                        new TeamHierarchyLinkCreateTeam()
                                            .id("692e8073-12c4-4c71-8408-5090bd44c9c8")
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
