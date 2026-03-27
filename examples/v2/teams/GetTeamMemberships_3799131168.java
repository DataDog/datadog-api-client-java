// Get team memberships returns "Represents a user's association to a team" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.api.TeamsApi.GetTeamMembershipsOptionalParameters;
import com.datadog.api.client.v2.model.UserTeam;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    try {
      PaginationIterable<UserTeam> iterable =
          apiInstance.getTeamMembershipsWithPagination(
              "2e06bf2c-193b-41d4-b3c2-afccc080458f",
              new GetTeamMembershipsOptionalParameters().pageSize(2L));

      for (UserTeam item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling TeamsApi#getTeamMembershipsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
