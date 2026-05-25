// Create an AI custom ruleset returns "Successfully created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.AiCustomRulesetDataType;
import com.datadog.api.client.v2.model.AiCustomRulesetRequest;
import com.datadog.api.client.v2.model.AiCustomRulesetRequestAttributes;
import com.datadog.api.client.v2.model.AiCustomRulesetRequestData;
import com.datadog.api.client.v2.model.AiCustomRulesetResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createAiCustomRuleset", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    AiCustomRulesetRequest body =
        new AiCustomRulesetRequest()
            .data(
                new AiCustomRulesetRequestData()
                    .attributes(
                        new AiCustomRulesetRequestAttributes()
                            .description("Ruleset description")
                            .name("my-ai-ruleset")
                            .shortDescription("Ruleset short description"))
                    .id("my-ai-ruleset")
                    .type(AiCustomRulesetDataType.AI_RULESET));

    try {
      AiCustomRulesetResponse result = apiInstance.createAiCustomRuleset(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#createAiCustomRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
