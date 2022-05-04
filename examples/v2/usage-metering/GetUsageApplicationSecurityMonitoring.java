// Get hourly usage for Application Security returns "OK" response
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.UsageMeteringApi;
import com.datadog.api.v2.client.api.UsageMeteringApi.GetUsageApplicationSecurityMonitoringOptionalParameters;
import com.datadog.api.v2.client.model.UsageApplicationSecurityMonitoringResponse;
import java.time.*;
import java.time.OffsetDateTime;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      UsageApplicationSecurityMonitoringResponse result =
          apiInstance.getUsageApplicationSecurityMonitoring(
              OffsetDateTime.now().plusDays(-5),
              new GetUsageApplicationSecurityMonitoringOptionalParameters()
                  .endHr(OffsetDateTime.now().plusDays(-3)));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling UsageMeteringApi#getUsageApplicationSecurityMonitoring");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
