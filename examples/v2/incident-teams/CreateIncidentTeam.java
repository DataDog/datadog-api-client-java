// Create a new incident team returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentTeamsApi;
import com.datadog.api.client.v2.model.IncidentTeamCreateAttributes;
import com.datadog.api.client.v2.model.IncidentTeamCreateData;
import com.datadog.api.client.v2.model.IncidentTeamCreateRequest;
import com.datadog.api.client.v2.model.IncidentTeamResponse;
import com.datadog.api.client.v2.model.IncidentTeamType;

public class CreateIncidentTeam {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("createIncidentTeam", true);
    IncidentTeamsApi apiInstance = new IncidentTeamsApi(defaultClient);

    IncidentTeamCreateRequest body =
        new IncidentTeamCreateRequest()
            .data(
                new IncidentTeamCreateData()
                    .type(IncidentTeamType.TEAMS)
                    .attributes(
                        new IncidentTeamCreateAttributes()
                            .name("Example-Create_a_new_incident_team_returns_CREATED_response")));

    try {
      IncidentTeamResponse result = apiInstance.createIncidentTeam(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentTeamsApi#createIncidentTeam");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
