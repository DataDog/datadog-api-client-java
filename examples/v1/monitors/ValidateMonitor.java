// Validate a monitor returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.MonitorsApi;
import com.datadog.api.v1.client.model.Monitor;
import com.datadog.api.v1.client.model.MonitorOptions;
import com.datadog.api.v1.client.model.MonitorThresholds;
import com.datadog.api.v1.client.model.MonitorType;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    Monitor body =
        new Monitor()
            .name("Example-Validate_a_monitor_returns_OK_response")
            .type(MonitorType.LOG_ALERT)
            .query(
                """
logs("service:foo AND type:error").index("main").rollup("count").by("source").last("5m") > 2
""")
            .message("some message Notify: @hipchat-channel")
            .tags(
                new ArrayList<String>() {
                  {
                    add("test:examplevalidateamonitorreturnsokresponse");
                    add("env:ci");
                  }
                })
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
      apiInstance.validateMonitor(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
