// Edit an AuthN Mapping returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.AuthNMappingsApi;
import com.datadog.api.client.v2.model.AuthNMappingResponse;
import com.datadog.api.client.v2.model.AuthNMappingRelationshipToRole;
import com.datadog.api.client.v2.model.AuthNMappingsType;
import com.datadog.api.client.v2.model.AuthNMappingUpdateAttributes;
import com.datadog.api.client.v2.model.AuthNMappingUpdateData;
import com.datadog.api.client.v2.model.AuthNMappingUpdateRelationships;
import com.datadog.api.client.v2.model.AuthNMappingUpdateRequest;
import com.datadog.api.client.v2.model.RelationshipToRole;
import com.datadog.api.client.v2.model.RelationshipToRoleData;
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
    AuthNMappingsApi apiInstance = new AuthNMappingsApi(defaultClient);

    // there is a valid "authn_mapping" in the system
    String AUTHN_MAPPING_DATA_ID = System.getenv("AUTHN_MAPPING_DATA_ID");

    // there is a valid "role" in the system
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    AuthNMappingUpdateRequest body = new AuthNMappingUpdateRequest()
.data(new AuthNMappingUpdateData()
.attributes(new AuthNMappingUpdateAttributes()
.attributeKey("member-of")
.attributeValue("Development"))
.id(AUTHN_MAPPING_DATA_ID)
.relationships(new AuthNMappingUpdateRelationships(
new AuthNMappingRelationshipToRole()
.role(new RelationshipToRole()
.data(new RelationshipToRoleData()
.id(ROLE_DATA_ID)
.type(RolesType.ROLES)))))
.type(AuthNMappingsType.AUTHN_MAPPINGS));

    try {
      AuthNMappingResponse result = apiInstance.updateAuthNMapping(AUTHN_MAPPING_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthNMappingsApi#updateAuthNMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}