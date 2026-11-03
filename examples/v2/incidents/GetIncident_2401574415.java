// Get the details of an incident includes responders with modification timestamps

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.api.IncidentsApi.GetIncidentOptionalParameters;
import com.datadog.api.client.v2.model.IncidentRelatedObject;
import com.datadog.api.client.v2.model.IncidentResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createIncident", true);
    defaultClient.setUnstableOperationEnabled("v2.getIncident", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident_with_commander" in the system
    String INCIDENT_WITH_COMMANDER_DATA_ID = System.getenv("INCIDENT_WITH_COMMANDER_DATA_ID");

    try {
      IncidentResponse result =
          apiInstance.getIncident(
              INCIDENT_WITH_COMMANDER_DATA_ID,
              new GetIncidentOptionalParameters()
                  .include(Collections.singletonList(IncidentRelatedObject.RESPONDERS)));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#getIncident");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
