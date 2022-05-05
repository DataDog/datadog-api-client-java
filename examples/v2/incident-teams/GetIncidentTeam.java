// Get details of an incident team returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.IncidentTeamsApi;
import com.datadog.api.v2.client.model.IncidentTeamResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("getIncidentTeam", true);
    IncidentTeamsApi apiInstance = new IncidentTeamsApi(defaultClient);

    // there is a valid "team" in the system
    String TEAM_DATA_ID = System.getenv("TEAM_DATA_ID");

    try {
      IncidentTeamResponse result = apiInstance.getIncidentTeam(TEAM_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentTeamsApi#getIncidentTeam");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
