// Delete a security filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "security_filter" in the system
    String SECURITY_FILTER_DATA_ID = System.getenv("SECURITY_FILTER_DATA_ID");

    try {
      apiInstance.deleteSecurityFilter(SECURITY_FILTER_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#deleteSecurityFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
