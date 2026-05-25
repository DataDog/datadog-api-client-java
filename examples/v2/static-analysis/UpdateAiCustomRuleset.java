// Update an AI custom ruleset returns "Successfully updated" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.AiCustomRulesetDataType;
import com.datadog.api.client.v2.model.AiCustomRulesetUpdateAttributes;
import com.datadog.api.client.v2.model.AiCustomRulesetUpdateData;
import com.datadog.api.client.v2.model.AiCustomRulesetUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateAiCustomRuleset", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    AiCustomRulesetUpdateRequest body =
        new AiCustomRulesetUpdateRequest()
            .data(
                new AiCustomRulesetUpdateData()
                    .attributes(
                        new AiCustomRulesetUpdateAttributes()
                            .description("Ruleset description")
                            .name("my-ai-ruleset")
                            .shortDescription("Ruleset short description"))
                    .id("my-ai-ruleset")
                    .type(AiCustomRulesetDataType.AI_RULESET));

    try {
      apiInstance.updateAiCustomRuleset("my-ai-ruleset", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#updateAiCustomRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
