// Update Scorecard outcomes asynchronously returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ScorecardsApi;
import com.datadog.api.client.v2.model.State;
import com.datadog.api.client.v2.model.UpdateOutcomesAsyncAttributes;
import com.datadog.api.client.v2.model.UpdateOutcomesAsyncRequest;
import com.datadog.api.client.v2.model.UpdateOutcomesAsyncRequestData;
import com.datadog.api.client.v2.model.UpdateOutcomesAsyncRequestItem;
import com.datadog.api.client.v2.model.UpdateOutcomesAsyncType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ScorecardsApi apiInstance = new ScorecardsApi(defaultClient);

    // there is a valid "create_scorecard_rule" in the system
    String CREATE_SCORECARD_RULE_DATA_ID = System.getenv("CREATE_SCORECARD_RULE_DATA_ID");

    UpdateOutcomesAsyncRequest body =
        new UpdateOutcomesAsyncRequest()
            .data(
                new UpdateOutcomesAsyncRequestData()
                    .attributes(
                        new UpdateOutcomesAsyncAttributes()
                            .results(
                                Collections.singletonList(
                                    new UpdateOutcomesAsyncRequestItem()
                                        .ruleId(CREATE_SCORECARD_RULE_DATA_ID)
                                        .entityReference("service:my-service")
                                        .remarks(
                                            """
See: <a href="https://app.datadoghq.com/services">Services</a>
""")
                                        .state(State.PASS))))
                    .type(UpdateOutcomesAsyncType.BATCHED_OUTCOME));

    try {
      apiInstance.updateScorecardOutcomes(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScorecardsApi#updateScorecardOutcomes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
