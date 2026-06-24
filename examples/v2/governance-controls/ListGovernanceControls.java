// List governance controls returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GovernanceControlsApi;
import com.datadog.api.client.v2.model.GovernanceControlsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listGovernanceControls", true);
    GovernanceControlsApi apiInstance = new GovernanceControlsApi(defaultClient);

    try {
      GovernanceControlsResponse result = apiInstance.listGovernanceControls();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GovernanceControlsApi#listGovernanceControls");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
