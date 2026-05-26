// Create an AI custom rule returns "Successfully created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.AiCustomRuleDataType;
import com.datadog.api.client.v2.model.AiCustomRuleRequest;
import com.datadog.api.client.v2.model.AiCustomRuleRequestAttributes;
import com.datadog.api.client.v2.model.AiCustomRuleRequestData;
import com.datadog.api.client.v2.model.AiCustomRuleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createAiCustomRule", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    AiCustomRuleRequest body =
        new AiCustomRuleRequest()
            .data(
                new AiCustomRuleRequestData()
                    .attributes(new AiCustomRuleRequestAttributes().name("my-ai-rule"))
                    .id("my-ai-rule")
                    .type(AiCustomRuleDataType.AI_RULE));

    try {
      AiCustomRuleResponse result = apiInstance.createAiCustomRule("my-ai-ruleset", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#createAiCustomRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
