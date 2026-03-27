// Remove a member team returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.removeMemberTeam", true);
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    try {
      apiInstance.removeMemberTeam("super_team_id", "member_team_id");
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#removeMemberTeam");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
