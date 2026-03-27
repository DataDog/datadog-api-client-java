// Delete deployment rule returns "No Content" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.DeploymentGatesApi;
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
    defaultClient.setUnstableOperationEnabled("v2.deleteDeploymentRule", true);
    DeploymentGatesApi apiInstance = new DeploymentGatesApi(defaultClient);

    // there is a valid "deployment_gate" in the system
    String DEPLOYMENT_GATE_DATA_ID = System.getenv("DEPLOYMENT_GATE_DATA_ID");

    // there is a valid "deployment_rule" in the system
    String DEPLOYMENT_RULE_DATA_ID = System.getenv("DEPLOYMENT_RULE_DATA_ID");

    try {
      apiInstance.deleteDeploymentRule(DEPLOYMENT_GATE_DATA_ID, DEPLOYMENT_RULE_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentGatesApi#deleteDeploymentRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}