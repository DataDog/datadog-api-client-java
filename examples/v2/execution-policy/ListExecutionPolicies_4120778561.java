// List execution policies filtered by Slack returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExecutionPolicyApi;
import com.datadog.api.client.v2.api.ExecutionPolicyApi.ListExecutionPoliciesOptionalParameters;
import com.datadog.api.client.v2.model.ExecutionPolicyIntegration;
import com.datadog.api.client.v2.model.ExecutionPolicyListResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.listExecutionPolicies", true);
    ExecutionPolicyApi apiInstance = new ExecutionPolicyApi(defaultClient);

    try {
      ExecutionPolicyListResponse result =
          apiInstance.listExecutionPolicies(
              new ListExecutionPoliciesOptionalParameters()
                  .filterIntegration(
                      Collections.singletonList(ExecutionPolicyIntegration.INTEGRATION_SLACK)));
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
