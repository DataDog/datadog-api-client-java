// Get usage attribution returns "OK" response
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.UsageMeteringApi;
import com.datadog.api.client.v1.api.UsageMeteringApi.GetUsageAttributionOptionalParameters;
import com.datadog.api.client.v1.model.UsageAttributionResponse;
import com.datadog.api.client.v1.model.UsageAttributionLimit;
import com.datadog.api.client.v1.model.UsageAttributionOffset;
import com.datadog.api.client.v1.model.UsageAttributionSupportedMetrics;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      UsageAttributionResponse result = apiInstance.getUsageAttribution(OffsetDateTime.now().plusDays(-3), UsageAttributionSupportedMetrics.ALL,new GetUsageAttributionOptionalParameters().offset(0L).limit(1L));
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