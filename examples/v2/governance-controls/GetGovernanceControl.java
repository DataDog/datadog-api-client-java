// Get a governance control returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GovernanceControlsApi;
import com.datadog.api.client.v2.model.GovernanceControlResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getGovernanceControl", true);
    GovernanceControlsApi apiInstance = new GovernanceControlsApi(defaultClient);

    try {
      GovernanceControlResponse result = apiInstance.getGovernanceControl("unused_api_keys");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GovernanceControlsApi#getGovernanceControl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
