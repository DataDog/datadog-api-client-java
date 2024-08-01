// Update an existing rule returns "Rule updated successfully" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceScorecardsApi;
import com.datadog.api.client.v2.model.RuleAttributes;
import com.datadog.api.client.v2.model.UpdateRuleRequest;
import com.datadog.api.client.v2.model.UpdateRuleRequestData;
import com.datadog.api.client.v2.model.UpdateRuleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateScorecardRule", true);
    ServiceScorecardsApi apiInstance = new ServiceScorecardsApi(defaultClient);

    // there is a valid "create_scorecard_rule" in the system
    String CREATE_SCORECARD_RULE_DATA_ATTRIBUTES_NAME =
        System.getenv("CREATE_SCORECARD_RULE_DATA_ATTRIBUTES_NAME");
    String CREATE_SCORECARD_RULE_DATA_ATTRIBUTES_SCORECARD_NAME =
        System.getenv("CREATE_SCORECARD_RULE_DATA_ATTRIBUTES_SCORECARD_NAME");
    String CREATE_SCORECARD_RULE_DATA_ID = System.getenv("CREATE_SCORECARD_RULE_DATA_ID");

    UpdateRuleRequest body =
        new UpdateRuleRequest()
            .data(
                new UpdateRuleRequestData()
                    .attributes(
                        new RuleAttributes()
                            .enabled(true)
                            .name(CREATE_SCORECARD_RULE_DATA_ATTRIBUTES_NAME)
                            .scorecardName(CREATE_SCORECARD_RULE_DATA_ATTRIBUTES_SCORECARD_NAME)
                            .description("Updated description via test")));

    try {
      UpdateRuleResponse result =
          apiInstance.updateScorecardRule(CREATE_SCORECARD_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceScorecardsApi#updateScorecardRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
