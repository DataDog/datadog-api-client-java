// Tag Configuration Cardinality Estimator returns "Success" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.api.MetricsApi.EstimateMetricsOutputSeriesOptionalParameters;
import com.datadog.api.client.v2.model.MetricEstimateResponse;
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
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    try {
      MetricEstimateResponse result = apiInstance.estimateMetricsOutputSeries("system.cpu.idle",new EstimateMetricsOutputSeriesOptionalParameters().filterGroups("app,host").filterNumAggregations(4));
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