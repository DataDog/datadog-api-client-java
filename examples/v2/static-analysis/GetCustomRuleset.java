// Show Custom Ruleset returns "Successful response" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.CustomRulesetResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getCustomRuleset", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    try {
      CustomRulesetResponse result = apiInstance.getCustomRuleset("ruleset_name");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#getCustomRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
