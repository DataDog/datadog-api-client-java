// Create deployment gate returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DeploymentGatesApi;
import com.datadog.api.client.v2.model.CreateDeploymentGateParams;
import com.datadog.api.client.v2.model.CreateDeploymentGateParamsData;
import com.datadog.api.client.v2.model.CreateDeploymentGateParamsDataAttributes;
import com.datadog.api.client.v2.model.DeploymentGateDataType;
import com.datadog.api.client.v2.model.DeploymentGateResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createDeploymentGate", true);
    DeploymentGatesApi apiInstance = new DeploymentGatesApi(defaultClient);

    CreateDeploymentGateParams body =
        new CreateDeploymentGateParams()
            .data(
                new CreateDeploymentGateParamsData()
                    .attributes(
                        new CreateDeploymentGateParamsDataAttributes()
                            .dryRun(false)
                            .env("production")
                            .identifier("my-gate-1")
                            .service("my-service"))
                    .type(DeploymentGateDataType.DEPLOYMENT_GATE));

    try {
      DeploymentGateResponse result = apiInstance.createDeploymentGate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentGatesApi#createDeploymentGate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
