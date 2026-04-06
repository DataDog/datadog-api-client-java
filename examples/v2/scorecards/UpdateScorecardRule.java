// Update an existing scorecard rule returns "Rule updated successfully" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ScorecardsApi;
import com.datadog.api.client.v2.model.RuleAttributesRequest;
import com.datadog.api.client.v2.model.RuleType;
import com.datadog.api.client.v2.model.UpdateRuleRequest;
import com.datadog.api.client.v2.model.UpdateRuleRequestData;
import com.datadog.api.client.v2.model.UpdateRuleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ScorecardsApi apiInstance = new ScorecardsApi(defaultClient);

    UpdateRuleRequest body =
        new UpdateRuleRequest()
            .data(
                new UpdateRuleRequestData()
                    .attributes(
                        new RuleAttributesRequest()
                            .enabled(true)
                            .level(2)
                            .name("Team Defined")
                            .scopeQuery("kind:service")
                            .scorecardName("Deployments automated via Deployment Trains"))
                    .type(RuleType.RULE));

    try {
      UpdateRuleResponse result = apiInstance.updateScorecardRule("rule_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScorecardsApi#updateScorecardRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
