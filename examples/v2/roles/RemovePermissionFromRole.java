// Revoke permission returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.RolesApi;
import com.datadog.api.v2.client.model.PermissionsResponse;
import com.datadog.api.v2.client.model.PermissionsType;
import com.datadog.api.v2.client.model.RelationshipToPermission;
import com.datadog.api.v2.client.model.RelationshipToPermissionData;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    RolesApi apiInstance = new RolesApi(defaultClient);

    // there is a valid "role" in the system
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    // there is a valid "permission" in the system
    String PERMISSION_ID = System.getenv("PERMISSION_ID");

    RelationshipToPermission body =
        new RelationshipToPermission()
            .data(
                new RelationshipToPermissionData()
                    .id(PERMISSION_ID)
                    .type(PermissionsType.PERMISSIONS));

    try {
      PermissionsResponse result = apiInstance.removePermissionFromRole(ROLE_DATA_ID, body);
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
