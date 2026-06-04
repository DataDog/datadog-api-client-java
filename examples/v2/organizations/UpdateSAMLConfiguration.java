// Update a SAML configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrganizationsApi;
import com.datadog.api.client.v2.model.RelationshipToRoleData;
import com.datadog.api.client.v2.model.RelationshipToRoles;
import com.datadog.api.client.v2.model.RolesType;
import com.datadog.api.client.v2.model.SAMLConfigurationRelationships;
import com.datadog.api.client.v2.model.SAMLConfigurationResponse;
import com.datadog.api.client.v2.model.SAMLConfigurationUpdateAttributes;
import com.datadog.api.client.v2.model.SAMLConfigurationUpdateData;
import com.datadog.api.client.v2.model.SAMLConfigurationUpdateRequest;
import com.datadog.api.client.v2.model.SAMLConfigurationsType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    SAMLConfigurationUpdateRequest body =
        new SAMLConfigurationUpdateRequest()
            .data(
                new SAMLConfigurationUpdateData()
                    .attributes(
                        new SAMLConfigurationUpdateAttributes()
                            .idpInitiated(true)
                            .jitDomains(Collections.singletonList("example.com")))
                    .id("3653d3c6-0c75-11ea-ad28-fb5701eabc7d")
                    .relationships(
                        new SAMLConfigurationRelationships()
                            .defaultRoles(
                                new RelationshipToRoles()
                                    .data(
                                        Collections.singletonList(
                                            new RelationshipToRoleData()
                                                .id("3653d3c6-0c75-11ea-ad28-fb5701eabc7d")
                                                .type(RolesType.ROLES)))))
                    .type(SAMLConfigurationsType.SAML_CONFIGURATIONS));

    try {
      SAMLConfigurationResponse result =
          apiInstance.updateSAMLConfiguration("3653d3c6-0c75-11ea-ad28-fb5701eabc7d", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#updateSAMLConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
