// Update governance notification settings returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GovernanceSettingsApi;
import com.datadog.api.client.v2.model.GovernanceNotificationSettingsResourceType;
import com.datadog.api.client.v2.model.GovernanceNotificationSettingsResponse;
import com.datadog.api.client.v2.model.GovernanceNotificationSettingsUpdateAttributes;
import com.datadog.api.client.v2.model.GovernanceNotificationSettingsUpdateData;
import com.datadog.api.client.v2.model.GovernanceNotificationSettingsUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateGovernanceNotificationSettings", true);
    GovernanceSettingsApi apiInstance = new GovernanceSettingsApi(defaultClient);

    GovernanceNotificationSettingsUpdateRequest body =
        new GovernanceNotificationSettingsUpdateRequest()
            .data(
                new GovernanceNotificationSettingsUpdateData()
                    .attributes(
                        new GovernanceNotificationSettingsUpdateAttributes()
                            .assignmentNotificationsEnabled(true))
                    .type(
                        GovernanceNotificationSettingsResourceType
                            .GOVERNANCE_NOTIFICATION_SETTINGS));

    try {
      GovernanceNotificationSettingsResponse result =
          apiInstance.updateGovernanceNotificationSettings(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling GovernanceSettingsApi#updateGovernanceNotificationSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
