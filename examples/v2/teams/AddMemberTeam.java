// Add a member team returns "Added" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.AddMemberTeamRequest;
import com.datadog.api.client.v2.model.MemberTeam;
import com.datadog.api.client.v2.model.MemberTeamType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.addMemberTeam", true);
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    AddMemberTeamRequest body =
        new AddMemberTeamRequest()
            .data(
                new MemberTeam()
                    .id("aeadc05e-98a8-11ec-ac2c-da7ad0900001")
                    .type(MemberTeamType.MEMBER_TEAMS));

    try {
      apiInstance.addMemberTeam("super_team_id", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#addMemberTeam");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
