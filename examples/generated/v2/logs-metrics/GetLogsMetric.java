import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.LogsMetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsMetricsApi apiInstance = new LogsMetricsApi(defaultClient);
        String metricId = "metricId_example"; // String | The name of the log-based metric.
        try {
            LogsMetricResponse result = apiInstance.getLogsMetric(metricId);
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
