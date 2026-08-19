// Create a tag rule returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TagRulesApi;
import com.datadog.api.client.v2.model.TagRuleCreateAttributes;
import com.datadog.api.client.v2.model.TagRuleCreateData;
import com.datadog.api.client.v2.model.TagRuleCreateRequest;
import com.datadog.api.client.v2.model.TagRuleCreateType;
import com.datadog.api.client.v2.model.TagRuleResourceType;
import com.datadog.api.client.v2.model.TagRuleResponse;
import com.datadog.api.client.v2.model.TagRuleSource;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createTagRule", true);
    TagRulesApi apiInstance = new TagRulesApi(defaultClient);

    TagRuleCreateRequest body =
        new TagRuleCreateRequest()
            .data(
                new TagRuleCreateData()
                    .attributes(
                        new TagRuleCreateAttributes()
                            .enabled(true)
                            .name("Service tag must be one of api or web")
                            .negated(false)
                            .required(true)
                            .ruleType(TagRuleCreateType.SURFACING)
                            .scope("env")
                            .source(TagRuleSource.LOGS)
                            .tagKey("service")
                            .tagValuePatterns(Arrays.asList("api", "web")))
                    .type(TagRuleResourceType.TAG_RULE));

    try {
      TagRuleResponse result = apiInstance.createTagRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagRulesApi#createTagRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
