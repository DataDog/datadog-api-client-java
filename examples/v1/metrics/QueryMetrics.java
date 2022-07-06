// Query timeseries points returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.MetricsApi;
import com.datadog.api.client.v1.model.MetricsQueryResponse;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    try {
      MetricsQueryResponse result =
          apiInstance.queryMetrics(
              OffsetDateTime.now().plusDays(-1).toInstant().getEpochSecond(),
              OffsetDateTime.now().toInstant().getEpochSecond(),
              "system.cpu.idle{*}");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#queryMetrics");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
