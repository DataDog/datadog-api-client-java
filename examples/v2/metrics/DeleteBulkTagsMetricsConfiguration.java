// Delete tags for multiple metrics returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.MetricBulkConfigureTagsType;
import com.datadog.api.client.v2.model.MetricBulkTagConfigDelete;
import com.datadog.api.client.v2.model.MetricBulkTagConfigDeleteAttributes;
import com.datadog.api.client.v2.model.MetricBulkTagConfigDeleteRequest;
import com.datadog.api.client.v2.model.MetricBulkTagConfigResponse;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    MetricBulkTagConfigDeleteRequest body =
        new MetricBulkTagConfigDeleteRequest()
            .data(
                new MetricBulkTagConfigDelete()
                    .attributes(
                        new MetricBulkTagConfigDeleteAttributes()
                            .emails(Arrays.asList("sue@example.com", "bob@example.com")))
                    .id("kafka.lag")
                    .type(MetricBulkConfigureTagsType.BULK_MANAGE_TAGS));

    try {
      MetricBulkTagConfigResponse result = apiInstance.deleteBulkTagsMetricsConfiguration(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#deleteBulkTagsMetricsConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
