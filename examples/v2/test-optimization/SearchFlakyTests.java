// Search flaky tests returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.TestOptimizationApi;
import com.datadog.api.client.v2.api.TestOptimizationApi.SearchFlakyTestsOptionalParameters;
import com.datadog.api.client.v2.model.FlakyTestsSearchResponse;
import com.datadog.api.client.v2.model.FlakyTestsSearchFilter;
import com.datadog.api.client.v2.model.FlakyTestsSearchPageOptions;
import com.datadog.api.client.v2.model.FlakyTestsSearchRequest;
import com.datadog.api.client.v2.model.FlakyTestsSearchRequestAttributes;
import com.datadog.api.client.v2.model.FlakyTestsSearchRequestData;
import com.datadog.api.client.v2.model.FlakyTestsSearchRequestDataType;
import com.datadog.api.client.v2.model.FlakyTestsSearchSort;
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
    defaultClient.setUnstableOperationEnabled("v2.searchFlakyTests", true);
    TestOptimizationApi apiInstance = new TestOptimizationApi(defaultClient);

    FlakyTestsSearchRequest body = new FlakyTestsSearchRequest()
.data(new FlakyTestsSearchRequestData()
.attributes(new FlakyTestsSearchRequestAttributes()
.filter(new FlakyTestsSearchFilter()
.query("""
flaky_test_state:active @git.repository.id_v2:"github.com/datadog/shopist"
"""))
.includeHistory(true)
.page(new FlakyTestsSearchPageOptions()
.cursor("eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ==")
.limit(25L))
.sort(FlakyTestsSearchSort.FAILURE_RATE_ASCENDING))
.type(FlakyTestsSearchRequestDataType.SEARCH_FLAKY_TESTS_REQUEST));

    try {
      FlakyTestsSearchResponse result = apiInstance.searchFlakyTests(new SearchFlakyTestsOptionalParameters().body(body));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestOptimizationApi#searchFlakyTests");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}