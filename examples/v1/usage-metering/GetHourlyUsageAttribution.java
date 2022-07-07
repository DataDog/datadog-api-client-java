// Get hourly usage attribution returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.UsageMeteringApi;
import com.datadog.api.client.v1.model.HourlyUsageAttributionResponse;
import com.datadog.api.client.v1.model.HourlyUsageAttributionUsageType;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v1.getHourlyUsageAttribution", true);
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
