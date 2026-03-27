// Get team hierarchy links returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.api.TeamsApi.ListTeamHierarchyLinksOptionalParameters;
import com.datadog.api.client.v2.model.TeamHierarchyLinksResponse;
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

    // there is a valid "team_hierarchy_link" in the system
    String TEAM_HIERARCHY_LINK_DATA_RELATIONSHIPS_PARENT_TEAM_DATA_ID = System.getenv("TEAM_HIERARCHY_LINK_DATA_RELATIONSHIPS_PARENT_TEAM_DATA_ID");
    String TEAM_HIERARCHY_LINK_DATA_RELATIONSHIPS_SUB_TEAM_DATA_ID = System.getenv("TEAM_HIERARCHY_LINK_DATA_RELATIONSHIPS_SUB_TEAM_DATA_ID");

    try {
      TeamHierarchyLinksResponse result = apiInstance.listTeamHierarchyLinks(new ListTeamHierarchyLinksOptionalParameters().filterParentTeam(TEAM_HIERARCHY_LINK_DATA_RELATIONSHIPS_PARENT_TEAM_DATA_ID).filterSubTeam(TEAM_HIERARCHY_LINK_DATA_RELATIONSHIPS_SUB_TEAM_DATA_ID).pageNumber(0L).pageSize(100L));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#listTeamHierarchyLinks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}