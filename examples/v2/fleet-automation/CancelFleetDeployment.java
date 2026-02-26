// Cancel a deployment returns "Deployment successfully canceled." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FleetAutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.cancelFleetDeployment", true);
    FleetAutomationApi apiInstance = new FleetAutomationApi(defaultClient);

    try {
      apiInstance.cancelFleetDeployment("abc-def-ghi");
    } catch (ApiException e) {
      System.err.println("Exception when calling FleetAutomationApi#cancelFleetDeployment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
