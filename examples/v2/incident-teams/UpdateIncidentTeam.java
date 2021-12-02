// Update an existing incident team returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.IncidentTeamsApi;
import com.datadog.api.v2.client.model.IncidentTeamResponse;
import com.datadog.api.v2.client.model.IncidentTeamType;
import com.datadog.api.v2.client.model.IncidentTeamUpdateAttributes;
import com.datadog.api.v2.client.model.IncidentTeamUpdateData;
import com.datadog.api.v2.client.model.IncidentTeamUpdateRequest;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    IncidentTeamsApi apiInstance = new IncidentTeamsApi(defaultClient);

    // there is a valid "team" in the system
    String TEAM_DATA_ATTRIBUTES_NAME = System.getenv("TEAM_DATA_ATTRIBUTES_NAME");
    String TEAM_DATA_ID = System.getenv("TEAM_DATA_ID");

    IncidentTeamUpdateRequest body =
        new IncidentTeamUpdateRequest()
            .data(
                new IncidentTeamUpdateData()
                    .type(IncidentTeamType.TEAMS)
                    .attributes(new IncidentTeamUpdateAttributes().name("team name-updated")));

    try {
      IncidentTeamResponse result = apiInstance.updateIncidentTeam(TEAM_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
