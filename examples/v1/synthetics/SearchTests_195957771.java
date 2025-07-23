// Search Synthetic tests with boolean query parameters

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.api.SyntheticsApi.SearchTestsOptionalParameters;
import com.datadog.api.client.v1.model.SyntheticsListTestsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    try {
      SyntheticsListTestsResponse result =
          apiInstance.searchTests(
              new SearchTestsOptionalParameters()
                  .text("tag:value")
                  .includeFullConfig(true)
                  .searchSuites(true)
                  .facetsOnly(true)
                  .start(10L)
                  .count(5L)
                  .sort("name,desc"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#searchTests");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
