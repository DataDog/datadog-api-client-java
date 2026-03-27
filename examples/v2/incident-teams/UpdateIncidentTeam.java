// Update an existing incident team returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentTeamsApi;
import com.datadog.api.client.v2.model.IncidentTeamResponse;
import com.datadog.api.client.v2.model.IncidentTeamType;
import com.datadog.api.client.v2.model.IncidentTeamUpdateAttributes;
import com.datadog.api.client.v2.model.IncidentTeamUpdateData;
import com.datadog.api.client.v2.model.IncidentTeamUpdateRequest;
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
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentTeam", true);
    IncidentTeamsApi apiInstance = new IncidentTeamsApi(defaultClient);

    // there is a valid "team" in the system
    String TEAM_DATA_ATTRIBUTES_NAME = System.getenv("TEAM_DATA_ATTRIBUTES_NAME");
    String TEAM_DATA_ID = System.getenv("TEAM_DATA_ID");

    IncidentTeamUpdateRequest body = new IncidentTeamUpdateRequest()
.data(new IncidentTeamUpdateData()
.type(IncidentTeamType.TEAMS)
.attributes(new IncidentTeamUpdateAttributes()
.name("team name-updated")));

    try {
      IncidentTeamResponse result = apiInstance.updateIncidentTeam(TEAM_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentTeamsApi#updateIncidentTeam");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}