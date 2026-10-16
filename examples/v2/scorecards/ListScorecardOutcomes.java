// List all rule outcomes returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ScorecardsApi;
import com.datadog.api.client.v2.api.ScorecardsApi.ListScorecardOutcomesOptionalParameters;
import com.datadog.api.client.v2.model.OutcomesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ScorecardsApi apiInstance = new ScorecardsApi(defaultClient);

    try {
      OutcomesResponse result =
          apiInstance.listScorecardOutcomes(
              new ListScorecardOutcomesOptionalParameters()
                  .filterRuleId("00000000-0000-0000-0000-000000000000"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScorecardsApi#listScorecardOutcomes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
