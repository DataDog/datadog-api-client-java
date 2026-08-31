// List usage quotas returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import com.datadog.api.client.v2.model.UsageQuotaResponseData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listQuotas", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      PaginationIterable<UsageQuotaResponseData> iterable =
          apiInstance.listQuotasWithPagination("ai_credits");

      for (UsageQuotaResponseData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling UsageMeteringApi#listQuotasWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
