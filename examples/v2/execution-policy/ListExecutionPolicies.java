// List execution policies returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExecutionPolicyApi;
import com.datadog.api.client.v2.model.ExecutionPolicyListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listExecutionPolicies", true);
    ExecutionPolicyApi apiInstance = new ExecutionPolicyApi(defaultClient);

    try {
      ExecutionPolicyListResponse result = apiInstance.listExecutionPolicies();
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
