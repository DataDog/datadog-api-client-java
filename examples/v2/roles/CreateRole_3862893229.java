// Create role with a permission returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RolesApi;
import com.datadog.api.client.v2.model.PermissionsType;
import com.datadog.api.client.v2.model.RelationshipToPermissionData;
import com.datadog.api.client.v2.model.RelationshipToPermissions;
import com.datadog.api.client.v2.model.RoleCreateAttributes;
import com.datadog.api.client.v2.model.RoleCreateData;
import com.datadog.api.client.v2.model.RoleCreateRequest;
import com.datadog.api.client.v2.model.RoleCreateResponse;
import com.datadog.api.client.v2.model.RoleRelationships;
import com.datadog.api.client.v2.model.RolesType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RolesApi apiInstance = new RolesApi(defaultClient);

    // there is a valid "permission" in the system
    String PERMISSION_ID = System.getenv("PERMISSION_ID");

    RoleCreateRequest body =
        new RoleCreateRequest()
            .data(
                new RoleCreateData()
                    .type(RolesType.ROLES)
                    .attributes(new RoleCreateAttributes().name("Example-Role"))
                    .relationships(
                        new RoleRelationships()
                            .permissions(
                                new RelationshipToPermissions()
                                    .data(
                                        Collections.singletonList(
                                            new RelationshipToPermissionData()
                                                .id(PERMISSION_ID)
                                                .type(PermissionsType.PERMISSIONS))))));

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
