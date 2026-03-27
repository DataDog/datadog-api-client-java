// Create role returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RolesApi;
import com.datadog.api.client.v2.model.RoleCreateResponse;
import com.datadog.api.client.v2.model.PermissionsType;
import com.datadog.api.client.v2.model.RelationshipToPermissionData;
import com.datadog.api.client.v2.model.RelationshipToPermissions;
import com.datadog.api.client.v2.model.RoleCreateAttributes;
import com.datadog.api.client.v2.model.RoleCreateData;
import com.datadog.api.client.v2.model.RoleCreateRequest;
import com.datadog.api.client.v2.model.RoleRelationships;
import com.datadog.api.client.v2.model.RolesType;
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

    RoleCreateRequest body = new RoleCreateRequest()
.data(new RoleCreateData()
.attributes(new RoleCreateAttributes()
.name("developers"))
.relationships(new RoleRelationships()
.permissions(new RelationshipToPermissions()
.data(Collections.singletonList(new RelationshipToPermissionData()
.type(PermissionsType.PERMISSIONS)))))
.type(RolesType.ROLES));

    try {
      RoleCreateResponse result = apiInstance.createRole(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#createRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}