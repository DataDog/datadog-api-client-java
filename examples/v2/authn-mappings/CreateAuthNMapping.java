// Create an AuthN Mapping returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AuthNMappingsApi;
import com.datadog.api.client.v2.model.AuthNMappingCreateAttributes;
import com.datadog.api.client.v2.model.AuthNMappingCreateData;
import com.datadog.api.client.v2.model.AuthNMappingCreateRelationships;
import com.datadog.api.client.v2.model.AuthNMappingCreateRequest;
import com.datadog.api.client.v2.model.AuthNMappingRelationshipToRole;
import com.datadog.api.client.v2.model.AuthNMappingResponse;
import com.datadog.api.client.v2.model.AuthNMappingsType;
import com.datadog.api.client.v2.model.RelationshipToRole;
import com.datadog.api.client.v2.model.RelationshipToRoleData;
import com.datadog.api.client.v2.model.RolesType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AuthNMappingsApi apiInstance = new AuthNMappingsApi(defaultClient);

    // there is a valid "role" in the system
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    AuthNMappingCreateRequest body =
        new AuthNMappingCreateRequest()
            .data(
                new AuthNMappingCreateData()
                    .attributes(
                        new AuthNMappingCreateAttributes()
                            .attributeKey("exampleauthnmapping")
                            .attributeValue("Example-AuthN-Mapping"))
                    .relationships(
                        new AuthNMappingCreateRelationships(
                            new AuthNMappingRelationshipToRole()
                                .role(
                                    new RelationshipToRole()
                                        .data(
                                            new RelationshipToRoleData()
                                                .id(ROLE_DATA_ID)
                                                .type(RolesType.ROLES)))))
                    .type(AuthNMappingsType.AUTHN_MAPPINGS));

    try {
      AuthNMappingResponse result = apiInstance.createAuthNMapping(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthNMappingsApi#createAuthNMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
