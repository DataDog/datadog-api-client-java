// Validate an existing monitor returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.MonitorsApi;
import com.datadog.api.v1.client.model.Monitor;
import com.datadog.api.v1.client.model.MonitorOptions;
import com.datadog.api.v1.client.model.MonitorThresholds;
import com.datadog.api.v1.client.model.MonitorType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    // there is a valid "monitor" in the system
    Long MONITOR_ID = Long.parseLong(System.getenv("MONITOR_ID"));

    Monitor body =
        new Monitor()
            .name("Example-Validate_an_existing_monitor_returns_OK_response")
            .type(MonitorType.LOG_ALERT)
            .query(
                """
logs("service:foo AND type:error").index("main").rollup("count").by("source").last("5m") > 2
""")
            .message("some message Notify: @hipchat-channel")
            .tags(Arrays.asList("test:examplevalidateanexistingmonitorreturnsokresponse", "env:ci"))
            .priority(3L)
            .options(
                new MonitorOptions()
                    .enableLogsSample(true)
                    .escalationMessage("the situation has escalated")
                    .evaluationDelay(700L)
                    .groupbySimpleMonitor(true)
                    .includeTags(true)
                    .locked(false)
                    .newHostDelay(600L)
                    .noDataTimeframe(null)
                    .notifyAudit(false)
                    .notifyNoData(false)
                    .renotifyInterval(60L)
                    .requireFullWindow(true)
                    .timeoutH(24L)
                    .thresholds(new MonitorThresholds().critical(2.0).warning(1.0)));

    try {
      apiInstance.validateExistingMonitor(MONITOR_ID, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#validateExistingMonitor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
