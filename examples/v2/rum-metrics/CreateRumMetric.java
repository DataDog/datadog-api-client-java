// Create a rum-based metric returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumMetricsApi;
import com.datadog.api.client.v2.model.RumMetricCompute;
import com.datadog.api.client.v2.model.RumMetricComputeAggregationType;
import com.datadog.api.client.v2.model.RumMetricCreateAttributes;
import com.datadog.api.client.v2.model.RumMetricCreateData;
import com.datadog.api.client.v2.model.RumMetricCreateRequest;
import com.datadog.api.client.v2.model.RumMetricEventType;
import com.datadog.api.client.v2.model.RumMetricFilter;
import com.datadog.api.client.v2.model.RumMetricGroupBy;
import com.datadog.api.client.v2.model.RumMetricResponse;
import com.datadog.api.client.v2.model.RumMetricType;
import com.datadog.api.client.v2.model.RumMetricUniqueness;
import com.datadog.api.client.v2.model.RumMetricUniquenessWhen;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumMetricsApi apiInstance = new RumMetricsApi(defaultClient);

    RumMetricCreateRequest body =
        new RumMetricCreateRequest()
            .data(
                new RumMetricCreateData()
                    .attributes(
                        new RumMetricCreateAttributes()
                            .compute(
                                new RumMetricCompute()
                                    .aggregationType(RumMetricComputeAggregationType.DISTRIBUTION)
                                    .includePercentiles(true)
                                    .path("@duration"))
                            .eventType(RumMetricEventType.SESSION)
                            .filter(new RumMetricFilter().query("@service:web-ui"))
                            .groupBy(
                                Collections.singletonList(
                                    new RumMetricGroupBy()
                                        .path("@browser.name")
                                        .tagName("browser_name")))
                            .uniqueness(
                                new RumMetricUniqueness().when(RumMetricUniquenessWhen.WHEN_MATCH)))
                    .id("examplerummetric")
                    .type(RumMetricType.RUM_METRICS));

    try {
      RumMetricResponse result = apiInstance.createRumMetric(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumMetricsApi#createRumMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
