// Create an incident user-defined role returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentUserDefinedRoleDataAttributesRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedRoleDataRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedRoleIncidentTypeRelationship;
import com.datadog.api.client.v2.model.IncidentUserDefinedRoleIncidentTypeRelationshipData;
import com.datadog.api.client.v2.model.IncidentUserDefinedRolePolicy;
import com.datadog.api.client.v2.model.IncidentUserDefinedRoleRelationshipsRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedRoleRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedRoleResponse;
import com.datadog.api.client.v2.model.IncidentUserDefinedRoleType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentUserDefinedRole", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentUserDefinedRoleRequest body =
        new IncidentUserDefinedRoleRequest()
            .data(
                new IncidentUserDefinedRoleDataRequest()
                    .attributes(
                        new IncidentUserDefinedRoleDataAttributesRequest()
                            .description("The technical lead for the incident.")
                            .name("Tech Lead")
                            .policy(new IncidentUserDefinedRolePolicy().isSingle(true)))
                    .relationships(
                        new IncidentUserDefinedRoleRelationshipsRequest()
                            .incidentType(
                                new IncidentUserDefinedRoleIncidentTypeRelationship()
                                    .data(
                                        new IncidentUserDefinedRoleIncidentTypeRelationshipData()
                                            .id(
                                                UUID.fromString(
                                                    "00000000-0000-0000-0000-000000000001"))
                                            .type("incident_types"))))
                    .type(IncidentUserDefinedRoleType.INCIDENT_USER_DEFINED_ROLES));

    try {
      IncidentUserDefinedRoleResponse result = apiInstance.createIncidentUserDefinedRole(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentUserDefinedRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
