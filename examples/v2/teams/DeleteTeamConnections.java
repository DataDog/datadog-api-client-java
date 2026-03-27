// Delete team connections returns "No Content" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.TeamConnectionDeleteRequest;
import com.datadog.api.client.v2.model.TeamConnectionDeleteRequestDataItem;
import com.datadog.api.client.v2.model.TeamConnectionType;
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

    // there is a valid "team_connection" in the system
    String TEAM_CONNECTION_ID = System.getenv("TEAM_CONNECTION_ID");

    TeamConnectionDeleteRequest body = new TeamConnectionDeleteRequest()
.data(Collections.singletonList(new TeamConnectionDeleteRequestDataItem()
.id(TEAM_CONNECTION_ID)
.type(TeamConnectionType.TEAM_CONNECTION)));

    try {
      apiInstance.deleteTeamConnections(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#deleteTeamConnections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}