// Create an incident integration metadata returns "CREATED" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataResponse;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataAttributes;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataCreateData;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataCreateRequest;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataMetadata;
import com.datadog.api.client.v2.model.IncidentIntegrationMetadataType;
import com.datadog.api.client.v2.model.SlackIntegrationMetadata;
import com.datadog.api.client.v2.model.SlackIntegrationMetadataChannelItem;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentIntegration", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident" in the system
    String INCIDENT_DATA_ID = System.getenv("INCIDENT_DATA_ID");

    IncidentIntegrationMetadataCreateRequest body = new IncidentIntegrationMetadataCreateRequest()
.data(new IncidentIntegrationMetadataCreateData()
.attributes(new IncidentIntegrationMetadataAttributes()
.incidentId(INCIDENT_DATA_ID)
.integrationType(1)
.metadata(new IncidentIntegrationMetadataMetadata(
new SlackIntegrationMetadata()
.channels(Collections.singletonList(new SlackIntegrationMetadataChannelItem()
.channelId("C0123456789")
.channelName("#new-channel")
.teamId("T01234567")
.redirectUrl("https://slack.com/app_redirect?channel=C0123456789&team=T01234567"))))))
.type(IncidentIntegrationMetadataType.INCIDENT_INTEGRATIONS));

    try {
      IncidentIntegrationMetadataResponse result = apiInstance.createIncidentIntegration(INCIDENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}