// Get a monitor configuration policy returns "Created" response

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
                    .attributes(
                        new MetricTagConfigurationCreateAttributes()
                            .includePercentiles(false)
                            .metricType(MetricTagConfigurationMetricTypes.DISTRIBUTION)
                            .tags(Arrays.asList("app", "datacenter")))
                    .id("http.endpoint.request")
                    .type(MetricTagConfigurationType.MANAGE_TAGS));

    try {
      MetricTagConfigurationResponse result =
          apiInstance.createTagConfiguration("metric_name", body);
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
