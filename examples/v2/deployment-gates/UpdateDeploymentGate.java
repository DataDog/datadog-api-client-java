// Update deployment gate returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DeploymentGatesApi;
import com.datadog.api.client.v2.model.DeploymentGateDataType;
import com.datadog.api.client.v2.model.DeploymentGateResponse;
import com.datadog.api.client.v2.model.UpdateDeploymentGateParams;
import com.datadog.api.client.v2.model.UpdateDeploymentGateParamsData;
import com.datadog.api.client.v2.model.UpdateDeploymentGateParamsDataAttributes;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateDeploymentGate", true);
    DeploymentGatesApi apiInstance = new DeploymentGatesApi(defaultClient);

    // there is a valid "deployment_gate" in the system
    String DEPLOYMENT_GATE_DATA_ID = System.getenv("DEPLOYMENT_GATE_DATA_ID");

    UpdateDeploymentGateParams body =
        new UpdateDeploymentGateParams()
            .data(
                new UpdateDeploymentGateParamsData()
                    .attributes(new UpdateDeploymentGateParamsDataAttributes().dryRun(false))
                    .id("12345678-1234-1234-1234-123456789012")
                    .type(DeploymentGateDataType.DEPLOYMENT_GATE));

    try {
      DeploymentGateResponse result =
          apiInstance.updateDeploymentGate(DEPLOYMENT_GATE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentGatesApi#updateDeploymentGate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
