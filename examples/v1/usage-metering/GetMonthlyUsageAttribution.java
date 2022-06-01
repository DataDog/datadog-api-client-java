// Get monthly usage attribution returns "OK" response
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.UsageMeteringApi;
import com.datadog.api.v1.client.model.MonthlyUsageAttributionResponse;
import com.datadog.api.v1.client.model.MonthlyUsageAttributionSupportedMetrics;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("getMonthlyUsageAttribution", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      MonthlyUsageAttributionResponse result =
          apiInstance.getMonthlyUsageAttribution(
              OffsetDateTime.now().plusDays(-3),
              MonthlyUsageAttributionSupportedMetrics.INFRA_HOST_USAGE);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getMonthlyUsageAttribution");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
