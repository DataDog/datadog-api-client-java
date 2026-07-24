// Create postmortem for an incident returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentPostmortemCreateAttributes;
import com.datadog.api.client.v2.model.IncidentPostmortemCreateData;
import com.datadog.api.client.v2.model.IncidentPostmortemCreateRequest;
import com.datadog.api.client.v2.model.IncidentPostmortemResponse;
import com.datadog.api.client.v2.model.IncidentPostmortemType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentPostmortem", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident" in the system
    String INCIDENT_DATA_ID = System.getenv("INCIDENT_DATA_ID");

    IncidentPostmortemCreateRequest body =
        new IncidentPostmortemCreateRequest()
            .data(
                new IncidentPostmortemCreateData()
                    .attributes(
                        new IncidentPostmortemCreateAttributes()
                            .documentUrl("https://app.datadoghq.com/notebook/123")
                            .title("Postmortem for IR-123"))
                    .type(IncidentPostmortemType.INCIDENT_POSTMORTEMS));

    try {
      IncidentPostmortemResponse result =
          apiInstance.createIncidentPostmortem(INCIDENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentPostmortem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
