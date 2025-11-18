// Get deployment rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DeploymentGatesApi;
import com.datadog.api.client.v2.model.DeploymentRuleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getDeploymentRule", true);
    DeploymentGatesApi apiInstance = new DeploymentGatesApi(defaultClient);

    // there is a valid "deployment_gate" in the system
    String DEPLOYMENT_GATE_DATA_ID = System.getenv("DEPLOYMENT_GATE_DATA_ID");

    // there is a valid "deployment_rule" in the system
    String DEPLOYMENT_RULE_DATA_ID = System.getenv("DEPLOYMENT_RULE_DATA_ID");

    try {
      DeploymentRuleResponse result =
          apiInstance.getDeploymentRule(DEPLOYMENT_GATE_DATA_ID, DEPLOYMENT_RULE_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentGatesApi#getDeploymentRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
