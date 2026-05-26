// List AI custom rule revisions returns "Successful response" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.AiCustomRuleRevisionsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listAiCustomRuleRevisions", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    try {
      AiCustomRuleRevisionsResponse result =
          apiInstance.listAiCustomRuleRevisions("my-ai-ruleset", "my-ai-rule");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#listAiCustomRuleRevisions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
