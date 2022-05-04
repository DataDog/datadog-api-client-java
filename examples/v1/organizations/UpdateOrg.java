// Update your organization returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.OrganizationsApi;
import com.datadog.api.v1.client.model.AccessRole;
import com.datadog.api.v1.client.model.Organization;
import com.datadog.api.v1.client.model.OrganizationBilling;
import com.datadog.api.v1.client.model.OrganizationResponse;
import com.datadog.api.v1.client.model.OrganizationSettings;
import com.datadog.api.v1.client.model.OrganizationSettingsSaml;
import com.datadog.api.v1.client.model.OrganizationSettingsSamlAutocreateUsersDomains;
import com.datadog.api.v1.client.model.OrganizationSettingsSamlIdpInitiatedLogin;
import com.datadog.api.v1.client.model.OrganizationSettingsSamlStrictMode;
import com.datadog.api.v1.client.model.OrganizationSubscription;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    Organization body =
        new Organization()
            .billing(new OrganizationBilling().type("parent_billing"))
            .description("some description")
            .name("New child org")
            .publicId("abcdef12345")
            .settings(
                new OrganizationSettings()
                    .privateWidgetShare(false)
                    .saml(new OrganizationSettingsSaml().enabled(false))
                    .samlAutocreateAccessRole(AccessRole.STANDARD)
                    .samlAutocreateUsersDomains(
                        new OrganizationSettingsSamlAutocreateUsersDomains()
                            .domains(Collections.singletonList("example.com"))
                            .enabled(false))
                    .samlCanBeEnabled(false)
                    .samlIdpEndpoint("https://my.saml.endpoint")
                    .samlIdpInitiatedLogin(
                        new OrganizationSettingsSamlIdpInitiatedLogin().enabled(false))
                    .samlIdpMetadataUploaded(false)
                    .samlLoginUrl("https://my.saml.login.url")
                    .samlStrictMode(new OrganizationSettingsSamlStrictMode().enabled(false)))
            .subscription(new OrganizationSubscription().type("pro"));

    try {
      OrganizationResponse result = apiInstance.updateOrg("abc123", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#updateOrg");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
