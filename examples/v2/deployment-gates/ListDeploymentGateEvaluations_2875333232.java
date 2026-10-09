// List deployment gate evaluations returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.DeploymentGatesApi;
import com.datadog.api.client.v2.model.DeploymentGateEvaluationData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.listDeploymentGateEvaluations", true);
    DeploymentGatesApi apiInstance = new DeploymentGatesApi(defaultClient);

    try {
      PaginationIterable<DeploymentGateEvaluationData> iterable =
          apiInstance.listDeploymentGateEvaluationsWithPagination();

      for (DeploymentGateEvaluationData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling DeploymentGatesApi#listDeploymentGateEvaluationsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
