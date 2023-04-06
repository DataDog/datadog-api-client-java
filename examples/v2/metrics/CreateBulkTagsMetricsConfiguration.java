// Configure tags for multiple metrics returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.MetricBulkConfigureTagsType;
import com.datadog.api.client.v2.model.MetricBulkTagConfigCreate;
import com.datadog.api.client.v2.model.MetricBulkTagConfigCreateAttributes;
import com.datadog.api.client.v2.model.MetricBulkTagConfigCreateRequest;
import com.datadog.api.client.v2.model.MetricBulkTagConfigResponse;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ATTRIBUTES_EMAIL = System.getenv("USER_DATA_ATTRIBUTES_EMAIL");

    MetricBulkTagConfigCreateRequest body =
        new MetricBulkTagConfigCreateRequest()
            .data(
                new MetricBulkTagConfigCreate()
                    .attributes(
                        new MetricBulkTagConfigCreateAttributes()
                            .emails(Collections.singletonList(USER_DATA_ATTRIBUTES_EMAIL))
                            .tags(Arrays.asList("test", "examplemetric")))
                    .id("system.load.1")
                    .type(MetricBulkConfigureTagsType.BULK_MANAGE_TAGS));

    try {
      MetricBulkTagConfigResponse result = apiInstance.createBulkTagsMetricsConfiguration(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#createBulkTagsMetricsConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
