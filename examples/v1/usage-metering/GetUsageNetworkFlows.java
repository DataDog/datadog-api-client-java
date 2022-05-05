// Get hourly usage for Network Flows returns "OK" response
import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.UsageMeteringApi;
import com.datadog.api.v1.client.api.UsageMeteringApi.GetUsageNetworkFlowsOptionalParameters;
import com.datadog.api.v1.client.model.UsageNetworkFlowsResponse;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      UsageNetworkFlowsResponse result =
          apiInstance.getUsageNetworkFlows(
              OffsetDateTime.now().plusDays(-5),
              new GetUsageNetworkFlowsOptionalParameters()
                  .endHr(OffsetDateTime.now().plusDays(-3)));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getUsageNetworkFlows");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
