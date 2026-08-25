// Get a tag rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TagRulesApi;
import com.datadog.api.client.v2.model.TagRuleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getTagRule", true);
    TagRulesApi apiInstance = new TagRulesApi(defaultClient);

    try {
      TagRuleResponse result = apiInstance.getTagRule("123");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagRulesApi#getTagRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
