// Get a list of metrics returns "Success" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.api.MetricsApi.ListTagConfigurationsOptionalParameters;
import com.datadog.api.client.v2.model.MetricsAndMetricTagConfigurationsResponse;
import com.datadog.api.client.v2.model.MetricsAndMetricTagConfigurations;
import com.datadog.api.client.PaginationIterable;
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
      PaginationIterable<MetricsAndMetricTagConfigurations> iterable = apiInstance.listTagConfigurationsWithPagination(new ListTagConfigurationsOptionalParameters().pageSize(2));

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