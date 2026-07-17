// Update an entity context sync configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigResourceType;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigUpdateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationType;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateSecurityMonitoringIntegrationConfig", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringIntegrationConfigUpdateRequest body =
        new SecurityMonitoringIntegrationConfigUpdateRequest()
            .data(
                new SecurityMonitoringIntegrationConfigUpdateData()
                    .attributes(
                        new SecurityMonitoringIntegrationConfigUpdateAttributes()
                            .domain("siem-test.com")
                            .enabled(true)
                            .integrationType(SecurityMonitoringIntegrationType.GOOGLE_WORKSPACE)
                            .name("My GWS Integration (renamed)")
                            .secrets(Map.ofEntries(Map.entry("admin_email", "test@example.com")))
                            .settings(Map.ofEntries(Map.entry("setting1", "value1"))))
                    .type(SecurityMonitoringIntegrationConfigResourceType.INTEGRATION_CONFIG));

    try {
      SecurityMonitoringIntegrationConfigResponse result =
          apiInstance.updateSecurityMonitoringIntegrationConfig("integration_config_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#updateSecurityMonitoringIntegrationConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
