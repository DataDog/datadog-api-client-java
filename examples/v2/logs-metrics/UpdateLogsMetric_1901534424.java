// Update a log-based metric with include_percentiles field returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsMetricsApi;
import com.datadog.api.client.v2.model.LogsMetricResponse;
import com.datadog.api.client.v2.model.LogsMetricType;
import com.datadog.api.client.v2.model.LogsMetricUpdateAttributes;
import com.datadog.api.client.v2.model.LogsMetricUpdateCompute;
import com.datadog.api.client.v2.model.LogsMetricUpdateData;
import com.datadog.api.client.v2.model.LogsMetricUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    LogsMetricsApi apiInstance = new LogsMetricsApi(defaultClient);

    // there is a valid "logs_metric_percentile" in the system
    String LOGS_METRIC_PERCENTILE_DATA_ID = System.getenv("LOGS_METRIC_PERCENTILE_DATA_ID");

    LogsMetricUpdateRequest body =
        new LogsMetricUpdateRequest()
            .data(
                new LogsMetricUpdateData()
                    .type(LogsMetricType.LOGS_METRICS)
                    .attributes(
                        new LogsMetricUpdateAttributes()
                            .compute(new LogsMetricUpdateCompute().includePercentiles(false))));

    try {
      LogsMetricResponse result =
          apiInstance.updateLogsMetric(LOGS_METRIC_PERCENTILE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsMetricsApi#updateLogsMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
