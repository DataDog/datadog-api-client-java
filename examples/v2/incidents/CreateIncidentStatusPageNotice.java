// Publish an incident status page notice returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentStatusPageNoticeCreateData;
import com.datadog.api.client.v2.model.IncidentStatusPageNoticeCreateDataAttributes;
import com.datadog.api.client.v2.model.IncidentStatusPageNoticeCreateRequest;
import com.datadog.api.client.v2.model.IncidentStatusPageNoticeIntegrationResponse;
import com.datadog.api.client.v2.model.IncidentStatusPageNoticeIntegrationType;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentStatusPageNotice", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentStatusPageNoticeCreateRequest body =
        new IncidentStatusPageNoticeCreateRequest()
            .data(
                new IncidentStatusPageNoticeCreateData()
                    .attributes(
                        new IncidentStatusPageNoticeCreateDataAttributes()
                            .components(
                                Map.ofEntries(Map.entry("component_1", "degraded_performance")))
                            .message("We are investigating reports of elevated error rates.")
                            .status("investigating")
                            .title("Service degradation detected."))
                    .type(IncidentStatusPageNoticeIntegrationType.INCIDENT_INTEGRATIONS));

    try {
      IncidentStatusPageNoticeIntegrationResponse result =
          apiInstance.createIncidentStatusPageNotice(
              "incident_id", UUID.fromString("00000000-0000-0000-0000-000000000000"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentStatusPageNotice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
