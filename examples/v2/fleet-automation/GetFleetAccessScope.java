// Get a fleet access scope returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FleetAutomationApi;
import com.datadog.api.client.v2.model.FleetAccessScopeResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getFleetAccessScope", true);
    FleetAutomationApi apiInstance = new FleetAutomationApi(defaultClient);

    // there is a valid "fleet_access_scope" in the system
    String FLEET_ACCESS_SCOPE_ID = System.getenv("FLEET_ACCESS_SCOPE_ID");

    try {
      FleetAccessScopeResponse result = apiInstance.getFleetAccessScope(FLEET_ACCESS_SCOPE_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FleetAutomationApi#getFleetAccessScope");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
