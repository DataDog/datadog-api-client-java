// Get all member teams returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.Team;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listMemberTeams", true);
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    try {
      PaginationIterable<Team> iterable =
          apiInstance.listMemberTeamsWithPagination("super_team_id");

      for (Team item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling TeamsApi#listMemberTeamsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
