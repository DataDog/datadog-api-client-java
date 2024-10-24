// Update a rum-based metric returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumMetricsApi;
import com.datadog.api.client.v2.model.RumMetricFilter;
import com.datadog.api.client.v2.model.RumMetricGroupBy;
import com.datadog.api.client.v2.model.RumMetricResponse;
import com.datadog.api.client.v2.model.RumMetricType;
import com.datadog.api.client.v2.model.RumMetricUpdateAttributes;
import com.datadog.api.client.v2.model.RumMetricUpdateCompute;
import com.datadog.api.client.v2.model.RumMetricUpdateData;
import com.datadog.api.client.v2.model.RumMetricUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumMetricsApi apiInstance = new RumMetricsApi(defaultClient);

    // there is a valid "rum_metric" in the system
    String RUM_METRIC_DATA_ID = System.getenv("RUM_METRIC_DATA_ID");

    RumMetricUpdateRequest body =
        new RumMetricUpdateRequest()
            .data(
                new RumMetricUpdateData()
                    .id(RUM_METRIC_DATA_ID)
                    .type(RumMetricType.RUM_METRICS)
                    .attributes(
                        new RumMetricUpdateAttributes()
                            .compute(new RumMetricUpdateCompute().includePercentiles(false))
                            .filter(new RumMetricFilter().query("@service:rum-config"))
                            .groupBy(
                                Collections.singletonList(
                                    new RumMetricGroupBy()
                                        .path("@browser.version")
                                        .tagName("browser_version")))));

    try {
      RumMetricResponse result = apiInstance.updateRumMetric(RUM_METRIC_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumMetricsApi#updateRumMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
