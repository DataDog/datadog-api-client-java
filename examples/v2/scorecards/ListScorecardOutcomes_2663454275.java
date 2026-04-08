// List all rule outcomes returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.ScorecardsApi;
import com.datadog.api.client.v2.api.ScorecardsApi.ListScorecardOutcomesOptionalParameters;
import com.datadog.api.client.v2.model.OutcomesResponseDataItem;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ScorecardsApi apiInstance = new ScorecardsApi(defaultClient);

    try {
      PaginationIterable<OutcomesResponseDataItem> iterable =
          apiInstance.listScorecardOutcomesWithPagination(
              new ListScorecardOutcomesOptionalParameters()
                  .pageSize(2L)
                  .fieldsOutcome("state")
                  .filterOutcomeServiceName("my-service"));

      for (OutcomesResponseDataItem item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling ScorecardsApi#listScorecardOutcomesWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
