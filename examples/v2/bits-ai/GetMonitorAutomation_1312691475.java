// Read automatic investigation settings for a new monitor

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.BitsAiApi;
import com.datadog.api.client.v2.model.MonitorAutomationResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getMonitorAutomation", true);
    BitsAiApi apiInstance = new BitsAiApi(defaultClient);

    // there is a valid "monitor" in the system
    Long MONITOR_ID = Long.parseLong(System.getenv("MONITOR_ID"));

    try {
      MonitorAutomationResponse result = apiInstance.getMonitorAutomation(MONITOR_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BitsAiApi#getMonitorAutomation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
