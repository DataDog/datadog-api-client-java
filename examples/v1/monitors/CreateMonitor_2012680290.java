// Create a metric monitor returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.MonitorsApi;
import com.datadog.api.client.v1.model.Monitor;
import com.datadog.api.client.v1.model.MonitorOptions;
import com.datadog.api.client.v1.model.MonitorOptionsSchedulingOptions;
import com.datadog.api.client.v1.model.MonitorOptionsSchedulingOptionsEvaluationWindow;
import com.datadog.api.client.v1.model.MonitorThresholds;
import com.datadog.api.client.v1.model.MonitorType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MonitorsApi apiInstance = new MonitorsApi(defaultClient);

    Monitor body =
        new Monitor()
            .name("Example-Create_a_metric_monitor_returns_OK_response")
            .type(MonitorType.METRIC_ALERT)
            .query("avg(current_1d):avg:system.load.5{*} > 0.5")
            .message("some message Notify: @hipchat-channel")
            .options(
                new MonitorOptions()
                    .thresholds(new MonitorThresholds().critical(0.5))
                    .schedulingOptions(
                        new MonitorOptionsSchedulingOptions()
                            .evaluationWindow(
                                new MonitorOptionsSchedulingOptionsEvaluationWindow()
                                    .dayStarts("04:00")
                                    .monthStarts(1))));

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
