// Create a log-based metric returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.LogsMetricsApi;
import com.datadog.api.v2.client.model.LogsMetricCompute;
import com.datadog.api.v2.client.model.LogsMetricComputeAggregationType;
import com.datadog.api.v2.client.model.LogsMetricCreateAttributes;
import com.datadog.api.v2.client.model.LogsMetricCreateData;
import com.datadog.api.v2.client.model.LogsMetricCreateRequest;
import com.datadog.api.v2.client.model.LogsMetricResponse;
import com.datadog.api.v2.client.model.LogsMetricType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsMetricsApi apiInstance = new LogsMetricsApi(defaultClient);

    LogsMetricCreateRequest body =
        new LogsMetricCreateRequest()
            .data(
                new LogsMetricCreateData()
                    .id("Example-Create_a_log_based_metric_returns_OK_response")
                    .type(LogsMetricType.LOGS_METRICS)
                    .attributes(
                        new LogsMetricCreateAttributes()
                            .compute(
                                new LogsMetricCompute()
                                    .aggregationType(LogsMetricComputeAggregationType.COUNT))));

    try {
      LogsMetricResponse result = apiInstance.createLogsMetric(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsMetricsApi#createLogsMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
