// Create a log-based metric returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.LogsMetricsApi;
import com.datadog.api.client.v2.model.LogsMetricResponse;
import com.datadog.api.client.v2.model.LogsMetricCompute;
import com.datadog.api.client.v2.model.LogsMetricComputeAggregationType;
import com.datadog.api.client.v2.model.LogsMetricComputeIncludePercentiles;
import com.datadog.api.client.v2.model.LogsMetricCreateAttributes;
import com.datadog.api.client.v2.model.LogsMetricCreateData;
import com.datadog.api.client.v2.model.LogsMetricCreateRequest;
import com.datadog.api.client.v2.model.LogsMetricType;
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
    LogsMetricsApi apiInstance = new LogsMetricsApi(defaultClient);

    LogsMetricCreateRequest body = new LogsMetricCreateRequest()
.data(new LogsMetricCreateData()
.id("ExampleLogsMetric")
.type(LogsMetricType.LOGS_METRICS)
.attributes(new LogsMetricCreateAttributes()
.compute(new LogsMetricCompute()
.aggregationType(LogsMetricComputeAggregationType.DISTRIBUTION)
.includePercentiles(true)
.path("@duration"))));

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