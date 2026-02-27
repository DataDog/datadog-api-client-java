// Update organization SAML preferences returns "No Content - The SAML preferences were successfully
// updated." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OrganizationsApi;
import com.datadog.api.client.v2.model.SamlConfigurationsUpdateAttributes;
import com.datadog.api.client.v2.model.SamlConfigurationsUpdateRequest;
import com.datadog.api.client.v2.model.SamlConfigurationsUpdateRequestData;
import com.datadog.api.client.v2.model.SamlConfigurationsUpdateRequestDataType;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateOrgSamlConfigurations", true);
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    SamlConfigurationsUpdateRequest body =
        new SamlConfigurationsUpdateRequest()
            .data(
                new SamlConfigurationsUpdateRequestData()
                    .attributes(
                        new SamlConfigurationsUpdateAttributes()
                            .defaultRoleUuids(
                                Collections.singletonList(
                                    UUID.fromString("19fcc38b-b651-46a0-b463-1f8f56c6a862")))
                            .jitDomains(Arrays.asList("example1.com", "example2.com")))
                    .type(SamlConfigurationsUpdateRequestDataType.SAML_PREFERENCES));

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
