import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.MetricsApi;
import com.datadog.api.v2.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    Boolean filterConfigured = true; // Boolean | Filter metrics that have configured tags.
    String filterTagsConfigured = "app"; // String | Filter tag configurations by configured tags.
    MetricTagConfigurationMetricTypes filterMetricType =
        MetricTagConfigurationMetricTypes.fromValue(
            "gauge"); // MetricTagConfigurationMetricTypes | Filter tag configurations by metric
    // type.
    Boolean filterIncludePercentiles =
        true; // Boolean | Filter distributions with additional percentile aggregations enabled or
    // disabled.
    String filterTags =
        "env IN (staging,test) AND service:web"; // String | Filter metrics that have been submitted
    // with the given tags. Supports boolean and
    // wildcard expressions. Cannot be combined with
    // other filters.
    Long windowSeconds =
        3600L; // Long | The number of seconds of look back (from now) to apply to a filter[tag]
    // query. Defaults value is 3600 (1 hour), maximum value is 172,800 (2 days).
    try {
      MetricsAndMetricTagConfigurationsResponse result =
          apiInstance.listTagConfigurations(
              new MetricsApi.ListTagConfigurationsOptionalParameters()
                  .filterConfigured(filterConfigured)
                  .filterTagsConfigured(filterTagsConfigured)
                  .filterMetricType(filterMetricType)
                  .filterIncludePercentiles(filterIncludePercentiles)
                  .filterTags(filterTags)
                  .windowSeconds(windowSeconds));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#listTagConfigurations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
