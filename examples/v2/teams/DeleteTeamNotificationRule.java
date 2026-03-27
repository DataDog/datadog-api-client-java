// Delete team notification rule returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    // there is a valid "team_notification_rule" in the system
    String TEAM_NOTIFICATION_RULE_DATA_ID = System.getenv("TEAM_NOTIFICATION_RULE_DATA_ID");

    try {
      apiInstance.deleteTeamNotificationRule(DD_TEAM_DATA_ID, TEAM_NOTIFICATION_RULE_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#deleteTeamNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
