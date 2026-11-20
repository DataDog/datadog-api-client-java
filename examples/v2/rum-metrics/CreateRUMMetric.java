// Create a RUM-based metric returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumMetricsApi;
import com.datadog.api.client.v2.model.RUMMetricCompute;
import com.datadog.api.client.v2.model.RUMMetricComputeAggregationType;
import com.datadog.api.client.v2.model.RUMMetricCreateAttributes;
import com.datadog.api.client.v2.model.RUMMetricCreateData;
import com.datadog.api.client.v2.model.RUMMetricCreateRequest;
import com.datadog.api.client.v2.model.RUMMetricEventType;
import com.datadog.api.client.v2.model.RUMMetricFilter;
import com.datadog.api.client.v2.model.RUMMetricGroupBy;
import com.datadog.api.client.v2.model.RUMMetricResponse;
import com.datadog.api.client.v2.model.RUMMetricType;
import com.datadog.api.client.v2.model.RUMMetricUniqueness;
import com.datadog.api.client.v2.model.RUMMetricUniquenessWhen;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumMetricsApi apiInstance = new RumMetricsApi(defaultClient);

    RUMMetricCreateRequest body =
        new RUMMetricCreateRequest()
            .data(
                new RUMMetricCreateData()
                    .attributes(
                        new RUMMetricCreateAttributes()
                            .compute(
                                new RUMMetricCompute()
                                    .aggregationType(RUMMetricComputeAggregationType.DISTRIBUTION)
                                    .includePercentiles(true)
                                    .path("@duration"))
                            .eventType(RUMMetricEventType.SESSION)
                            .filter(new RUMMetricFilter().query("@service:web-ui"))
                            .groupBy(
                                Collections.singletonList(
                                    new RUMMetricGroupBy()
                                        .path("@browser.name")
                                        .tagName("browser_name")))
                            .uniqueness(
                                new RUMMetricUniqueness().when(RUMMetricUniquenessWhen.WHEN_MATCH)))
                    .id("examplerummetric")
                    .type(RUMMetricType.RUM_METRICS));

    try {
      RUMMetricResponse result = apiInstance.createRUMMetric(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumMetricsApi#createRUMMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
