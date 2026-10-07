// Update monitor automatic investigation settings returns "OK" response

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

    MonitorAutomationRequest body =
        new MonitorAutomationRequest()
            .data(
                new MonitorAutomationRequestData()
                    .attributes(new MonitorAutomationAttributes().enabled(true))
                    .type(MonitorAutomationType.MONITOR_AUTOMATION));

    try {
      MonitorAutomationResponse result =
          apiInstance.updateMonitorAutomation(9223372036854775807L, body);
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
