// Create an incident responder returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentResponderDataRequest;
import com.datadog.api.client.v2.model.IncidentResponderRelationshipsRequest;
import com.datadog.api.client.v2.model.IncidentResponderRequest;
import com.datadog.api.client.v2.model.IncidentResponderResponse;
import com.datadog.api.client.v2.model.IncidentResponderType;
import com.datadog.api.client.v2.model.IncidentResponderUserRelationship;
import com.datadog.api.client.v2.model.IncidentResponderUserRelationshipData;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createIncidentResponder", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentResponderRequest body =
        new IncidentResponderRequest()
            .data(
                new IncidentResponderDataRequest()
                    .relationships(
                        new IncidentResponderRelationshipsRequest()
                            .user(
                                new IncidentResponderUserRelationship()
                                    .data(
                                        new IncidentResponderUserRelationshipData()
                                            .id(
                                                UUID.fromString(
                                                    "00000000-0000-0000-0000-000000000000"))
                                            .type("users"))))
                    .type(IncidentResponderType.INCIDENT_RESPONDERS));

    try {
      IncidentResponderResponse result = apiInstance.createIncidentResponder("incident_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentResponder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
