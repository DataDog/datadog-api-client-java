// Validate an existing monitor returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.MonitorOptions;
import com.datadog.api.client.v1.model.MonitorThresholds;
import com.datadog.api.client.v1.model.MonitorType;
import com.datadog.api.client.v1.model.OnMissingDataOption;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
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
                    .onMissingData(OnMissingDataOption.SHOW_AND_NOTIFY_NO_DATA)
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
