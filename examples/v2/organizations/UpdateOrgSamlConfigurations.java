// Update organization SAML preferences returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrganizationsApi;
import com.datadog.api.client.v2.model.OrgSAMLPreferencesAttributes;
import com.datadog.api.client.v2.model.OrgSAMLPreferencesData;
import com.datadog.api.client.v2.model.OrgSAMLPreferencesType;
import com.datadog.api.client.v2.model.OrgSAMLPreferencesUpdateRequest;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateOrgSamlConfigurations", true);
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    OrgSAMLPreferencesUpdateRequest body =
        new OrgSAMLPreferencesUpdateRequest()
            .data(
                new OrgSAMLPreferencesData()
                    .attributes(
                        new OrgSAMLPreferencesAttributes()
                            .defaultRoleUuids(
                                Collections.singletonList(
                                    UUID.fromString("8dd1cf3c-0c75-11ea-ad28-fb5701eabc7d")))
                            .jitDomains(Collections.singletonList("example.com")))
                    .id("00000000-0000-0000-0000-000000000000")
                    .type(OrgSAMLPreferencesType.SAML_PREFERENCES));

    try {
      apiInstance.updateOrgSamlConfigurations(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#updateOrgSamlConfigurations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
