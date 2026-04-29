// Update Flaky Tests Management policies returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TestOptimizationApi;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesAttemptToFix;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesAutoQuarantineRule;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesBranchRule;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesDisabled;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesDisabledStatus;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesQuarantined;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesQuarantinedFailureRateRule;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesResponse;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesUpdateRequest;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes;
import com.datadog.api.client.v2.model.TestOptimizationFlakyTestsManagementPoliciesUpdateRequestData;
import com.datadog.api.client.v2.model.TestOptimizationUpdateFlakyTestsManagementPoliciesRequestDataType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TestOptimizationApi apiInstance = new TestOptimizationApi(defaultClient);

    TestOptimizationFlakyTestsManagementPoliciesUpdateRequest body =
        new TestOptimizationFlakyTestsManagementPoliciesUpdateRequest()
            .data(
                new TestOptimizationFlakyTestsManagementPoliciesUpdateRequestData()
                    .attributes(
                        new TestOptimizationFlakyTestsManagementPoliciesUpdateRequestAttributes()
                            .attemptToFix(
                                new TestOptimizationFlakyTestsManagementPoliciesAttemptToFix()
                                    .retries(3L))
                            .disabled(
                                new TestOptimizationFlakyTestsManagementPoliciesDisabled()
                                    .autoDisableRule(
                                        new TestOptimizationFlakyTestsManagementPoliciesAutoDisableRule()
                                            .enabled(false)
                                            .status(
                                                TestOptimizationFlakyTestsManagementPoliciesDisabledStatus
                                                    .ACTIVE)
                                            .windowSeconds(3600L))
                                    .branchRule(
                                        new TestOptimizationFlakyTestsManagementPoliciesBranchRule()
                                            .branches(Collections.singletonList("main"))
                                            .enabled(true))
                                    .enabled(false)
                                    .failureRateRule(
                                        new TestOptimizationFlakyTestsManagementPoliciesDisabledFailureRateRule()
                                            .enabled(false)
                                            .minRuns(10L)
                                            .status(
                                                TestOptimizationFlakyTestsManagementPoliciesDisabledStatus
                                                    .ACTIVE)
                                            .threshold(0.5)))
                            .quarantined(
                                new TestOptimizationFlakyTestsManagementPoliciesQuarantined()
                                    .autoQuarantineRule(
                                        new TestOptimizationFlakyTestsManagementPoliciesAutoQuarantineRule()
                                            .enabled(true)
                                            .windowSeconds(3600L))
                                    .branchRule(
                                        new TestOptimizationFlakyTestsManagementPoliciesBranchRule()
                                            .branches(Collections.singletonList("main"))
                                            .enabled(true))
                                    .enabled(true)
                                    .failureRateRule(
                                        new TestOptimizationFlakyTestsManagementPoliciesQuarantinedFailureRateRule()
                                            .branches(Collections.singletonList("main"))
                                            .enabled(true)
                                            .minRuns(10L)
                                            .threshold(0.5)))
                            .repositoryId("github.com/datadog/shopist"))
                    .type(
                        TestOptimizationUpdateFlakyTestsManagementPoliciesRequestDataType
                            .TEST_OPTIMIZATION_UPDATE_FLAKY_TESTS_MANAGEMENT_POLICIES_REQUEST));

    try {
      TestOptimizationFlakyTestsManagementPoliciesResponse result =
          apiInstance.updateFlakyTestsManagementPolicies(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling TestOptimizationApi#updateFlakyTestsManagementPolicies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
