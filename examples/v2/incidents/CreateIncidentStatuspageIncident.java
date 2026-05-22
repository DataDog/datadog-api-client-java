// Create a Statuspage incident for an incident returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentStatuspageIncidentDataAttributesRequest;
import com.datadog.api.client.v2.model.IncidentStatuspageIncidentDataRequest;
import com.datadog.api.client.v2.model.IncidentStatuspageIncidentRequest;
import com.datadog.api.client.v2.model.IncidentStatuspageIncidentResponse;
import com.datadog.api.client.v2.model.IncidentStatuspageIncidentType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentStatuspageIncident", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentStatuspageIncidentRequest body =
        new IncidentStatuspageIncidentRequest()
            .data(
                new IncidentStatuspageIncidentDataRequest()
                    .attributes(
                        new IncidentStatuspageIncidentDataAttributesRequest()
                            .body("We are investigating the issue.")
                            .deliverNotifications(true)
                            .impact("major")
                            .name("Service Outage")
                            .pageId("abc123")
                            .status("investigating"))
                    .type(IncidentStatuspageIncidentType.INCIDENT_INTEGRATIONS));

    try {
      IncidentStatuspageIncidentResponse result =
          apiInstance.createIncidentStatuspageIncident("incident_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentStatuspageIncident");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
