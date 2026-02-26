// Remove commander from an incident returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentResponse;
import com.datadog.api.client.v2.model.IncidentType;
import com.datadog.api.client.v2.model.IncidentUpdateData;
import com.datadog.api.client.v2.model.IncidentUpdateRelationships;
import com.datadog.api.client.v2.model.IncidentUpdateRequest;
import com.datadog.api.client.v2.model.NullableRelationshipToUser;
import com.datadog.api.client.v2.model.NullableRelationshipToUserData;
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
    defaultClient.setUnstableOperationEnabled("v2.updateIncident", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident" in the system
    String INCIDENT_DATA_ID = System.getenv("INCIDENT_DATA_ID");

    IncidentUpdateRequest body = new IncidentUpdateRequest()
.data(new IncidentUpdateData()
.id(INCIDENT_DATA_ID)
.type(IncidentType.INCIDENTS)
.relationships(new IncidentUpdateRelationships()
.commanderUser(new NullableRelationshipToUser()
.data(null))));

    try {
      IncidentResponse result = apiInstance.updateIncident(INCIDENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncident");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}