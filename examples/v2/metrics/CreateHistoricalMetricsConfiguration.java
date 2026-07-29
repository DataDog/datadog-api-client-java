// Enable historical metrics ingestion returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.HistoricalMetricsConfigurationCreateData;
import com.datadog.api.client.v2.model.HistoricalMetricsConfigurationCreateRequest;
import com.datadog.api.client.v2.model.HistoricalMetricsConfigurationResponse;
import com.datadog.api.client.v2.model.HistoricalMetricsConfigurationType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createHistoricalMetricsConfiguration", true);
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    HistoricalMetricsConfigurationCreateRequest body =
        new HistoricalMetricsConfigurationCreateRequest()
            .data(
                new HistoricalMetricsConfigurationCreateData()
                    .id("dd.test.metric")
                    .type(HistoricalMetricsConfigurationType.HISTORICAL_METRICS_CONFIGURATIONS));

    try {
      HistoricalMetricsConfigurationResponse result =
          apiInstance.createHistoricalMetricsConfiguration(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#createHistoricalMetricsConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
