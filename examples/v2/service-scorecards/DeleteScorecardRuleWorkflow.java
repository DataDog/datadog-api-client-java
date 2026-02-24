// Delete rule workflow returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceScorecardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteScorecardRuleWorkflow", true);
    ServiceScorecardsApi apiInstance = new ServiceScorecardsApi(defaultClient);

    try {
      apiInstance.deleteScorecardRuleWorkflow("rule_id");
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceScorecardsApi#deleteScorecardRuleWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
