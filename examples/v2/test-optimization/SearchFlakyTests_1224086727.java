// Search flaky tests returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.TestOptimizationApi;
import com.datadog.api.client.v2.api.TestOptimizationApi.SearchFlakyTestsOptionalParameters;
import com.datadog.api.client.v2.model.FlakyTest;
import com.datadog.api.client.v2.model.FlakyTestsSearchFilter;
import com.datadog.api.client.v2.model.FlakyTestsSearchPageOptions;
import com.datadog.api.client.v2.model.FlakyTestsSearchRequest;
import com.datadog.api.client.v2.model.FlakyTestsSearchRequestAttributes;
import com.datadog.api.client.v2.model.FlakyTestsSearchRequestData;
import com.datadog.api.client.v2.model.FlakyTestsSearchRequestDataType;
import com.datadog.api.client.v2.model.FlakyTestsSearchSort;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.searchFlakyTests", true);
    TestOptimizationApi apiInstance = new TestOptimizationApi(defaultClient);

    FlakyTestsSearchRequest body =
        new FlakyTestsSearchRequest()
            .data(
                new FlakyTestsSearchRequestData()
                    .attributes(
                        new FlakyTestsSearchRequestAttributes()
                            .filter(
                                new FlakyTestsSearchFilter()
                                    .query(
                                        """
flaky_test_state:active @git.repository.id_v2:"github.com/datadog/shopist"
"""))
                            .includeHistory(true)
                            .page(
                                new FlakyTestsSearchPageOptions()
                                    .cursor(
                                        "eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ==")
                                    .limit(25L))
                            .sort(FlakyTestsSearchSort.FAILURE_RATE_ASCENDING))
                    .type(FlakyTestsSearchRequestDataType.SEARCH_FLAKY_TESTS_REQUEST));

    try {
      PaginationIterable<FlakyTest> iterable =
          apiInstance.searchFlakyTestsWithPagination(
              new SearchFlakyTestsOptionalParameters().body(body));

      for (FlakyTest item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling TestOptimizationApi#searchFlakyTestsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
