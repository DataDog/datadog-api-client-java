// Get hourly usage attribution returns "OK" response
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.UsageMeteringApi;
import com.datadog.api.v1.client.model.HourlyUsageAttributionResponse;
import com.datadog.api.v1.client.model.HourlyUsageAttributionUsageType;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("getHourlyUsageAttribution", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      HourlyUsageAttributionResponse result =
          apiInstance.getHourlyUsageAttribution(
              OffsetDateTime.now().plusDays(-3), HourlyUsageAttributionUsageType.INFRA_HOST_USAGE);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getHourlyUsageAttribution");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
