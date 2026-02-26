// Grant permission to a role returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RolesApi;
import com.datadog.api.client.v2.model.PermissionsResponse;
import com.datadog.api.client.v2.model.PermissionsType;
import com.datadog.api.client.v2.model.RelationshipToPermission;
import com.datadog.api.client.v2.model.RelationshipToPermissionData;
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
    RolesApi apiInstance = new RolesApi(defaultClient);

    // there is a valid "role" in the system
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    // there is a valid "permission" in the system
    String PERMISSION_ID = System.getenv("PERMISSION_ID");

    RelationshipToPermission body = new RelationshipToPermission()
.data(new RelationshipToPermissionData()
.id(PERMISSION_ID)
.type(PermissionsType.PERMISSIONS));

    try {
      PermissionsResponse result = apiInstance.addPermissionToRole(ROLE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#addPermissionToRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}