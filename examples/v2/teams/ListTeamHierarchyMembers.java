// Get team hierarchy members returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.api.TeamsApi.ListTeamHierarchyMembersOptionalParameters;
import com.datadog.api.client.v2.model.TeamHierarchyMembersResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.listTeamHierarchyMembers", true);
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    // there is a valid "user" in the system
    String USER_DATA_ATTRIBUTES_EMAIL = System.getenv("USER_DATA_ATTRIBUTES_EMAIL");

    try {
      TeamHierarchyMembersResponse result =
          apiInstance.listTeamHierarchyMembers(
              DD_TEAM_DATA_ID,
              new ListTeamHierarchyMembersOptionalParameters()
                  .filterKeyword(USER_DATA_ATTRIBUTES_EMAIL)
                  .include("user,team"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#listTeamHierarchyMembers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
