// Trigger a deployment gates evaluation returns "Accepted" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.DeploymentGatesApi;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationResponse;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationRequest;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationRequestAttributes;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationRequestData;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationRequestDataType;
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
    defaultClient.setUnstableOperationEnabled("v2.triggerDeploymentGatesEvaluation", true);
    DeploymentGatesApi apiInstance = new DeploymentGatesApi(defaultClient);

    // there is a valid "deployment_gate" in the system
    String DEPLOYMENT_GATE_DATA_ATTRIBUTES_IDENTIFIER = System.getenv("DEPLOYMENT_GATE_DATA_ATTRIBUTES_IDENTIFIER");

    DeploymentGatesEvaluationRequest body = new DeploymentGatesEvaluationRequest()
.data(new DeploymentGatesEvaluationRequestData()
.attributes(new DeploymentGatesEvaluationRequestAttributes()
.env("production")
.identifier(DEPLOYMENT_GATE_DATA_ATTRIBUTES_IDENTIFIER)
.service("my-service"))
.type(DeploymentGatesEvaluationRequestDataType.DEPLOYMENT_GATES_EVALUATION_REQUEST));

    try {
      DeploymentGatesEvaluationResponse result = apiInstance.triggerDeploymentGatesEvaluation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentGatesApi#triggerDeploymentGatesEvaluation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}