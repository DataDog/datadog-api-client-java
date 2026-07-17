// Validate entity context sync credentials returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigResourceType;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationCredentialsValidateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationCredentialsValidateData;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationCredentialsValidateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationType;
import java.util.Map;

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
                        new SecurityMonitoringIntegrationCredentialsValidateAttributes()
                            .domain("siem-test.com")
                            .integrationType(SecurityMonitoringIntegrationType.GOOGLE_WORKSPACE)
                            .secrets(Map.ofEntries(Map.entry("admin_email", "test@example.com"))))
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
