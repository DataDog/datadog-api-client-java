// Create a team link returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.TeamLinkAttributes;
import com.datadog.api.client.v2.model.TeamLinkCreate;
import com.datadog.api.client.v2.model.TeamLinkCreateRequest;
import com.datadog.api.client.v2.model.TeamLinkResponse;
import com.datadog.api.client.v2.model.TeamLinkType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    TeamLinkCreateRequest body =
        new TeamLinkCreateRequest()
            .data(
                new TeamLinkCreate()
                    .attributes(
                        new TeamLinkAttributes()
                            .label("Link label")
                            .url("https://example.com")
                            .position(0))
                    .type(TeamLinkType.TEAM_LINKS));

    try {
      TeamLinkResponse result = apiInstance.createTeamLink(DD_TEAM_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#createTeamLink");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
