// Update deployment rule returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.DeploymentGatesApi;
import com.datadog.api.client.v2.model.DeploymentRuleResponse;
import com.datadog.api.client.v2.model.DeploymentRuleDataType;
import com.datadog.api.client.v2.model.DeploymentRuleOptionsFaultyDeploymentDetection;
import com.datadog.api.client.v2.model.DeploymentRulesOptions;
import com.datadog.api.client.v2.model.UpdateDeploymentRuleParams;
import com.datadog.api.client.v2.model.UpdateDeploymentRuleParamsData;
import com.datadog.api.client.v2.model.UpdateDeploymentRuleParamsDataAttributes;
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
    defaultClient.setUnstableOperationEnabled("v2.updateDeploymentRule", true);
    DeploymentGatesApi apiInstance = new DeploymentGatesApi(defaultClient);

    // there is a valid "deployment_gate" in the system
    String DEPLOYMENT_GATE_DATA_ID = System.getenv("DEPLOYMENT_GATE_DATA_ID");

    // there is a valid "deployment_rule" in the system
    String DEPLOYMENT_RULE_DATA_ID = System.getenv("DEPLOYMENT_RULE_DATA_ID");

    UpdateDeploymentRuleParams body = new UpdateDeploymentRuleParams()
.data(new UpdateDeploymentRuleParamsData()
.attributes(new UpdateDeploymentRuleParamsDataAttributes()
.dryRun(false)
.name("Updated deployment rule")
.options(new DeploymentRulesOptions(
new DeploymentRuleOptionsFaultyDeploymentDetection())))
.type(DeploymentRuleDataType.DEPLOYMENT_RULE));

    try {
      DeploymentRuleResponse result = apiInstance.updateDeploymentRule(DEPLOYMENT_GATE_DATA_ID, DEPLOYMENT_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentGatesApi#updateDeploymentRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}