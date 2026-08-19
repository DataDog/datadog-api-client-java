// Get an execution policy returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExecutionPolicyApi;
import com.datadog.api.client.v2.model.ExecutionPolicyResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getExecutionPolicy", true);
    ExecutionPolicyApi apiInstance = new ExecutionPolicyApi(defaultClient);

    // there is a valid "execution_policy" in the system
    String EXECUTION_POLICY_DATA_ID = System.getenv("EXECUTION_POLICY_DATA_ID");

    try {
      ExecutionPolicyResponse result = apiInstance.getExecutionPolicy(EXECUTION_POLICY_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecutionPolicyApi#getExecutionPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
