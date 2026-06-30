// Reorder tag indexing rules returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.TagIndexingRuleOrderAttributes;
import com.datadog.api.client.v2.model.TagIndexingRuleOrderData;
import com.datadog.api.client.v2.model.TagIndexingRuleOrderRequest;
import com.datadog.api.client.v2.model.TagIndexingRuleType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.reorderTagIndexingRules", true);
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    // there is a valid "tag_indexing_rule" in the system
    String TAG_INDEXING_RULE_DATA_ID = System.getenv("TAG_INDEXING_RULE_DATA_ID");

    TagIndexingRuleOrderRequest body =
        new TagIndexingRuleOrderRequest()
            .data(
                new TagIndexingRuleOrderData()
                    .attributes(
                        new TagIndexingRuleOrderAttributes()
                            .ruleIds(Collections.singletonList(TAG_INDEXING_RULE_DATA_ID)))
                    .type(TagIndexingRuleType.TAG_INDEXING_RULES));

    try {
      apiInstance.reorderTagIndexingRules(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#reorderTagIndexingRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
