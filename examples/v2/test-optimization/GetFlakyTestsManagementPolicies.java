// Get Flaky Tests Management policies returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TestOptimizationApi;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesGetRequest;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesGetRequestAttributes;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesGetRequestData;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesResponse;
import com.datadog.api.client.v2.model.TestOptimizationGetFlakyTestsManagementPoliciesRequestDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TestOptimizationApi apiInstance = new TestOptimizationApi(defaultClient);

    TestOptimizationFlakyTestsManagementPoliciesGetRequest body =
        new TestOptimizationFlakyTestsManagementPoliciesGetRequest()
            .data(
                new TestOptimizationFlakyTestsManagementPoliciesGetRequestData()
                    .attributes(
                        new TestOptimizationFlakyTestsManagementPoliciesGetRequestAttributes()
                            .repositoryId("github.com/datadog/shopist"))
                    .type(
                        TestOptimizationGetFlakyTestsManagementPoliciesRequestDataType
                            .TEST_OPTIMIZATION_GET_FLAKY_TESTS_MANAGEMENT_POLICIES_REQUEST));

    try {
      TestOptimizationFlakyTestsManagementPoliciesResponse result =
          apiInstance.getFlakyTestsManagementPolicies(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling TestOptimizationApi#getFlakyTestsManagementPolicies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
