// Delete an execution policy returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExecutionPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteExecutionPolicy", true);
    ExecutionPolicyApi apiInstance = new ExecutionPolicyApi(defaultClient);

    // there is a valid "execution_policy" in the system
    String EXECUTION_POLICY_DATA_ID = System.getenv("EXECUTION_POLICY_DATA_ID");

    try {
      apiInstance.deleteExecutionPolicy(EXECUTION_POLICY_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExecutionPolicyApi#deleteExecutionPolicy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
