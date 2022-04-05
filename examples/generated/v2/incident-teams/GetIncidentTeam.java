import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.IncidentTeamsApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    IncidentTeamsApi apiInstance = new IncidentTeamsApi(defaultClient);
    String teamId = "teamId_example"; // String | The ID of the incident team.
    IncidentRelatedObject include =
        IncidentRelatedObject.fromValue(
            "users"); // IncidentRelatedObject | Specifies which types of related objects should be
                      // included in the response.
    try {
      IncidentTeamResponse result =
          apiInstance.getIncidentTeam(
              teamId, new IncidentTeamsApi.GetIncidentTeamOptionalParameters().include(include));
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
