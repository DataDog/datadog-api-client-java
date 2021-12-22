// Update a log-based metric returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.LogsMetricsApi;
import com.datadog.api.v2.client.model.LogsMetricFilter;
import com.datadog.api.v2.client.model.LogsMetricResponse;
import com.datadog.api.v2.client.model.LogsMetricType;
import com.datadog.api.v2.client.model.LogsMetricUpdateAttributes;
import com.datadog.api.v2.client.model.LogsMetricUpdateData;
import com.datadog.api.v2.client.model.LogsMetricUpdateRequest;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsMetricsApi apiInstance = new LogsMetricsApi(defaultClient);

    // there is a valid "logs_metric" in the system
    String LOGS_METRIC_DATA_ATTRIBUTES_FILTER_QUERY =
        System.getenv("LOGS_METRIC_DATA_ATTRIBUTES_FILTER_QUERY");
    String LOGS_METRIC_DATA_ID = System.getenv("LOGS_METRIC_DATA_ID");

    LogsMetricUpdateRequest body =
        new LogsMetricUpdateRequest()
            .data(
                new LogsMetricUpdateData()
                    .type(LogsMetricType.LOGS_METRICS)
                    .attributes(
                        new LogsMetricUpdateAttributes()
                            .filter(
                                new LogsMetricFilter()
                                    .query(
                                        "service:web* AND @http.status_code:[200 TO"
                                            + " 299]-updated"))));

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
