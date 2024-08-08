// Create a span-based metric returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SpansMetricsApi;
import com.datadog.api.client.v2.model.SpansMetricResponse;
import com.datadog.api.client.v2.model.SpansMetricCompute;
import com.datadog.api.client.v2.model.SpansMetricComputeAggregationType;
import com.datadog.api.client.v2.model.SpansMetricComputeIncludePercentiles;
import com.datadog.api.client.v2.model.SpansMetricCreateAttributes;
import com.datadog.api.client.v2.model.SpansMetricCreateData;
import com.datadog.api.client.v2.model.SpansMetricCreateRequest;
import com.datadog.api.client.v2.model.SpansMetricFilter;
import com.datadog.api.client.v2.model.SpansMetricGroupBy;
import com.datadog.api.client.v2.model.SpansMetricType;
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
    SpansMetricsApi apiInstance = new SpansMetricsApi(defaultClient);

    SpansMetricCreateRequest body = new SpansMetricCreateRequest()
.data(new SpansMetricCreateData()
.attributes(new SpansMetricCreateAttributes()
.compute(new SpansMetricCompute()
.aggregationType(SpansMetricComputeAggregationType.DISTRIBUTION)
.includePercentiles(false)
.path("@duration"))
.filter(new SpansMetricFilter()
.query("@http.status_code:200 service:my-service"))
.groupBy(Collections.singletonList(new SpansMetricGroupBy()
.path("resource_name")
.tagName("resource_name"))))
.id("ExampleSpansMetric")
.type(SpansMetricType.SPANS_METRICS));

    try {
      SpansMetricResponse result = apiInstance.createSpansMetric(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpansMetricsApi#createSpansMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}