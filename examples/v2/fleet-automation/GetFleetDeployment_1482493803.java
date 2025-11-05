// Get a deployment by ID returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FleetAutomationApi;
import com.datadog.api.client.v2.model.FleetDeploymentResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getFleetDeployment", true);
    FleetAutomationApi apiInstance = new FleetAutomationApi(defaultClient);

    // there is a valid "deployment" in the system
    String DEPLOYMENT_ID = System.getenv("DEPLOYMENT_ID");

    try {
      FleetDeploymentResponse result = apiInstance.getFleetDeployment(DEPLOYMENT_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FleetAutomationApi#getFleetDeployment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
