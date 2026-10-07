// Enable automatic investigations for a monitor

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.BitsAiApi;
import com.datadog.api.client.v2.model.MonitorAutomationAttributes;
import com.datadog.api.client.v2.model.MonitorAutomationRequest;
import com.datadog.api.client.v2.model.MonitorAutomationRequestData;
import com.datadog.api.client.v2.model.MonitorAutomationResponse;
import com.datadog.api.client.v2.model.MonitorAutomationType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateMonitorAutomation", true);
    BitsAiApi apiInstance = new BitsAiApi(defaultClient);

    // there is a valid "monitor" in the system
    Long MONITOR_ID = Long.parseLong(System.getenv("MONITOR_ID"));

    MonitorAutomationRequest body =
        new MonitorAutomationRequest()
            .data(
                new MonitorAutomationRequestData()
                    .type(MonitorAutomationType.MONITOR_AUTOMATION)
                    .attributes(new MonitorAutomationAttributes().enabled(true)));

    try {
      MonitorAutomationResponse result = apiInstance.updateMonitorAutomation(MONITOR_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BitsAiApi#updateMonitorAutomation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
