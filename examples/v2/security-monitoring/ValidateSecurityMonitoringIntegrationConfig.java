// Validate an entity context sync configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.validateSecurityMonitoringIntegrationConfig", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    try {
      apiInstance.validateSecurityMonitoringIntegrationConfig("integration_config_id");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#validateSecurityMonitoringIntegrationConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
