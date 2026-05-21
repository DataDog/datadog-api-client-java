// Create an incident role assignment returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentRoleAssignmentDataAttributesRequest;
import com.datadog.api.client.v2.model.IncidentRoleAssignmentDataRequest;
import com.datadog.api.client.v2.model.IncidentRoleAssignmentRelationshipsRequest;
import com.datadog.api.client.v2.model.IncidentRoleAssignmentRequest;
import com.datadog.api.client.v2.model.IncidentRoleAssignmentResponderRelationship;
import com.datadog.api.client.v2.model.IncidentRoleAssignmentResponderRelationshipData;
import com.datadog.api.client.v2.model.IncidentRoleAssignmentResponse;
import com.datadog.api.client.v2.model.IncidentRoleAssignmentRoleRelationship;
import com.datadog.api.client.v2.model.IncidentRoleAssignmentRoleRelationshipData;
import com.datadog.api.client.v2.model.IncidentRoleAssignmentType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentRoleAssignment", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentRoleAssignmentRequest body =
        new IncidentRoleAssignmentRequest()
            .data(
                new IncidentRoleAssignmentDataRequest()
                    .attributes(new IncidentRoleAssignmentDataAttributesRequest().role("commander"))
                    .relationships(
                        new IncidentRoleAssignmentRelationshipsRequest()
                            .reservedRole(
                                new IncidentRoleAssignmentRoleRelationship()
                                    .data(
                                        new IncidentRoleAssignmentRoleRelationshipData()
                                            .id(
                                                UUID.fromString(
                                                    "00000000-0000-0000-0000-000000000000"))
                                            .type("incident_reserved_roles")))
                            .responder(
                                new IncidentRoleAssignmentResponderRelationship()
                                    .data(
                                        new IncidentRoleAssignmentResponderRelationshipData()
                                            .id(
                                                UUID.fromString(
                                                    "00000000-0000-0000-0000-000000000000"))
                                            .type("users")))
                            .userDefinedRole(
                                new IncidentRoleAssignmentRoleRelationship()
                                    .data(
                                        new IncidentRoleAssignmentRoleRelationshipData()
                                            .id(
                                                UUID.fromString(
                                                    "00000000-0000-0000-0000-000000000000"))
                                            .type("incident_reserved_roles"))))
                    .type(IncidentRoleAssignmentType.INCIDENT_ROLE_ASSIGNMENTS));

    try {
      IncidentRoleAssignmentResponse result = apiInstance.createIncidentRoleAssignment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentRoleAssignment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
