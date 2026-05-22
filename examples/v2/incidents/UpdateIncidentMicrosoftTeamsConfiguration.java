// Update an incident Microsoft Teams configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentMicrosoftTeamsConfigurationDataAttributesRequest;
import com.datadog.api.client.v2.model.IncidentMicrosoftTeamsConfigurationDataRequest;
import com.datadog.api.client.v2.model.IncidentMicrosoftTeamsConfigurationRequest;
import com.datadog.api.client.v2.model.IncidentMicrosoftTeamsConfigurationResponse;
import com.datadog.api.client.v2.model.IncidentMicrosoftTeamsConfigurationType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentMicrosoftTeamsConfiguration", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentMicrosoftTeamsConfigurationRequest body =
        new IncidentMicrosoftTeamsConfigurationRequest()
            .data(
                new IncidentMicrosoftTeamsConfigurationDataRequest()
                    .attributes(
                        new IncidentMicrosoftTeamsConfigurationDataAttributesRequest()
                            .manualMeetingCreation(false)
                            .postMeetingSummary(true))
                    .type(IncidentMicrosoftTeamsConfigurationType.MICROSOFT_TEAMS_CONFIGURATIONS));

    try {
      IncidentMicrosoftTeamsConfigurationResponse result =
          apiInstance.updateIncidentMicrosoftTeamsConfiguration(
              UUID.fromString("00000000-0000-0000-0000-000000000000"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling IncidentsApi#updateIncidentMicrosoftTeamsConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
