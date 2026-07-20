// Update a tag indexing rule with exclude-mode tag usage fields returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.TagIndexingRuleDynamicTags;
import com.datadog.api.client.v2.model.TagIndexingRuleOptions;
import com.datadog.api.client.v2.model.TagIndexingRuleOptionsData;
import com.datadog.api.client.v2.model.TagIndexingRuleResponse;
import com.datadog.api.client.v2.model.TagIndexingRuleType;
import com.datadog.api.client.v2.model.TagIndexingRuleUpdateAttributes;
import com.datadog.api.client.v2.model.TagIndexingRuleUpdateData;
import com.datadog.api.client.v2.model.TagIndexingRuleUpdateRequest;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateTagIndexingRule", true);
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    // there is a valid "tag_indexing_rule_exclude_mode" in the system
    String TAG_INDEXING_RULE_EXCLUDE_MODE_DATA_ID =
        System.getenv("TAG_INDEXING_RULE_EXCLUDE_MODE_DATA_ID");

    TagIndexingRuleUpdateRequest body =
        new TagIndexingRuleUpdateRequest()
            .data(
                new TagIndexingRuleUpdateData()
                    .attributes(
                        new TagIndexingRuleUpdateAttributes()
                            .excludeTagsMode(true)
                            .metricNameMatches(Collections.singletonList("dd.test.*"))
                            .name("my-indexing-rule")
                            .options(
                                new TagIndexingRuleOptions()
                                    .data(
                                        new TagIndexingRuleOptionsData()
                                            .dynamicTags(
                                                new TagIndexingRuleDynamicTags()
                                                    .excludeNotQueriedWindowSeconds(7200L)
                                                    .excludeNotUsedInAssets(true))
                                            .managePreexistingMetrics(true)
                                            .overridePreviousRules(false))
                                    .version(1L))
                            .ruleOrder(2L)
                            .tags(Arrays.asList("env", "service")))
                    .type(TagIndexingRuleType.TAG_INDEXING_RULES));

    try {
      TagIndexingRuleResponse result =
          apiInstance.updateTagIndexingRule(TAG_INDEXING_RULE_EXCLUDE_MODE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#updateTagIndexingRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
