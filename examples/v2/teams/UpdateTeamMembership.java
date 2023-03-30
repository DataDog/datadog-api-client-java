// Update a user's membership attributes on a team returns "Represents a user's association to a
// team" response

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

    UserTeamUpdateRequest body =
        new UserTeamUpdateRequest()
            .data(
                new UserTeamUpdate()
                    .attributes(new UserTeamAttributes().role(UserTeamRole.ADMIN))
                    .type(UserTeamType.TEAM_MEMBERSHIPS));

    try {
      UserTeamResponse result = apiInstance.updateTeamMembership("team_id", "user_id", body);
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
