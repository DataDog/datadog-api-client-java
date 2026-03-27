// Get Monthly Cost Attribution returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import com.datadog.api.client.v2.api.UsageMeteringApi.GetMonthlyCostAttributionOptionalParameters;
import com.datadog.api.client.v2.model.MonthlyCostAttributionResponse;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      MonthlyCostAttributionResponse result =
          apiInstance.getMonthlyCostAttribution(
              OffsetDateTime.now().plusDays(-5),
              "infra_host_total_cost",
              new GetMonthlyCostAttributionOptionalParameters()
                  .endMonth(OffsetDateTime.now().plusDays(-3)));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getMonthlyCostAttribution");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
