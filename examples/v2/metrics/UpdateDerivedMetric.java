// Update a derived metric returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.DerivedMetricAttributes;
import com.datadog.api.client.v2.model.DerivedMetricCreateData;
import com.datadog.api.client.v2.model.DerivedMetricCreateRequest;
import com.datadog.api.client.v2.model.DerivedMetricDefinition;
import com.datadog.api.client.v2.model.DerivedMetricQuery;
import com.datadog.api.client.v2.model.DerivedMetricResponse;
import com.datadog.api.client.v2.model.DerivedMetricsType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    // there is a valid "derived_metric" in the system
    String DERIVED_METRIC_DATA_ID = System.getenv("DERIVED_METRIC_DATA_ID");

    DerivedMetricCreateRequest body =
        new DerivedMetricCreateRequest()
            .data(
                new DerivedMetricCreateData()
                    .attributes(
                        new DerivedMetricAttributes()
                            .definition(
                                new DerivedMetricDefinition()
                                    .formula("a * 2")
                                    .queries(
                                        Collections.singletonList(
                                            new DerivedMetricQuery()
                                                .dataSource("metrics")
                                                .name("a")
                                                .query("avg:system.cpu.user{*}")))))
                    .id(DERIVED_METRIC_DATA_ID)
                    .type(DerivedMetricsType.DERIVED_METRICS));

    try {
      DerivedMetricResponse result = apiInstance.updateDerivedMetric(DERIVED_METRIC_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#updateDerivedMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
