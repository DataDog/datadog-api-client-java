// Get hourly usage for Sensitive Data Scanner returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.UsageMeteringApi;
import com.datadog.api.client.v1.api.UsageMeteringApi.GetUsageSDSOptionalParameters;
import com.datadog.api.client.v1.model.UsageSDSResponse;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      UsageSDSResponse result =
          apiInstance.getUsageSDS(
              OffsetDateTime.now().plusDays(-5),
              new GetUsageSDSOptionalParameters().endHr(OffsetDateTime.now().plusDays(-3)));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getUsageSDS");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
