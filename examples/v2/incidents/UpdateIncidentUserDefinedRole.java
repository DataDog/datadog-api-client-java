// Update an incident user-defined role returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentUserDefinedRolePatchDataAttributesRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedRolePatchDataRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedRolePatchRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedRolePolicy;
import com.datadog.api.client.v2.model.IncidentUserDefinedRoleResponse;
import com.datadog.api.client.v2.model.IncidentUserDefinedRoleType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentUserDefinedRole", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentUserDefinedRolePatchRequest body =
        new IncidentUserDefinedRolePatchRequest()
            .data(
                new IncidentUserDefinedRolePatchDataRequest()
                    .attributes(
                        new IncidentUserDefinedRolePatchDataAttributesRequest()
                            .description("The technical lead for the incident.")
                            .name("Tech Lead")
                            .policy(new IncidentUserDefinedRolePolicy().isSingle(true)))
                    .id(UUID.fromString("00000000-0000-0000-0000-000000000002"))
                    .type(IncidentUserDefinedRoleType.INCIDENT_USER_DEFINED_ROLES));

    try {
      IncidentUserDefinedRoleResponse result =
          apiInstance.updateIncidentUserDefinedRole(
              UUID.fromString("00000000-0000-0000-0000-000000000002"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentUserDefinedRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
