// List tag configuration by name returns "Success" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.MetricsApi;
import com.datadog.api.v2.client.model.MetricTagConfigurationResponse;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("listTagConfigurationByName", true);
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    // there is a valid "metric_tag_configuration" in the system
    String METRIC_TAG_CONFIGURATION_DATA_ID = System.getenv("METRIC_TAG_CONFIGURATION_DATA_ID");

    try {
      MetricTagConfigurationResponse result =
          apiInstance.listTagConfigurationByName(METRIC_TAG_CONFIGURATION_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#listTagConfigurationByName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
