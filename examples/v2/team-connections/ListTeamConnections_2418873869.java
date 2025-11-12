// List team connections returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.TeamConnectionsApi;
import com.datadog.api.client.v2.model.TeamConnection;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listTeamConnections", true);
    TeamConnectionsApi apiInstance = new TeamConnectionsApi(defaultClient);

    try {
      PaginationIterable<TeamConnection> iterable = apiInstance.listTeamConnectionsWithPagination();

      for (TeamConnection item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling TeamConnectionsApi#listTeamConnectionsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
