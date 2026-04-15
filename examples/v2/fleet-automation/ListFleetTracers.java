// List all fleet tracers returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FleetAutomationApi;
import com.datadog.api.client.v2.model.FleetTracersResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listFleetTracers", true);
    FleetAutomationApi apiInstance = new FleetAutomationApi(defaultClient);

    try {
      FleetTracersResponse result = apiInstance.listFleetTracers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FleetAutomationApi#listFleetTracers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
