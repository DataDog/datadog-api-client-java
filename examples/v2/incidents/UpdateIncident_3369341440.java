// Add commander to an incident returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.IncidentsApi;
import com.datadog.api.v2.client.model.IncidentResponse;
import com.datadog.api.v2.client.model.IncidentType;
import com.datadog.api.v2.client.model.IncidentUpdateData;
import com.datadog.api.v2.client.model.IncidentUpdateRelationships;
import com.datadog.api.v2.client.model.IncidentUpdateRequest;
import com.datadog.api.v2.client.model.NullableRelationshipToUser;
import com.datadog.api.v2.client.model.NullableRelationshipToUserData;
import com.datadog.api.v2.client.model.UsersType;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("updateIncident", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident" in the system
    String INCIDENT_DATA_ID = System.getenv("INCIDENT_DATA_ID");

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    IncidentUpdateRequest body =
        new IncidentUpdateRequest()
            .data(
                new IncidentUpdateData()
                    .id(INCIDENT_DATA_ID)
                    .type(IncidentType.INCIDENTS)
                    .relationships(
                        new IncidentUpdateRelationships()
                            .commanderUser(
                                new NullableRelationshipToUser()
                                    .data(
                                        new NullableRelationshipToUserData()
                                            .id(USER_DATA_ID)
                                            .type(UsersType.USERS)))));

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
