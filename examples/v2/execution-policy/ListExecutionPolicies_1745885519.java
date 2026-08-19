// List execution policies with query parameters returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExecutionPolicyApi;
import com.datadog.api.client.v2.api.ExecutionPolicyApi.ListExecutionPoliciesOptionalParameters;
import com.datadog.api.client.v2.model.ExecutionPolicyEffect;
import com.datadog.api.client.v2.model.ExecutionPolicyIntegration;
import com.datadog.api.client.v2.model.ExecutionPolicyListResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listExecutionPolicies", true);
    ExecutionPolicyApi apiInstance = new ExecutionPolicyApi(defaultClient);

    // there is a valid "execution_policy" in the system
    String EXECUTION_POLICY_DATA_ATTRIBUTES_CREATED_BY =
        System.getenv("EXECUTION_POLICY_DATA_ATTRIBUTES_CREATED_BY");
    String EXECUTION_POLICY_DATA_ATTRIBUTES_NAME =
        System.getenv("EXECUTION_POLICY_DATA_ATTRIBUTES_NAME");
    String EXECUTION_POLICY_DATA_ID = System.getenv("EXECUTION_POLICY_DATA_ID");

    try {
      ExecutionPolicyListResponse result =
          apiInstance.listExecutionPolicies(
              new ListExecutionPoliciesOptionalParameters()
                  .pageSize(10)
                  .pageNumber(0)
                  .filterName(EXECUTION_POLICY_DATA_ATTRIBUTES_NAME)
                  .filterIds(Collections.singletonList(EXECUTION_POLICY_DATA_ID))
                  .filterIntegration(
                      Collections.singletonList(ExecutionPolicyIntegration.INTEGRATION_SCRIPT))
                  .filterEffects(Collections.singletonList(ExecutionPolicyEffect.ALLOW))
                  .filterCreatorIds(
                      Collections.singletonList(EXECUTION_POLICY_DATA_ATTRIBUTES_CREATED_BY))
                  .sort(Collections.singletonList("-created_at")));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecutionPolicyApi#listExecutionPolicies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
