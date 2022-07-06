// Delete an existing incident team returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v2.api.IncidentTeamsApi;

public class DeleteIncidentTeam {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("deleteIncidentTeam", true);
    IncidentTeamsApi apiInstance = new IncidentTeamsApi(defaultClient);

    // there is a valid "team" in the system
    String TEAM_DATA_ID = System.getenv("TEAM_DATA_ID");

    try {
      apiInstance.deleteIncidentTeam(TEAM_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentTeamsApi#deleteIncidentTeam");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
