// Update a tag configuration returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.MetricsApi;
import com.datadog.api.v2.client.model.MetricTagConfigurationResponse;
import com.datadog.api.v2.client.model.MetricTagConfigurationType;
import com.datadog.api.v2.client.model.MetricTagConfigurationUpdateAttributes;
import com.datadog.api.v2.client.model.MetricTagConfigurationUpdateData;
import com.datadog.api.v2.client.model.MetricTagConfigurationUpdateRequest;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("updateTagConfiguration", true);
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    // there is a valid "metric_tag_configuration" in the system
    String METRIC_TAG_CONFIGURATION_DATA_ID = System.getenv("METRIC_TAG_CONFIGURATION_DATA_ID");

    MetricTagConfigurationUpdateRequest body =
        new MetricTagConfigurationUpdateRequest()
            .data(
                new MetricTagConfigurationUpdateData()
                    .type(MetricTagConfigurationType.MANAGE_TAGS)
                    .id(METRIC_TAG_CONFIGURATION_DATA_ID)
                    .attributes(
                        new MetricTagConfigurationUpdateAttributes()
                            .tags(Collections.singletonList("app"))));

    try {
      MetricTagConfigurationResponse result =
          apiInstance.updateTagConfiguration(METRIC_TAG_CONFIGURATION_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#updateTagConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
