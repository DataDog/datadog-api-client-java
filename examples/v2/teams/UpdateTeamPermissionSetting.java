// Update permission setting for team returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.TeamPermissionSettingResponse;
import com.datadog.api.client.v2.model.TeamPermissionSettingType;
import com.datadog.api.client.v2.model.TeamPermissionSettingUpdate;
import com.datadog.api.client.v2.model.TeamPermissionSettingUpdateAttributes;
import com.datadog.api.client.v2.model.TeamPermissionSettingUpdateRequest;
import com.datadog.api.client.v2.model.TeamPermissionSettingValue;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    TeamPermissionSettingUpdateRequest body =
        new TeamPermissionSettingUpdateRequest()
            .data(
                new TeamPermissionSettingUpdate()
                    .attributes(
                        new TeamPermissionSettingUpdateAttributes()
                            .value(TeamPermissionSettingValue.ADMINS))
                    .type(TeamPermissionSettingType.TEAM_PERMISSION_SETTINGS));

    try {
      TeamPermissionSettingResponse result =
          apiInstance.updateTeamPermissionSetting(DD_TEAM_DATA_ID, "manage_membership", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateTeamPermissionSetting");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
