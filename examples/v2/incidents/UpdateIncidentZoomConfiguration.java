// Update an incident Zoom configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentZoomConfigurationDataAttributesRequest;
import com.datadog.api.client.v2.model.IncidentZoomConfigurationDataRequest;
import com.datadog.api.client.v2.model.IncidentZoomConfigurationRequest;
import com.datadog.api.client.v2.model.IncidentZoomConfigurationResponse;
import com.datadog.api.client.v2.model.IncidentZoomConfigurationType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentZoomConfiguration", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentZoomConfigurationRequest body =
        new IncidentZoomConfigurationRequest()
            .data(
                new IncidentZoomConfigurationDataRequest()
                    .attributes(
                        new IncidentZoomConfigurationDataAttributesRequest()
                            .manualMeetingCreation(false)
                            .meetingChatTimelineSync(false)
                            .postMeetingSummary(true))
                    .type(IncidentZoomConfigurationType.ZOOM_CONFIGURATIONS));

    try {
      IncidentZoomConfigurationResponse result =
          apiInstance.updateIncidentZoomConfiguration(
              UUID.fromString("00000000-0000-0000-0000-000000000000"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentZoomConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
