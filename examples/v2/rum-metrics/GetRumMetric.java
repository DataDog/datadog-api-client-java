// Get a rum-based metric returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.RumMetricsApi;
import com.datadog.api.client.v2.model.RumMetricResponse;
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
    RumMetricsApi apiInstance = new RumMetricsApi(defaultClient);

    // there is a valid "rum_metric" in the system
    String RUM_METRIC_DATA_ID = System.getenv("RUM_METRIC_DATA_ID");

    try {
      RumMetricResponse result = apiInstance.getRumMetric(RUM_METRIC_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumMetricsApi#getRumMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}