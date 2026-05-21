// Create an incident Zoom meeting returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentCreateZoomMeetingData;
import com.datadog.api.client.v2.model.IncidentCreateZoomMeetingDataAttributes;
import com.datadog.api.client.v2.model.IncidentCreateZoomMeetingRequest;
import com.datadog.api.client.v2.model.IncidentZoomIntegrationResponse;
import com.datadog.api.client.v2.model.IncidentZoomIntegrationType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentZoomMeeting", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentCreateZoomMeetingRequest body =
        new IncidentCreateZoomMeetingRequest()
            .data(
                new IncidentCreateZoomMeetingData()
                    .attributes(
                        new IncidentCreateZoomMeetingDataAttributes()
                            .topic("Incident INC-123 War Room"))
                    .type(IncidentZoomIntegrationType.INCIDENT_INTEGRATIONS));

    try {
      IncidentZoomIntegrationResponse result =
          apiInstance.createIncidentZoomMeeting("incident_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentZoomMeeting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
