// Create a metric monitor with a custom schedule returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.MonitorDraftStatus;
import com.datadog.api.client.v1.model.MonitorOptions;
import com.datadog.api.client.v1.model.MonitorOptionsCustomSchedule;
import com.datadog.api.client.v1.model.MonitorOptionsCustomScheduleRecurrence;
import com.datadog.api.client.v1.model.MonitorOptionsSchedulingOptions;
import com.datadog.api.client.v1.model.MonitorOptionsSchedulingOptionsEvaluationWindow;
import com.datadog.api.client.v1.model.MonitorThresholds;
import com.datadog.api.client.v1.model.MonitorType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    Monitor body = new Monitor()
.message("some message Notify: @hipchat-channel")
.name("Example-Monitor")
.query("avg(current_1mo):avg:system.load.5{*} > 0.5")
.options(new MonitorOptions()
.thresholds(new MonitorThresholds()
.critical(0.5))
.notifyAudit(false)
.includeTags(false)
.schedulingOptions(new MonitorOptionsSchedulingOptions()
.evaluationWindow(new MonitorOptionsSchedulingOptionsEvaluationWindow()
.dayStarts("04:00")
.monthStarts(1))
.customSchedule(new MonitorOptionsCustomSchedule()
.recurrences(Collections.singletonList(new MonitorOptionsCustomScheduleRecurrence()
.rrule("FREQ=DAILY;INTERVAL=1")
.timezone("America/Los_Angeles")
.start("2024-10-26T09:13:00"))))))
.type(MonitorType.QUERY_ALERT)
.draftStatus(MonitorDraftStatus.PUBLISHED);

    try {
      Monitor result = apiInstance.createMonitor(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitorsApi#createMonitor");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}