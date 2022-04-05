import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.MetricsApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    Long from = 56L; // Long | Seconds since the Unix epoch.
    String host =
        "host_example"; // String | Hostname for filtering the list of metrics returned. If set,
    // metrics retrieved are those with the corresponding hostname tag.
    String tagFilter =
        "env IN (staging,test) AND service:web"; // String | Filter metrics that have been submitted
    // with the given tags. Supports boolean and
    // wildcard expressions. Cannot be combined with
    // other filters.
    try {
      MetricsListResponse result =
          apiInstance.listActiveMetrics(
              from,
              new MetricsApi.ListActiveMetricsOptionalParameters().host(host).tagFilter(tagFilter));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#listActiveMetrics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
