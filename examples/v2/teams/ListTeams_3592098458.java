// Get all teams returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.api.TeamsApi.ListTeamsOptionalParameters;
import com.datadog.api.client.v2.model.Team;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    try {
      PaginationIterable<Team> iterable =
          apiInstance.listTeamsWithPagination(new ListTeamsOptionalParameters().pageSize(2L));

      for (Team item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling TeamsApi#listTeamsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
