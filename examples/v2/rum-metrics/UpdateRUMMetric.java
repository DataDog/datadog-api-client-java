// Update a RUM-based metric returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumMetricsApi;
import com.datadog.api.client.v2.model.RUMMetricFilter;
import com.datadog.api.client.v2.model.RUMMetricGroupBy;
import com.datadog.api.client.v2.model.RUMMetricResponse;
import com.datadog.api.client.v2.model.RUMMetricType;
import com.datadog.api.client.v2.model.RUMMetricUpdateAttributes;
import com.datadog.api.client.v2.model.RUMMetricUpdateCompute;
import com.datadog.api.client.v2.model.RUMMetricUpdateData;
import com.datadog.api.client.v2.model.RUMMetricUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumMetricsApi apiInstance = new RumMetricsApi(defaultClient);

    // there is a valid "rum_metric" in the system
    String RUM_METRIC_DATA_ID = System.getenv("RUM_METRIC_DATA_ID");

    RUMMetricUpdateRequest body =
        new RUMMetricUpdateRequest()
            .data(
                new RUMMetricUpdateData()
                    .id(RUM_METRIC_DATA_ID)
                    .type(RUMMetricType.RUM_METRICS)
                    .attributes(
                        new RUMMetricUpdateAttributes()
                            .compute(new RUMMetricUpdateCompute().includePercentiles(false))
                            .filter(new RUMMetricFilter().query("@service:rum-config"))
                            .groupBy(
                                Collections.singletonList(
                                    new RUMMetricGroupBy()
                                        .path("@browser.version")
                                        .tagName("browser_version")))));

    try {
      RUMMetricResponse result = apiInstance.updateRUMMetric(RUM_METRIC_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumMetricsApi#updateRUMMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
