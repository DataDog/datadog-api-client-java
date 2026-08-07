// Get a tag rule compliance score returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TagRulesApi;
import com.datadog.api.client.v2.model.TagRuleScoreResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getTagRuleScore", true);
    TagRulesApi apiInstance = new TagRulesApi(defaultClient);

    try {
      TagRuleScoreResponse result = apiInstance.getTagRuleScore("123");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagRulesApi#getTagRuleScore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
