// Create a new rule returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ScorecardsApi;
import com.datadog.api.client.v2.model.CreateRuleRequest;
import com.datadog.api.client.v2.model.CreateRuleRequestData;
import com.datadog.api.client.v2.model.CreateRuleResponse;
import com.datadog.api.client.v2.model.RuleAttributesRequest;
import com.datadog.api.client.v2.model.RuleType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ScorecardsApi apiInstance = new ScorecardsApi(defaultClient);

    CreateRuleRequest body =
        new CreateRuleRequest()
            .data(
                new CreateRuleRequestData()
                    .attributes(
                        new RuleAttributesRequest()
                            .enabled(true)
                            .name("Example-Scorecard")
                            .scorecardName("Observability Best Practices"))
                    .type(RuleType.RULE));

    try {
      CreateRuleResponse result = apiInstance.createScorecardRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScorecardsApi#createScorecardRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
