// Get a log-based metric returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsMetricsApi;
import com.datadog.api.client.v2.model.LogsMetricResponse;

public class GetLogsMetric {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    LogsMetricsApi apiInstance = new LogsMetricsApi(defaultClient);

    // there is a valid "logs_metric" in the system
    String LOGS_METRIC_DATA_ID = System.getenv("LOGS_METRIC_DATA_ID");

    try {
      LogsMetricResponse result = apiInstance.getLogsMetric(LOGS_METRIC_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsMetricsApi#getLogsMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
