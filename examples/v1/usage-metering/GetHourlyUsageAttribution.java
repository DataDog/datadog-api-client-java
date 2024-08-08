// Get hourly usage attribution returns "OK" response
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.UsageMeteringApi;
import com.datadog.api.client.v1.model.HourlyUsageAttributionResponse;
import com.datadog.api.client.v1.model.HourlyUsageAttributionUsageType;
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

    try {
      HourlyUsageAttributionResponse result = apiInstance.getHourlyUsageAttribution(OffsetDateTime.now().plusDays(-3), HourlyUsageAttributionUsageType.INFRA_HOST_USAGE);
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