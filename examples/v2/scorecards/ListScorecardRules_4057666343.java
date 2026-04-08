// List all rules returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.ScorecardsApi;
import com.datadog.api.client.v2.api.ScorecardsApi.ListScorecardRulesOptionalParameters;
import com.datadog.api.client.v2.model.ListRulesResponseDataItem;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ScorecardsApi apiInstance = new ScorecardsApi(defaultClient);

    try {
      PaginationIterable<ListRulesResponseDataItem> iterable =
          apiInstance.listScorecardRulesWithPagination(
              new ListScorecardRulesOptionalParameters()
                  .pageSize(2L)
                  .fieldsRule("name")
                  .filterRuleCustom(true));

      for (ListRulesResponseDataItem item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling ScorecardsApi#listScorecardRulesWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
