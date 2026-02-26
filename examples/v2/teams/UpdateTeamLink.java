// Update a team link returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.TeamLinkResponse;
import com.datadog.api.client.v2.model.TeamLinkAttributes;
import com.datadog.api.client.v2.model.TeamLinkCreate;
import com.datadog.api.client.v2.model.TeamLinkCreateRequest;
import com.datadog.api.client.v2.model.TeamLinkType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    // there is a valid "team_link" in the system
    String TEAM_LINK_DATA_ID = System.getenv("TEAM_LINK_DATA_ID");

    TeamLinkCreateRequest body = new TeamLinkCreateRequest()
.data(new TeamLinkCreate()
.attributes(new TeamLinkAttributes()
.label("New Label")
.url("https://example.com"))
.type(TeamLinkType.TEAM_LINKS));

    try {
      TeamLinkResponse result = apiInstance.updateTeamLink(DD_TEAM_DATA_ID, TEAM_LINK_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateTeamLink");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}