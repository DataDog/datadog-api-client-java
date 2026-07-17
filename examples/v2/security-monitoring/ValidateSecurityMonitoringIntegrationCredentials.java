// Validate entity context sync credentials returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigGoogleWorkspaceServiceAccount;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigResourceType;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationCredentialsValidateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationCredentialsValidateData;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationCredentialsValidateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationTypeGoogleWorkspace;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.validateSecurityMonitoringIntegrationCredentials", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringIntegrationCredentialsValidateRequest body =
        new SecurityMonitoringIntegrationCredentialsValidateRequest()
            .data(
                new SecurityMonitoringIntegrationCredentialsValidateData()
                    .attributes(
                        new SecurityMonitoringIntegrationCredentialsValidateAttributes(
                            new SecurityMonitoringGoogleWorkspaceIntegrationCredentialsValidateAttributes()
                                .domain("siem-test.com")
                                .integrationType(
                                    SecurityMonitoringIntegrationTypeGoogleWorkspace
                                        .GOOGLE_WORKSPACE)
                                .secrets(
                                    new SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets()
                                        .adminEmail("admin@example.com")
                                        .serviceAccountJson(
                                            new SecurityMonitoringIntegrationConfigGoogleWorkspaceServiceAccount()
                                                .clientEmail(
                                                    "svc@my-project.iam.gserviceaccount.com")
                                                .privateKey(
                                                    """
-----BEGIN PRIVATE KEY-----
...
-----END PRIVATE KEY-----
""")
                                                .projectId("my-project")
                                                .type("service_account")))))
                    .type(SecurityMonitoringIntegrationConfigResourceType.INTEGRATION_CONFIG));

    try {
      apiInstance.validateSecurityMonitoringIntegrationCredentials(body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#validateSecurityMonitoringIntegrationCredentials");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
