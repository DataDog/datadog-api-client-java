// Get hourly usage for analyzed logs returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.UsageMeteringApi;
import com.datadog.api.client.v1.api.UsageMeteringApi.GetUsageAnalyzedLogsOptionalParameters;
import com.datadog.api.client.v1.model.UsageAnalyzedLogsResponse;
import java.time.OffsetDateTime;

public class GetUsageAnalyzedLogs {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      UsageAnalyzedLogsResponse result =
          apiInstance.getUsageAnalyzedLogs(
              OffsetDateTime.now().plusDays(-5),
              new GetUsageAnalyzedLogsOptionalParameters()
                  .endHr(OffsetDateTime.now().plusDays(-3)));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getUsageAnalyzedLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
