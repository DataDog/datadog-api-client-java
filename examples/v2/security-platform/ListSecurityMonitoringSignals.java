// Get a quick list of security signals returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.SecurityPlatformApi;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalsListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SecurityPlatformApi apiInstance = new SecurityPlatformApi(defaultClient);

    try {
      SecurityMonitoringSignalsListResponse result = apiInstance.listSecurityMonitoringSignals();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityPlatformApi#listSecurityMonitoringSignals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
