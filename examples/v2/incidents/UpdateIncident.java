// Update an existing incident returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.IncidentsApi;
import com.datadog.api.v2.client.model.IncidentFieldAttributes;
import com.datadog.api.v2.client.model.IncidentFieldAttributesSingleValue;
import com.datadog.api.v2.client.model.IncidentFieldAttributesSingleValueType;
import com.datadog.api.v2.client.model.IncidentResponse;
import com.datadog.api.v2.client.model.IncidentType;
import com.datadog.api.v2.client.model.IncidentUpdateAttributes;
import com.datadog.api.v2.client.model.IncidentUpdateData;
import com.datadog.api.v2.client.model.IncidentUpdateRequest;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident" in the system
    String INCIDENT_DATA_ATTRIBUTES_TITLE = System.getenv("INCIDENT_DATA_ATTRIBUTES_TITLE");
    String INCIDENT_DATA_ID = System.getenv("INCIDENT_DATA_ID");

    IncidentUpdateRequest body =
        new IncidentUpdateRequest()
            .data(
                new IncidentUpdateData()
                    .id(INCIDENT_DATA_ID)
                    .type(IncidentType.INCIDENTS)
                    .attributes(
                        new IncidentUpdateAttributes()
                            .fields(
                                Map.ofEntries(
                                    Map.entry(
                                        "state",
                                        new IncidentFieldAttributes(
                                            new IncidentFieldAttributesSingleValue()
                                                .type(
                                                    IncidentFieldAttributesSingleValueType.DROPDOWN)
                                                .value("resolved")))))
                            .title("A test incident title-updated")));

    try {
      IncidentResponse result = apiInstance.updateIncident(INCIDENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
