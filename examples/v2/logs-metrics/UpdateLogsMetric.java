// Update a log-based metric returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.LogsMetricsApi;
import com.datadog.api.client.v2.model.LogsMetricResponse;
import com.datadog.api.client.v2.model.LogsMetricFilter;
import com.datadog.api.client.v2.model.LogsMetricType;
import com.datadog.api.client.v2.model.LogsMetricUpdateAttributes;
import com.datadog.api.client.v2.model.LogsMetricUpdateData;
import com.datadog.api.client.v2.model.LogsMetricUpdateRequest;
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

    // there is a valid "logs_metric" in the system
    String LOGS_METRIC_DATA_ATTRIBUTES_FILTER_QUERY = System.getenv("LOGS_METRIC_DATA_ATTRIBUTES_FILTER_QUERY");
    String LOGS_METRIC_DATA_ID = System.getenv("LOGS_METRIC_DATA_ID");

    LogsMetricUpdateRequest body = new LogsMetricUpdateRequest()
.data(new LogsMetricUpdateData()
.type(LogsMetricType.LOGS_METRICS)
.attributes(new LogsMetricUpdateAttributes()
.filter(new LogsMetricFilter()
.query("service:web* AND @http.status_code:[200 TO 299]-updated"))));

    try {
      LogsMetricResponse result = apiInstance.updateLogsMetric(LOGS_METRIC_DATA_ID, body);
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