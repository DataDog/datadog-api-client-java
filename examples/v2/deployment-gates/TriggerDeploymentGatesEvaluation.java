// Trigger a deployment gate evaluation returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DeploymentGatesApi;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationConfiguration;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationRequest;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationRequestAttributes;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationRequestData;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationRequestDataType;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationResponse;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationRule;
import com.datadog.api.client.v2.model.DeploymentGatesMonitorRule;
import com.datadog.api.client.v2.model.DeploymentGatesMonitorRuleOptions;
import com.datadog.api.client.v2.model.DeploymentGatesMonitorRuleType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.triggerDeploymentGatesEvaluation", true);
    DeploymentGatesApi apiInstance = new DeploymentGatesApi(defaultClient);

    DeploymentGatesEvaluationRequest body =
        new DeploymentGatesEvaluationRequest()
            .data(
                new DeploymentGatesEvaluationRequestData()
                    .attributes(
                        new DeploymentGatesEvaluationRequestAttributes()
                            .configuration(
                                new DeploymentGatesEvaluationConfiguration()
                                    .dryRun(false)
                                    .rules(
                                        Collections.singletonList(
                                            new DeploymentGatesEvaluationRule(
                                                new DeploymentGatesMonitorRule()
                                                    .dryRun(false)
                                                    .name("error rate monitors")
                                                    .options(
                                                        new DeploymentGatesMonitorRuleOptions()
                                                            .duration(300L)
                                                            .query(
                                                                "service:transaction-backend"
                                                                    + " env:production"))
                                                    .type(
                                                        DeploymentGatesMonitorRuleType.MONITOR)))))
                            .env("staging")
                            .identifier("pre-deploy")
                            .primaryTag("region:us-east-1")
                            .service("transaction-backend")
                            .version("v1.2.3"))
                    .type(
                        DeploymentGatesEvaluationRequestDataType
                            .DEPLOYMENT_GATES_EVALUATION_REQUEST));

    try {
      DeploymentGatesEvaluationResponse result = apiInstance.triggerDeploymentGatesEvaluation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling DeploymentGatesApi#triggerDeploymentGatesEvaluation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
