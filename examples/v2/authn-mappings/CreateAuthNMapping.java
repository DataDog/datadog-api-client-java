// Create an AuthN Mapping returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.AuthNMappingsApi;
import com.datadog.api.v2.client.model.AuthNMappingCreateAttributes;
import com.datadog.api.v2.client.model.AuthNMappingCreateData;
import com.datadog.api.v2.client.model.AuthNMappingCreateRelationships;
import com.datadog.api.v2.client.model.AuthNMappingCreateRequest;
import com.datadog.api.v2.client.model.AuthNMappingResponse;
import com.datadog.api.v2.client.model.AuthNMappingsType;
import com.datadog.api.v2.client.model.RelationshipToRole;
import com.datadog.api.v2.client.model.RelationshipToRoleData;
import com.datadog.api.v2.client.model.RolesType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    AuthNMappingsApi apiInstance = new AuthNMappingsApi(defaultClient);

    // there is a valid "role" in the system
    String ROLE_DATA_ID = System.getenv("ROLE_DATA_ID");

    AuthNMappingCreateRequest body =
        new AuthNMappingCreateRequest()
            .data(
                new AuthNMappingCreateData()
                    .attributes(
                        new AuthNMappingCreateAttributes()
                            .attributeKey("examplecreateanauthnmappingreturnsokresponse")
                            .attributeValue("Example-Create_an_AuthN_Mapping_returns_OK_response"))
                    .relationships(
                        new AuthNMappingCreateRelationships()
                            .role(
                                new RelationshipToRole()
                                    .data(
                                        new RelationshipToRoleData()
                                            .id(ROLE_DATA_ID)
                                            .type(RolesType.ROLES))))
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
