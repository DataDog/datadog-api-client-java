// Show Custom Rule returns "Successful response" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.CustomRuleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getCustomRule", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    try {
      CustomRuleResponse result = apiInstance.getCustomRule("ruleset_name", "rule_name");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#getCustomRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
