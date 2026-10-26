// Get team hierarchy members returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.api.TeamsApi.ListTeamHierarchyMembersOptionalParameters;
import com.datadog.api.client.v2.model.TeamHierarchyMember;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.listTeamHierarchyMembers", true);
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    try {
      PaginationIterable<TeamHierarchyMember> iterable =
          apiInstance.listTeamHierarchyMembersWithPagination(
              DD_TEAM_DATA_ID,
              new ListTeamHierarchyMembersOptionalParameters()
                  .filterKeyword("Example-Team")
                  .pageSize(1L));

      for (TeamHierarchyMember item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling TeamsApi#listTeamHierarchyMembersWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
