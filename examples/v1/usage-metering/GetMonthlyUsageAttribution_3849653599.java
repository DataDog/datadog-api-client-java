<<<<<<< HEAD:examples/v1/usage-metering/GetMonthlyUsageAttribution_3849653599.java
// Paginate monthly usage attribution
||||||| parent of ebb74b06e (Fix examples):examples/v1/usage-metering/GetMonthlyUsageAttribution_3738504447.java
// Paginate Monthly Usage Attribution
=======
// Paginate Monthly Usage Attribution
import com.datadog.api.client.ApiException;
>>>>>>> ebb74b06e (Fix examples):examples/v1/usage-metering/GetMonthlyUsageAttribution_3738504447.java
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.UsageMeteringApi;
import com.datadog.api.v1.client.api.UsageMeteringApi.GetMonthlyUsageAttributionOptionalParameters;
import com.datadog.api.v1.client.model.MonthlyUsageAttributionResponse;
import com.datadog.api.v1.client.model.MonthlyUsageAttributionSupportedMetrics;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    // there is a valid "monthly_usage_attribution" response
    String MONTHLY_USAGE_ATTRIBUTION_METADATA_PAGINATION_NEXT_RECORD_ID =
        System.getenv("MONTHLY_USAGE_ATTRIBUTION_METADATA_PAGINATION_NEXT_RECORD_ID");

    try {
      MonthlyUsageAttributionResponse result =
          apiInstance.getMonthlyUsageAttribution(
              OffsetDateTime.now().plusDays(-3),
              MonthlyUsageAttributionSupportedMetrics.INFRA_HOST_USAGE,
              new GetMonthlyUsageAttributionOptionalParameters()
                  .nextRecordId(MONTHLY_USAGE_ATTRIBUTION_METADATA_PAGINATION_NEXT_RECORD_ID));
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
