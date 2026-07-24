// Update postmortem for an incident returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentPostmortemResponse;
import com.datadog.api.client.v2.model.IncidentPostmortemType;
import com.datadog.api.client.v2.model.IncidentPostmortemUpdateAttributes;
import com.datadog.api.client.v2.model.IncidentPostmortemUpdateData;
import com.datadog.api.client.v2.model.IncidentPostmortemUpdateRequest;
import com.datadog.api.client.v2.model.PostmortemStatus;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentPostmortem", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "postmortem" in the system
    String POSTMORTEM_DATA_ID = System.getenv("POSTMORTEM_DATA_ID");
    String POSTMORTEM_DATA_RELATIONSHIPS_INCIDENT_DATA_ID =
        System.getenv("POSTMORTEM_DATA_RELATIONSHIPS_INCIDENT_DATA_ID");

    IncidentPostmortemUpdateRequest body =
        new IncidentPostmortemUpdateRequest()
            .data(
                new IncidentPostmortemUpdateData()
                    .attributes(
                        new IncidentPostmortemUpdateAttributes().status(PostmortemStatus.IN_REVIEW))
                    .id(POSTMORTEM_DATA_ID)
                    .type(IncidentPostmortemType.INCIDENT_POSTMORTEMS));

    try {
      IncidentPostmortemResponse result =
          apiInstance.updateIncidentPostmortem(
              POSTMORTEM_DATA_RELATIONSHIPS_INCIDENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentPostmortem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
