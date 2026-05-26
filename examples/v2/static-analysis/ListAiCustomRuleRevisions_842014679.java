// List AI custom rule revisions returns "Successful response" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.AiCustomRuleRevisionResponseData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listAiCustomRuleRevisions", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    try {
      PaginationIterable<AiCustomRuleRevisionResponseData> iterable =
          apiInstance.listAiCustomRuleRevisionsWithPagination("my-ai-ruleset", "my-ai-rule");

      for (AiCustomRuleRevisionResponseData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling StaticAnalysisApi#listAiCustomRuleRevisionsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
