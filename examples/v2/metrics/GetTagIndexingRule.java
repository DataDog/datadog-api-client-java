// Get a tag indexing rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.TagIndexingRuleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getTagIndexingRule", true);
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    // there is a valid "tag_indexing_rule" in the system
    String TAG_INDEXING_RULE_DATA_ID = System.getenv("TAG_INDEXING_RULE_DATA_ID");

    try {
      TagIndexingRuleResponse result = apiInstance.getTagIndexingRule(TAG_INDEXING_RULE_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#getTagIndexingRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
