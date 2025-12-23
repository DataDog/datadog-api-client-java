// Update team notification rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.TeamNotificationRule;
import com.datadog.api.client.v2.model.TeamNotificationRuleAttributes;
import com.datadog.api.client.v2.model.TeamNotificationRuleAttributesEmail;
import com.datadog.api.client.v2.model.TeamNotificationRuleAttributesMsTeams;
import com.datadog.api.client.v2.model.TeamNotificationRuleAttributesPagerduty;
import com.datadog.api.client.v2.model.TeamNotificationRuleAttributesSlack;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    TeamNotificationRule body =
        new TeamNotificationRule()
            .attributes(
                new TeamNotificationRuleAttributes()
                    .email(new TeamNotificationRuleAttributesEmail())
                    .msTeams(new TeamNotificationRuleAttributesMsTeams())
                    .pagerduty(new TeamNotificationRuleAttributesPagerduty())
                    .slack(new TeamNotificationRuleAttributesSlack()))
            .id("b8626d7e-cedd-11eb-abf5-da7ad0900001");

    try {
      TeamNotificationRule result =
          apiInstance.updateTeamNotificationRule("rule_id", "team_id", body);
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
