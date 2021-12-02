// Get a list of all incident teams returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.IncidentTeamsApi;
import com.datadog.api.v2.client.model.IncidentTeamsResponse;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    IncidentTeamsApi apiInstance = new IncidentTeamsApi(defaultClient);

    // there is a valid "team" in the system
    String TEAM_DATA_ATTRIBUTES_NAME = System.getenv("TEAM_DATA_ATTRIBUTES_NAME");

    try {
      IncidentTeamsResponse result = apiInstance.listIncidentTeams();
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
