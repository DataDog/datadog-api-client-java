// List all metrics with volumes and query activity for top metrics by indexed volume returns
// "Success" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.api.MetricsApi.ListTagConfigurationsOptionalParameters;
import com.datadog.api.client.v2.model.MetricsAndMetricTagConfigurationsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    try {
      MetricsAndMetricTagConfigurationsResponse result =
          apiInstance.listTagConfigurations(
              new ListTagConfigurationsOptionalParameters()
                  .include("metric_volumes")
                  .sort("-metric_volumes.indexed_volume")
                  .pageSize(20));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#listTagConfigurations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
