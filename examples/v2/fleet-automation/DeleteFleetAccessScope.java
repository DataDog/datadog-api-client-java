// Delete a fleet access scope returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FleetAutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteFleetAccessScope", true);
    FleetAutomationApi apiInstance = new FleetAutomationApi(defaultClient);

    // there is a valid "fleet_access_scope" in the system
    String FLEET_ACCESS_SCOPE_ID = System.getenv("FLEET_ACCESS_SCOPE_ID");

    try {
      apiInstance.deleteFleetAccessScope(FLEET_ACCESS_SCOPE_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling FleetAutomationApi#deleteFleetAccessScope");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
