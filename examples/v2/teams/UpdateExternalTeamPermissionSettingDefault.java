// Update an external team permission default returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.ExternalTeamPermissionSettingDefaultResponse;
import com.datadog.api.client.v2.model.ExternalTeamPermissionSettingDefaultUpdateAttributes;
import com.datadog.api.client.v2.model.ExternalTeamPermissionSettingDefaultUpdateData;
import com.datadog.api.client.v2.model.ExternalTeamPermissionSettingDefaultUpdateRequest;
import com.datadog.api.client.v2.model.ExternalTeamPermissionSettingDefaultsSource;
import com.datadog.api.client.v2.model.ExternalTeamPermissionSettingDefaultsType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    ExternalTeamPermissionSettingDefaultUpdateRequest body =
        new ExternalTeamPermissionSettingDefaultUpdateRequest()
            .data(
                new ExternalTeamPermissionSettingDefaultUpdateData()
                    .attributes(
                        new ExternalTeamPermissionSettingDefaultUpdateAttributes()
                            .value("user_access_manage"))
                    .id("scim:add_and_remove_subteam")
                    .type(
                        ExternalTeamPermissionSettingDefaultsType
                            .EXTERNAL_TEAM_PERMISSION_SETTING_DEFAULTS));

    try {
      ExternalTeamPermissionSettingDefaultResponse result =
          apiInstance.updateExternalTeamPermissionSettingDefault(
              ExternalTeamPermissionSettingDefaultsSource.SCIM, "add_and_remove_subteam", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling TeamsApi#updateExternalTeamPermissionSettingDefault");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
