// Create a derived metric returns "Created" response

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

    DerivedMetricCreateRequest body =
        new DerivedMetricCreateRequest()
            .data(
                new DerivedMetricCreateData()
                    .attributes(
                        new DerivedMetricAttributes()
                            .definition(
                                new DerivedMetricDefinition()
                                    .formula("a")
                                    .queries(
                                        Collections.singletonList(
                                            new DerivedMetricQuery()
                                                .dataSource("metrics")
                                                .name("a")
                                                .query("avg:system.cpu.user{*}")))))
                    .id("test.derived.examplemetric")
                    .type(DerivedMetricsType.DERIVED_METRICS));

    try {
      DerivedMetricResponse result = apiInstance.createDerivedMetric(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#createDerivedMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
