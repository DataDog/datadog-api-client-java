// Get a list of metrics returns "Success" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.api.MetricsApi.ListTagConfigurationsOptionalParameters;
import com.datadog.api.client.v2.model.MetricsAndMetricTagConfigurations;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    try {
      PaginationIterable<MetricsAndMetricTagConfigurations> iterable =
          apiInstance.listTagConfigurationsWithPagination(
              new ListTagConfigurationsOptionalParameters().pageSize(2));

      for (MetricsAndMetricTagConfigurations item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling MetricsApi#listTagConfigurationsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
