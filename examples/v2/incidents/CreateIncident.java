// Create an incident returns "CREATED" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.IncidentsApi;
import com.datadog.api.v2.client.model.IncidentCreateAttributes;
import com.datadog.api.v2.client.model.IncidentCreateData;
import com.datadog.api.v2.client.model.IncidentCreateRelationships;
import com.datadog.api.v2.client.model.IncidentCreateRequest;
import com.datadog.api.v2.client.model.IncidentFieldAttributes;
import com.datadog.api.v2.client.model.IncidentFieldAttributesSingleValue;
import com.datadog.api.v2.client.model.IncidentFieldAttributesSingleValueType;
import com.datadog.api.v2.client.model.IncidentResponse;
import com.datadog.api.v2.client.model.IncidentType;
import com.datadog.api.v2.client.model.NullableRelationshipToUser;
import com.datadog.api.v2.client.model.NullableRelationshipToUserData;
import com.datadog.api.v2.client.model.UsersType;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("createIncident", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    IncidentCreateRequest body =
        new IncidentCreateRequest()
            .data(
                new IncidentCreateData()
                    .type(IncidentType.INCIDENTS)
                    .attributes(
                        new IncidentCreateAttributes()
                            .title("Example-Create_an_incident_returns_CREATED_response")
                            .customerImpacted(false)
                            .fields(
                                Map.ofEntries(
                                    Map.entry(
                                        "state",
                                        new IncidentFieldAttributes(
                                            new IncidentFieldAttributesSingleValue()
                                                .type(
                                                    IncidentFieldAttributesSingleValueType.DROPDOWN)
                                                .value("resolved"))))))
                    .relationships(
                        new IncidentCreateRelationships()
                            .commanderUser(
                                new NullableRelationshipToUser()
                                    .data(
                                        new NullableRelationshipToUserData()
                                            .type(UsersType.USERS)
                                            .id(USER_DATA_ID)))));

    try {
      IncidentResponse result = apiInstance.createIncident(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncident");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
