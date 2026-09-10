// Create monitor deployment rule with monitor IDs returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DeploymentGatesApi;
import com.datadog.api.client.v2.model.CreateDeploymentRuleParams;
import com.datadog.api.client.v2.model.CreateDeploymentRuleParamsData;
import com.datadog.api.client.v2.model.CreateDeploymentRuleParamsDataAttributes;
import com.datadog.api.client.v2.model.DeploymentRuleDataType;
import com.datadog.api.client.v2.model.DeploymentRuleOptionsMonitorId;
import com.datadog.api.client.v2.model.DeploymentRuleOptionsMonitorIds;
import com.datadog.api.client.v2.model.DeploymentRuleResponse;
import com.datadog.api.client.v2.model.DeploymentRulesOptions;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createDeploymentRule", true);
    DeploymentGatesApi apiInstance = new DeploymentGatesApi(defaultClient);

    // there is a valid "deployment_gate" in the system
    String DEPLOYMENT_GATE_DATA_ID = System.getenv("DEPLOYMENT_GATE_DATA_ID");

    // there is a valid "monitor" in the system
    Long MONITOR_ID = Long.parseLong(System.getenv("MONITOR_ID"));

    CreateDeploymentRuleParams body =
        new CreateDeploymentRuleParams()
            .data(
                new CreateDeploymentRuleParamsData()
                    .attributes(
                        new CreateDeploymentRuleParamsDataAttributes()
                            .dryRun(false)
                            .name("Specific monitor deployment rule")
                            .options(
                                new DeploymentRulesOptions(
                                    new DeploymentRuleOptionsMonitorIds()
                                        .monitorIds(
                                            Collections.singletonList(
                                                new DeploymentRuleOptionsMonitorId().id("7")))))
                            .type("monitor"))
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
