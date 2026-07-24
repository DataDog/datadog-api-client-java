// Get the governance console configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GovernanceSettingsApi;
import com.datadog.api.client.v2.model.GovernanceConfigResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getGovernanceConfig", true);
    GovernanceSettingsApi apiInstance = new GovernanceSettingsApi(defaultClient);

    try {
      GovernanceConfigResponse result = apiInstance.getGovernanceConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GovernanceSettingsApi#getGovernanceConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
