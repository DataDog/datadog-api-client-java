// Get usage attribution returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.UsageMeteringApi;
import com.datadog.api.client.v1.api.UsageMeteringApi.GetUsageAttributionOptionalParameters;
import com.datadog.api.client.v1.model.UsageAttributionResponse;
import com.datadog.api.client.v1.model.UsageAttributionSupportedMetrics;
import java.time.OffsetDateTime;

public class GetUsageAttribution {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("getUsageAttribution", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      UsageAttributionResponse result =
          apiInstance.getUsageAttribution(
              OffsetDateTime.now().plusDays(-3),
              UsageAttributionSupportedMetrics.ALL,
              new GetUsageAttributionOptionalParameters().offset(0L).limit(1L));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getUsageAttribution");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
