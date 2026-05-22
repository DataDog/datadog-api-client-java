// Create an incident Microsoft Teams configuration returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentMicrosoftTeamsConfigurationDataAttributesRequest;
import com.datadog.api.client.v2.model.IncidentMicrosoftTeamsConfigurationDataRequest;
import com.datadog.api.client.v2.model.IncidentMicrosoftTeamsConfigurationRequest;
import com.datadog.api.client.v2.model.IncidentMicrosoftTeamsConfigurationResponse;
import com.datadog.api.client.v2.model.IncidentMicrosoftTeamsConfigurationType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentMicrosoftTeamsConfiguration", true);
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
          apiInstance.createIncidentMicrosoftTeamsConfiguration(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling IncidentsApi#createIncidentMicrosoftTeamsConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
