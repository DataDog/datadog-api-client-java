// Update a span-based metric returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SpansMetricsApi;
import com.datadog.api.client.v2.model.SpansMetricResponse;
import com.datadog.api.client.v2.model.SpansMetricComputeIncludePercentiles;
import com.datadog.api.client.v2.model.SpansMetricFilter;
import com.datadog.api.client.v2.model.SpansMetricGroupBy;
import com.datadog.api.client.v2.model.SpansMetricType;
import com.datadog.api.client.v2.model.SpansMetricUpdateAttributes;
import com.datadog.api.client.v2.model.SpansMetricUpdateCompute;
import com.datadog.api.client.v2.model.SpansMetricUpdateData;
import com.datadog.api.client.v2.model.SpansMetricUpdateRequest;
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

    // there is a valid "spans_metric" in the system
    String SPANS_METRIC_DATA_ATTRIBUTES_FILTER_QUERY = System.getenv("SPANS_METRIC_DATA_ATTRIBUTES_FILTER_QUERY");
    String SPANS_METRIC_DATA_ID = System.getenv("SPANS_METRIC_DATA_ID");

    SpansMetricUpdateRequest body = new SpansMetricUpdateRequest()
.data(new SpansMetricUpdateData()
.attributes(new SpansMetricUpdateAttributes()
.compute(new SpansMetricUpdateCompute()
.includePercentiles(false))
.filter(new SpansMetricFilter()
.query("@http.status_code:200 service:my-service-updated"))
.groupBy(Collections.singletonList(new SpansMetricGroupBy()
.path("resource_name")
.tagName("resource_name"))))
.type(SpansMetricType.SPANS_METRICS));

    try {
      SpansMetricResponse result = apiInstance.updateSpansMetric(SPANS_METRIC_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpansMetricsApi#updateSpansMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}