// Create outcomes batch returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ServiceScorecardsApi;
import com.datadog.api.client.v2.model.OutcomesBatchResponse;
import com.datadog.api.client.v2.model.OutcomesBatchAttributes;
import com.datadog.api.client.v2.model.OutcomesBatchRequest;
import com.datadog.api.client.v2.model.OutcomesBatchRequestData;
import com.datadog.api.client.v2.model.OutcomesBatchRequestItem;
import com.datadog.api.client.v2.model.OutcomesBatchType;
import com.datadog.api.client.v2.model.State;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createScorecardOutcomesBatch", true);
    ServiceScorecardsApi apiInstance = new ServiceScorecardsApi(defaultClient);

    // there is a valid "create_scorecard_rule" in the system
    String CREATE_SCORECARD_RULE_DATA_ID = System.getenv("CREATE_SCORECARD_RULE_DATA_ID");

    OutcomesBatchRequest body = new OutcomesBatchRequest()
.data(new OutcomesBatchRequestData()
.attributes(new OutcomesBatchAttributes()
.results(Collections.singletonList(new OutcomesBatchRequestItem()
.remarks("""
See: <a href="https://app.datadoghq.com/services">Services</a>
""")
.ruleId(CREATE_SCORECARD_RULE_DATA_ID)
.serviceName("my-service")
.state(State.PASS))))
.type(OutcomesBatchType.BATCHED_OUTCOME));

    try {
      OutcomesBatchResponse result = apiInstance.createScorecardOutcomesBatch(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceScorecardsApi#createScorecardOutcomesBatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}