// Update team notification rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.TeamNotificationRule;
import com.datadog.api.client.v2.model.TeamNotificationRuleAttributes;
import com.datadog.api.client.v2.model.TeamNotificationRuleAttributesPagerduty;
import com.datadog.api.client.v2.model.TeamNotificationRuleAttributesSlack;
import com.datadog.api.client.v2.model.TeamNotificationRuleRequest;
import com.datadog.api.client.v2.model.TeamNotificationRuleResponse;
import com.datadog.api.client.v2.model.TeamNotificationRuleType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    // there is a valid "team_notification_rule" in the system
    String TEAM_NOTIFICATION_RULE_DATA_ID = System.getenv("TEAM_NOTIFICATION_RULE_DATA_ID");

    TeamNotificationRuleRequest body =
        new TeamNotificationRuleRequest()
            .data(
                new TeamNotificationRule()
                    .type(TeamNotificationRuleType.TEAM_NOTIFICATION_RULES)
                    .id(TEAM_NOTIFICATION_RULE_DATA_ID)
                    .attributes(
                        new TeamNotificationRuleAttributes()
                            .pagerduty(
                                new TeamNotificationRuleAttributesPagerduty()
                                    .serviceName("Datadog-prod"))
                            .slack(
                                new TeamNotificationRuleAttributesSlack()
                                    .workspace("Datadog")
                                    .channel("aaa-governance-ops"))));

    try {
      TeamNotificationRuleResponse result =
          apiInstance.updateTeamNotificationRule(
              DD_TEAM_DATA_ID, TEAM_NOTIFICATION_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateTeamNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
