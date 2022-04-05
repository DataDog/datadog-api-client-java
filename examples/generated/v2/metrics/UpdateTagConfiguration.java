import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "dist.http.endpoint.request"; // String | The name of the metric.
        MetricTagConfigurationUpdateRequest body = new MetricTagConfigurationUpdateRequest(); // MetricTagConfigurationUpdateRequest |
        try {
            MetricTagConfigurationResponse result = apiInstance.updateTagConfiguration(metricName, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#updateTagConfiguration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
