// Create an incident Microsoft Teams online meeting returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentMSTeamsIntegrationResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentMSTeamsOnlineMeeting", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    try {
      IncidentMSTeamsIntegrationResponse result =
          apiInstance.createIncidentMSTeamsOnlineMeeting("incident_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentMSTeamsOnlineMeeting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
