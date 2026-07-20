// Create a tag indexing rule with exclude-mode tag usage fields returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MetricsApi;
import com.datadog.api.client.v2.model.TagIndexingRuleCreateAttributes;
import com.datadog.api.client.v2.model.TagIndexingRuleCreateData;
import com.datadog.api.client.v2.model.TagIndexingRuleCreateRequest;
import com.datadog.api.client.v2.model.TagIndexingRuleDynamicTags;
import com.datadog.api.client.v2.model.TagIndexingRuleOptions;
import com.datadog.api.client.v2.model.TagIndexingRuleOptionsData;
import com.datadog.api.client.v2.model.TagIndexingRuleResponse;
import com.datadog.api.client.v2.model.TagIndexingRuleType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createTagIndexingRule", true);
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    TagIndexingRuleCreateRequest body =
        new TagIndexingRuleCreateRequest()
            .data(
                new TagIndexingRuleCreateData()
                    .attributes(
                        new TagIndexingRuleCreateAttributes()
                            .excludeTagsMode(true)
                            .metricNameMatches(Collections.singletonList("dd.test.*"))
                            .name("my-indexing-rule")
                            .options(
                                new TagIndexingRuleOptions()
                                    .data(
                                        new TagIndexingRuleOptionsData()
                                            .dynamicTags(
                                                new TagIndexingRuleDynamicTags()
                                                    .excludeNotQueriedWindowSeconds(3600L)
                                                    .excludeNotUsedInAssets(true))
                                            .managePreexistingMetrics(true)
                                            .overridePreviousRules(false))
                                    .version(1L))
                            .tags(Arrays.asList("env", "service")))
                    .type(TagIndexingRuleType.TAG_INDEXING_RULES));

    try {
      TagIndexingRuleResponse result = apiInstance.createTagIndexingRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#createTagIndexingRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
