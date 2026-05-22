// List entity context sync configurations returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringIntegrationConfigsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listSecurityMonitoringIntegrationConfigs", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    try {
      SecurityMonitoringIntegrationConfigsResponse result =
          apiInstance.listSecurityMonitoringIntegrationConfigs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#listSecurityMonitoringIntegrationConfigs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
