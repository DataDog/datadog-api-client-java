// Get a deployment gates evaluation result returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.DeploymentGatesApi;
import com.datadog.api.client.v2.model.DeploymentGatesEvaluationResultResponse;
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
    defaultClient.setUnstableOperationEnabled("v2.getDeploymentGatesEvaluationResult", true);
    DeploymentGatesApi apiInstance = new DeploymentGatesApi(defaultClient);

    // there is a valid "deployment_gates_evaluation" in the system
    UUID DEPLOYMENT_GATES_EVALUATION_DATA_ID = null;
    try {
      DEPLOYMENT_GATES_EVALUATION_DATA_ID = UUID.fromString(System.getenv("DEPLOYMENT_GATES_EVALUATION_DATA_ID"));
    } catch (IllegalArgumentException e) {
        System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      DeploymentGatesEvaluationResultResponse result = apiInstance.getDeploymentGatesEvaluationResult(DEPLOYMENT_GATES_EVALUATION_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentGatesApi#getDeploymentGatesEvaluationResult");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}