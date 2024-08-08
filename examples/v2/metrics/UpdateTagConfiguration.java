// Update a tag configuration returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.MetricTagConfigurationResponse;
import com.datadog.api.client.v2.model.MetricTagConfigurationType;
import com.datadog.api.client.v2.model.MetricTagConfigurationUpdateAttributes;
import com.datadog.api.client.v2.model.MetricTagConfigurationUpdateData;
import com.datadog.api.client.v2.model.MetricTagConfigurationUpdateRequest;
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

    // there is a valid "metric_tag_configuration" in the system
    String METRIC_TAG_CONFIGURATION_DATA_ID = System.getenv("METRIC_TAG_CONFIGURATION_DATA_ID");

    MetricTagConfigurationUpdateRequest body = new MetricTagConfigurationUpdateRequest()
.data(new MetricTagConfigurationUpdateData()
.type(MetricTagConfigurationType.MANAGE_TAGS)
.id(METRIC_TAG_CONFIGURATION_DATA_ID)
.attributes(new MetricTagConfigurationUpdateAttributes()
.tags(Collections.singletonList("app"))));

    try {
      MetricTagConfigurationResponse result = apiInstance.updateTagConfiguration(METRIC_TAG_CONFIGURATION_DATA_ID, body);
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