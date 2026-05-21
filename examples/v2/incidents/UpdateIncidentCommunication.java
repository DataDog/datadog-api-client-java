// Update an incident communication returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentCommunicationContent;
import com.datadog.api.client.v2.model.IncidentCommunicationContentHandle;
import com.datadog.api.client.v2.model.IncidentCommunicationDataAttributesRequest;
import com.datadog.api.client.v2.model.IncidentCommunicationDataRequest;
import com.datadog.api.client.v2.model.IncidentCommunicationKind;
import com.datadog.api.client.v2.model.IncidentCommunicationRequest;
import com.datadog.api.client.v2.model.IncidentCommunicationResponse;
import com.datadog.api.client.v2.model.IncidentCommunicationType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentCommunication", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentCommunicationRequest body =
        new IncidentCommunicationRequest()
            .data(
                new IncidentCommunicationDataRequest()
                    .attributes(
                        new IncidentCommunicationDataAttributesRequest()
                            .communicationType(IncidentCommunicationKind.MANUAL)
                            .content(
                                new IncidentCommunicationContent()
                                    .groupingKey("update-1")
                                    .handles(
                                        Collections.singletonList(
                                            new IncidentCommunicationContentHandle()
                                                .createdAt("2024-01-01T00:00:00.000Z")
                                                .displayName("#incidents-channel")
                                                .handle("@slack-incidents-channel")))
                                    .message("Incident update for INC-123.")
                                    .status(0)
                                    .subject("Incident INC-123: Update")))
                    .type(IncidentCommunicationType.COMMUNICATION));

    try {
      IncidentCommunicationResponse result =
          apiInstance.updateIncidentCommunication(
              "incident_id", UUID.fromString("00000000-0000-0000-0000-000000000000"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentCommunication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
