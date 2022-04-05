import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        MetricsPayload body = new MetricsPayload(); // MetricsPayload |
        MetricContentEncoding contentEncoding = MetricContentEncoding.fromValue("deflate"); // MetricContentEncoding | HTTP header used to compress the media-type.
        try {
            IntakePayloadAccepted result = apiInstance.submitMetrics(body, new MetricsApi.SubmitMetricsOptionalParameters()
                .contentEncoding(contentEncoding));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#submitMetrics");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
