// Edit a monitor returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.MonitorsApi;
import com.datadog.api.v1.client.model.Monitor;
import com.datadog.api.v1.client.model.MonitorOptions;
import com.datadog.api.v1.client.model.MonitorThresholds;
import com.datadog.api.v1.client.model.MonitorUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    // there is a valid "monitor" in the system
    Long MONITOR_ID = Long.parseLong(System.getenv("MONITOR_ID"));
    String MONITOR_NAME = System.getenv("MONITOR_NAME");

    MonitorUpdateRequest body =
        new MonitorUpdateRequest()
            .name("My monitor-updated")
            .options(
                new MonitorOptions()
                    .evaluationDelay(null)
                    .newGroupDelay(600L)
                    .newHostDelay(null)
                    .renotifyInterval(null)
                    .thresholds(new MonitorThresholds().critical(2.0).warning(null))
                    .timeoutH(null));

    try {
      Monitor result = apiInstance.updateMonitor(MONITOR_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#updateMonitor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
