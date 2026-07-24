// List governance limits returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GovernanceSettingsApi;
import com.datadog.api.client.v2.model.GovernanceLimitsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listGovernanceLimits", true);
    GovernanceSettingsApi apiInstance = new GovernanceSettingsApi(defaultClient);

    try {
      GovernanceLimitsResponse result = apiInstance.listGovernanceLimits();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GovernanceSettingsApi#listGovernanceLimits");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
