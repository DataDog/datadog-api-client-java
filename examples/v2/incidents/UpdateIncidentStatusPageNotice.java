// Update an incident status page notice returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentStatusPageNoticeIntegrationResponse;
import com.datadog.api.client.v2.model.IncidentStatusPageNoticeIntegrationType;
import com.datadog.api.client.v2.model.IncidentStatusPageNoticeUpdateData;
import com.datadog.api.client.v2.model.IncidentStatusPageNoticeUpdateDataAttributes;
import com.datadog.api.client.v2.model.IncidentStatusPageNoticeUpdateRequest;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentStatusPageNotice", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentStatusPageNoticeUpdateRequest body =
        new IncidentStatusPageNoticeUpdateRequest()
            .data(
                new IncidentStatusPageNoticeUpdateData()
                    .attributes(
                        new IncidentStatusPageNoticeUpdateDataAttributes()
                            .message("The issue has been resolved.")
                            .status("resolved")
                            .title("Service degradation resolved."))
                    .type(IncidentStatusPageNoticeIntegrationType.INCIDENT_INTEGRATIONS));

    try {
      IncidentStatusPageNoticeIntegrationResponse result =
          apiInstance.updateIncidentStatusPageNotice(
              "incident_id",
              UUID.fromString("00000000-0000-0000-0000-000000000000"),
              UUID.fromString("00000000-0000-0000-0000-000000000000"),
              body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentStatusPageNotice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
