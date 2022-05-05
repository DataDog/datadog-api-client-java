// Edit an AuthN Mapping returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.AuthNMappingsApi;
import com.datadog.api.v2.client.model.AuthNMappingResponse;
import com.datadog.api.v2.client.model.AuthNMappingUpdateAttributes;
import com.datadog.api.v2.client.model.AuthNMappingUpdateData;
import com.datadog.api.v2.client.model.AuthNMappingUpdateRelationships;
import com.datadog.api.v2.client.model.AuthNMappingUpdateRequest;
import com.datadog.api.v2.client.model.AuthNMappingsType;
import com.datadog.api.v2.client.model.RelationshipToRole;
import com.datadog.api.v2.client.model.RelationshipToRoleData;
import com.datadog.api.v2.client.model.RolesType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    AuthNMappingsApi apiInstance = new AuthNMappingsApi(defaultClient);

    // there is a valid "authn_mapping" in the system
    String AUTHN_MAPPING_DATA_ID = System.getenv("AUTHN_MAPPING_DATA_ID");

    // there is a valid "role" in the system
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    AuthNMappingUpdateRequest body =
        new AuthNMappingUpdateRequest()
            .data(
                new AuthNMappingUpdateData()
                    .attributes(
                        new AuthNMappingUpdateAttributes()
                            .attributeKey("member-of")
                            .attributeValue("Development"))
                    .id(AUTHN_MAPPING_DATA_ID)
                    .relationships(
                        new AuthNMappingUpdateRelationships()
                            .role(
                                new RelationshipToRole()
                                    .data(
                                        new RelationshipToRoleData()
                                            .id(ROLE_DATA_ID)
                                            .type(RolesType.ROLES))))
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
