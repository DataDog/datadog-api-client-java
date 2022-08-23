// Create a log-based metric returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsMetricsApi;
import com.datadog.api.client.v2.model.LogsMetricCompute;
import com.datadog.api.client.v2.model.LogsMetricComputeAggregationType;
import com.datadog.api.client.v2.model.LogsMetricCreateAttributes;
import com.datadog.api.client.v2.model.LogsMetricCreateData;
import com.datadog.api.client.v2.model.LogsMetricCreateRequest;
import com.datadog.api.client.v2.model.LogsMetricResponse;
import com.datadog.api.client.v2.model.LogsMetricType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
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
