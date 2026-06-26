// Update governance control notification settings returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GovernanceControlsApi;
import com.datadog.api.client.v2.model.ControlNotificationEventSetting;
import com.datadog.api.client.v2.model.ControlNotificationSettingsResourceType;
import com.datadog.api.client.v2.model.ControlNotificationSettingsResponse;
import com.datadog.api.client.v2.model.ControlNotificationSettingsUpdateAttributes;
import com.datadog.api.client.v2.model.ControlNotificationSettingsUpdateData;
import com.datadog.api.client.v2.model.ControlNotificationSettingsUpdateRequest;
import com.datadog.api.client.v2.model.ControlNotificationTarget;
import com.datadog.api.client.v2.model.ControlNotificationTargetType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.updateGovernanceControlNotificationSettings", true);
    GovernanceControlsApi apiInstance = new GovernanceControlsApi(defaultClient);

    ControlNotificationSettingsUpdateRequest body =
        new ControlNotificationSettingsUpdateRequest()
            .data(
                new ControlNotificationSettingsUpdateData()
                    .attributes(
                        new ControlNotificationSettingsUpdateAttributes()
                            .eventSettings(
                                Collections.singletonList(
                                    new ControlNotificationEventSetting()
                                        .enabled(true)
                                        .eventType("new_detection")
                                        .targets(
                                            Collections.singletonList(
                                                new ControlNotificationTarget()
                                                    .handle("#governance-alerts")
                                                    .type(ControlNotificationTargetType.SLACK))))))
                    .type(ControlNotificationSettingsResourceType.CONTROL_NOTIFICATION_SETTINGS));

    try {
      ControlNotificationSettingsResponse result =
          apiInstance.updateGovernanceControlNotificationSettings("unused_api_keys", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " GovernanceControlsApi#updateGovernanceControlNotificationSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
