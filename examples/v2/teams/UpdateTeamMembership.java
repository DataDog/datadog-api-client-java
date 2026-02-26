// Update a user's membership attributes on a team returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.UserTeamAttributes;
import com.datadog.api.client.v2.model.UserTeamResponse;
import com.datadog.api.client.v2.model.UserTeamRole;
import com.datadog.api.client.v2.model.UserTeamType;
import com.datadog.api.client.v2.model.UserTeamUpdate;
import com.datadog.api.client.v2.model.UserTeamUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    UserTeamUpdateRequest body =
        new UserTeamUpdateRequest()
            .data(
                new UserTeamUpdate()
                    .attributes(new UserTeamAttributes().role(UserTeamRole.ADMIN))
                    .type(UserTeamType.TEAM_MEMBERSHIPS));

    try {
      UserTeamResponse result =
          apiInstance.updateTeamMembership(DD_TEAM_DATA_ID, USER_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateTeamMembership");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
