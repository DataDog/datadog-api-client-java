// Get monthly usage by resource supports non-host resources

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import com.datadog.api.client.v2.api.UsageMeteringApi.GetUsageMonthlyResourcesOptionalParameters;
import com.datadog.api.client.v2.model.MonthlyResourcesResponse;
import com.datadog.api.client.v2.model.MonthlyResourcesView;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      MonthlyResourcesResponse result =
          apiInstance.getUsageMonthlyResources(
              "indexed_points",
              "2026-04",
              MonthlyResourcesView.ALL,
              new GetUsageMonthlyResourcesOptionalParameters().pageLimit(1L));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getUsageMonthlyResources");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
