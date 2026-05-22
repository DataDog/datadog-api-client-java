// Create an entity context sync configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigCreateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigCreateData;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigCreateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigResourceType;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationType;
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
                        new SecurityMonitoringIntegrationConfigCreateAttributes()
                            .domain("siem-test.com")
                            .integrationType(SecurityMonitoringIntegrationType.GOOGLE_WORKSPACE)
                            .name("My GWS Integration")
                            .secrets(Map.ofEntries(Map.entry("admin_email", "test@example.com")))
                            .settings(Map.ofEntries(Map.entry("setting1", "value1"))))
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
