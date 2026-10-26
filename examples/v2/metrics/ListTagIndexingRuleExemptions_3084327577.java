// List tag indexing rule exemptions returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.TagIndexingRuleExemptionData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.listTagIndexingRuleExemptions", true);
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    try {
      PaginationIterable<TagIndexingRuleExemptionData> iterable =
          apiInstance.listTagIndexingRuleExemptionsWithPagination();

      for (TagIndexingRuleExemptionData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling MetricsApi#listTagIndexingRuleExemptionsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
