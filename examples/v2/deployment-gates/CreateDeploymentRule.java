// Create deployment rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DeploymentGatesApi;
import com.datadog.api.client.v2.model.CreateDeploymentRuleParams;
import com.datadog.api.client.v2.model.CreateDeploymentRuleParamsData;
import com.datadog.api.client.v2.model.CreateDeploymentRuleParamsDataAttributes;
import com.datadog.api.client.v2.model.DeploymentRuleDataType;
import com.datadog.api.client.v2.model.DeploymentRuleOptionsFaultyDeploymentDetection;
import com.datadog.api.client.v2.model.DeploymentRuleResponse;
import com.datadog.api.client.v2.model.DeploymentRulesOptions;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createDeploymentRule", true);
    DeploymentGatesApi apiInstance = new DeploymentGatesApi(defaultClient);

    // there is a valid "deployment_gate" in the system
    String DEPLOYMENT_GATE_DATA_ID = System.getenv("DEPLOYMENT_GATE_DATA_ID");

    CreateDeploymentRuleParams body =
        new CreateDeploymentRuleParams()
            .data(
                new CreateDeploymentRuleParamsData()
                    .attributes(
                        new CreateDeploymentRuleParamsDataAttributes()
                            .dryRun(false)
                            .name("My deployment rule")
                            .options(
                                new DeploymentRulesOptions(
                                    new DeploymentRuleOptionsFaultyDeploymentDetection()))
                            .type("faulty_deployment_detection"))
                    .type(DeploymentRuleDataType.DEPLOYMENT_RULE));

    try {
      DeploymentRuleResponse result =
          apiInstance.createDeploymentRule(DEPLOYMENT_GATE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentGatesApi#createDeploymentRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
