// Update an existing incident integration metadata returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataAttributes;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataMetadata;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataPatchData;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataPatchRequest;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataResponse;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataType;
import com.datadog.api.client.v2.model.SlackIntegrationMetadata;
import com.datadog.api.client.v2.model.SlackIntegrationMetadataChannelItem;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentIntegration", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident" in the system
    String INCIDENT_DATA_ID = System.getenv("INCIDENT_DATA_ID");

    // the "incident" has an "incident_integration_metadata"
    String INCIDENT_INTEGRATION_METADATA_DATA_ID =
        System.getenv("INCIDENT_INTEGRATION_METADATA_DATA_ID");

    IncidentIntegrationMetadataPatchRequest body =
        new IncidentIntegrationMetadataPatchRequest()
            .data(
                new IncidentIntegrationMetadataPatchData()
                    .attributes(
                        new IncidentIntegrationMetadataAttributes()
                            .incidentId(INCIDENT_DATA_ID)
                            .integrationType(1)
                            .metadata(
                                new IncidentIntegrationMetadataMetadata(
                                    new SlackIntegrationMetadata()
                                        .channels(
                                            Collections.singletonList(
                                                new SlackIntegrationMetadataChannelItem()
                                                    .channelId("C0123456789")
                                                    .channelName("#updated-channel-name")
                                                    .teamId("T01234567")
                                                    .redirectUrl(
                                                        "https://slack.com/app_redirect?channel=C0123456789&team=T01234567"))))))
                    .type(IncidentIntegrationMetadataType.INCIDENT_INTEGRATIONS));

    try {
      IncidentIntegrationMetadataResponse result =
          apiInstance.updateIncidentIntegration(
              INCIDENT_DATA_ID, INCIDENT_INTEGRATION_METADATA_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
