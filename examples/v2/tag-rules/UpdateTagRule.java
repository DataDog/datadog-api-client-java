// Update a tag rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TagRulesApi;
import com.datadog.api.client.v2.model.TagRuleResourceType;
import com.datadog.api.client.v2.model.TagRuleResponse;
import com.datadog.api.client.v2.model.TagRuleType;
import com.datadog.api.client.v2.model.TagRuleUpdateAttributes;
import com.datadog.api.client.v2.model.TagRuleUpdateData;
import com.datadog.api.client.v2.model.TagRuleUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateTagRule", true);
    TagRulesApi apiInstance = new TagRulesApi(defaultClient);

    TagRuleUpdateRequest body =
        new TagRuleUpdateRequest()
            .data(
                new TagRuleUpdateData()
                    .attributes(new TagRuleUpdateAttributes().ruleType(TagRuleType.SURFACING))
                    .id("123")
                    .type(TagRuleResourceType.TAG_RULE));

    try {
      TagRuleResponse result = apiInstance.updateTagRule("123", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagRulesApi#updateTagRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
