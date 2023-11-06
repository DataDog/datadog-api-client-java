// Create a new rule returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceScorecardsApi;
import com.datadog.api.client.v2.model.CreateRuleRequest;
import com.datadog.api.client.v2.model.CreateRuleRequestData;
import com.datadog.api.client.v2.model.CreateRuleResponse;
import com.datadog.api.client.v2.model.RuleAttributes;
import com.datadog.api.client.v2.model.RuleType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createScorecardRule", true);
    ServiceScorecardsApi apiInstance = new ServiceScorecardsApi(defaultClient);

    CreateRuleRequest body =
        new CreateRuleRequest()
            .data(
                new CreateRuleRequestData()
                    .attributes(
                        new RuleAttributes()
                            .enabled(true)
                            .name("Example-Service-Scorecard")
                            .scorecardName("Observability Best Practices"))
                    .type(RuleType.RULE));

    try {
      CreateRuleResponse result = apiInstance.createScorecardRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceScorecardsApi#createScorecardRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
