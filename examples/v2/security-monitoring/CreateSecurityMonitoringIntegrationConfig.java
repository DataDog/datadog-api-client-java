// Create an entity context sync configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigCreateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigCreateData;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigCreateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigGoogleWorkspaceSecrets;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigGoogleWorkspaceServiceAccount;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigResourceType;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationTypeGoogleWorkspace;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createSecurityMonitoringIntegrationConfig", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringIntegrationConfigCreateRequest body =
        new SecurityMonitoringIntegrationConfigCreateRequest()
            .data(
                new SecurityMonitoringIntegrationConfigCreateData()
                    .attributes(
                        new SecurityMonitoringIntegrationConfigCreateAttributes(
                            new SecurityMonitoringGoogleWorkspaceIntegrationConfigCreateAttributes()
                                .domain("siem-test.com")
                                .integrationType(
                                    SecurityMonitoringIntegrationTypeGoogleWorkspace
                                        .GOOGLE_WORKSPACE)
                                .name("My GWS Integration")
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
                                                .type("service_account")))
                                .settings(Map.ofEntries(Map.entry("setting1", "value1")))))
                    .type(SecurityMonitoringIntegrationConfigResourceType.INTEGRATION_CONFIG));

    try {
      SecurityMonitoringIntegrationConfigResponse result =
          apiInstance.createSecurityMonitoringIntegrationConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#createSecurityMonitoringIntegrationConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
