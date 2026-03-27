// Update your organization returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.OrganizationsApi;
import com.datadog.api.client.v1.model.OrganizationResponse;
import com.datadog.api.client.v1.model.AccessRole;
import com.datadog.api.client.v1.model.Organization;
import com.datadog.api.client.v1.model.OrganizationBilling;
import com.datadog.api.client.v1.model.OrganizationSettings;
import com.datadog.api.client.v1.model.OrganizationSettingsSaml;
import com.datadog.api.client.v1.model.OrganizationSettingsSamlAutocreateUsersDomains;
import com.datadog.api.client.v1.model.OrganizationSettingsSamlIdpInitiatedLogin;
import com.datadog.api.client.v1.model.OrganizationSettingsSamlStrictMode;
import com.datadog.api.client.v1.model.OrganizationSubscription;
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
    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);

    Organization body = new Organization()
.billing(new OrganizationBilling()
.type("parent_billing"))
.description("some description")
.name("New child org")
.publicId("abcdef12345")
.settings(new OrganizationSettings()
.privateWidgetShare(false)
.saml(new OrganizationSettingsSaml()
.enabled(false))
.samlAutocreateAccessRole(AccessRole.READ_ONLY)
.samlAutocreateUsersDomains(new OrganizationSettingsSamlAutocreateUsersDomains()
.domains(Collections.singletonList("example.com"))
.enabled(false))
.samlCanBeEnabled(false)
.samlIdpEndpoint("https://my.saml.endpoint")
.samlIdpInitiatedLogin(new OrganizationSettingsSamlIdpInitiatedLogin()
.enabled(false))
.samlIdpMetadataUploaded(false)
.samlLoginUrl("https://my.saml.login.url")
.samlStrictMode(new OrganizationSettingsSamlStrictMode()
.enabled(false)))
.subscription(new OrganizationSubscription()
.type("pro"))
.trial(false);

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