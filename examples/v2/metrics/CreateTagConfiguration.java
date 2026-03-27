// Create a tag configuration returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.MetricTagConfigurationCreateAttributes;
import com.datadog.api.client.v2.model.MetricTagConfigurationCreateData;
import com.datadog.api.client.v2.model.MetricTagConfigurationCreateRequest;
import com.datadog.api.client.v2.model.MetricTagConfigurationMetricTypes;
import com.datadog.api.client.v2.model.MetricTagConfigurationResponse;
import com.datadog.api.client.v2.model.MetricTagConfigurationType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    MetricTagConfigurationCreateRequest body =
        new MetricTagConfigurationCreateRequest()
            .data(
                new MetricTagConfigurationCreateData()
                    .type(MetricTagConfigurationType.MANAGE_TAGS)
                    .id("ExampleMetric")
                    .attributes(
                        new MetricTagConfigurationCreateAttributes()
                            .tags(Arrays.asList("app", "datacenter"))
                            .metricType(MetricTagConfigurationMetricTypes.GAUGE)));

    try {
      MetricTagConfigurationResponse result =
          apiInstance.createTagConfiguration("ExampleMetric", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#createTagConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
