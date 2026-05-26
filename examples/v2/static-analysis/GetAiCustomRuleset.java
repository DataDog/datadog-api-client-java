// Get an AI custom ruleset returns "Successful response" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.AiCustomRulesetResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getAiCustomRuleset", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    try {
      AiCustomRulesetResponse result = apiInstance.getAiCustomRuleset("my-ai-ruleset");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#getAiCustomRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
