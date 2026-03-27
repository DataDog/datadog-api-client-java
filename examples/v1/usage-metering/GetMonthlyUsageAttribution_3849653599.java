// Paginate monthly usage attribution
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.UsageMeteringApi;
import com.datadog.api.client.v1.api.UsageMeteringApi.GetMonthlyUsageAttributionOptionalParameters;
import com.datadog.api.client.v1.model.MonthlyUsageAttributionResponse;
import com.datadog.api.client.v1.model.MonthlyUsageAttributionSupportedMetrics;
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
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    // there is a valid "monthly_usage_attribution" response
    String MONTHLY_USAGE_ATTRIBUTION_METADATA_PAGINATION_NEXT_RECORD_ID = System.getenv("MONTHLY_USAGE_ATTRIBUTION_METADATA_PAGINATION_NEXT_RECORD_ID");

    try {
      MonthlyUsageAttributionResponse result = apiInstance.getMonthlyUsageAttribution(OffsetDateTime.now().plusDays(-3), MonthlyUsageAttributionSupportedMetrics.INFRA_HOST_USAGE,new GetMonthlyUsageAttributionOptionalParameters().nextRecordId(MONTHLY_USAGE_ATTRIBUTION_METADATA_PAGINATION_NEXT_RECORD_ID));
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