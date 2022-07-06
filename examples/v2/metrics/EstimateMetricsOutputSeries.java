// Tag Configuration Cardinality Estimator returns "Success" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.MetricsApi;
import com.datadog.api.v2.client.api.MetricsApi.EstimateMetricsOutputSeriesOptionalParameters;
import com.datadog.api.v2.client.model.MetricEstimateResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    try {
      MetricEstimateResponse result =
          apiInstance.estimateMetricsOutputSeries(
              "system.cpu.idle",
              new EstimateMetricsOutputSeriesOptionalParameters()
                  .filterGroups("app,host")
                  .filterNumAggregations(4));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#estimateMetricsOutputSeries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
