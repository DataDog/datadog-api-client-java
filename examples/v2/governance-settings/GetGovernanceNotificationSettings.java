// Get governance notification settings returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GovernanceSettingsApi;
import com.datadog.api.client.v2.model.GovernanceNotificationSettingsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getGovernanceNotificationSettings", true);
    GovernanceSettingsApi apiInstance = new GovernanceSettingsApi(defaultClient);

    try {
      GovernanceNotificationSettingsResponse result =
          apiInstance.getGovernanceNotificationSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling GovernanceSettingsApi#getGovernanceNotificationSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
