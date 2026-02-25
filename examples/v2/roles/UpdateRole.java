// Update a role returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RolesApi;
import com.datadog.api.client.v2.model.RoleUpdateResponse;
import com.datadog.api.client.v2.model.PermissionsType;
import com.datadog.api.client.v2.model.RelationshipToPermissionData;
import com.datadog.api.client.v2.model.RelationshipToPermissions;
import com.datadog.api.client.v2.model.RoleRelationships;
import com.datadog.api.client.v2.model.RolesType;
import com.datadog.api.client.v2.model.RoleUpdateAttributes;
import com.datadog.api.client.v2.model.RoleUpdateData;
import com.datadog.api.client.v2.model.RoleUpdateRequest;
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
    String ROLE_DATA_ATTRIBUTES_NAME = System.getenv("ROLE_DATA_ATTRIBUTES_NAME");
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    // there is a valid "permission" in the system
    String PERMISSION_ID = System.getenv("PERMISSION_ID");

    RoleUpdateRequest body = new RoleUpdateRequest()
.data(new RoleUpdateData()
.id(ROLE_DATA_ID)
.type(RolesType.ROLES)
.attributes(new RoleUpdateAttributes()
.name("developers-updated"))
.relationships(new RoleRelationships()
.permissions(new RelationshipToPermissions()
.data(Collections.singletonList(new RelationshipToPermissionData()
.id(PERMISSION_ID)
.type(PermissionsType.PERMISSIONS))))));

    try {
      RoleUpdateResponse result = apiInstance.updateRole(ROLE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#updateRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}