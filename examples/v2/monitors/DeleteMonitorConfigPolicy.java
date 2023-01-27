// Delete a monitor configuration policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MonitorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    // there is a valid "monitor_configuration_policy" in the system
    String MONITOR_CONFIGURATION_POLICY_DATA_ID =
        System.getenv("MONITOR_CONFIGURATION_POLICY_DATA_ID");

    try {
      apiInstance.deleteMonitorConfigPolicy(MONITOR_CONFIGURATION_POLICY_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#deleteMonitorConfigPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
