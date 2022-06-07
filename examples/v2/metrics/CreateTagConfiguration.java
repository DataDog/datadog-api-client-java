// Create a tag configuration returns "Created" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.MetricsApi;
import com.datadog.api.v2.client.model.MetricTagConfigurationCreateAttributes;
import com.datadog.api.v2.client.model.MetricTagConfigurationCreateData;
import com.datadog.api.v2.client.model.MetricTagConfigurationCreateRequest;
import com.datadog.api.v2.client.model.MetricTagConfigurationMetricTypes;
import com.datadog.api.v2.client.model.MetricTagConfigurationResponse;
import com.datadog.api.v2.client.model.MetricTagConfigurationType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("createTagConfiguration", true);
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    MetricTagConfigurationCreateRequest body =
        new MetricTagConfigurationCreateRequest()
            .data(
                new MetricTagConfigurationCreateData()
                    .type(MetricTagConfigurationType.MANAGE_TAGS)
                    .id("ExampleCreateatagconfigurationreturnsCreatedresponse")
                    .attributes(
                        new MetricTagConfigurationCreateAttributes()
                            .tags(Arrays.asList("app", "datacenter"))
                            .metricType(MetricTagConfigurationMetricTypes.GAUGE)));

    try {
      MetricTagConfigurationResponse result =
          apiInstance.createTagConfiguration(
              "ExampleCreateatagconfigurationreturnsCreatedresponse", body);
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
