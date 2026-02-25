// Create team notification rule returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.TeamNotificationRuleResponse;
import com.datadog.api.client.v2.model.TeamNotificationRule;
import com.datadog.api.client.v2.model.TeamNotificationRuleAttributes;
import com.datadog.api.client.v2.model.TeamNotificationRuleAttributesEmail;
import com.datadog.api.client.v2.model.TeamNotificationRuleAttributesSlack;
import com.datadog.api.client.v2.model.TeamNotificationRuleRequest;
import com.datadog.api.client.v2.model.TeamNotificationRuleType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    TeamNotificationRuleRequest body = new TeamNotificationRuleRequest()
.data(new TeamNotificationRule()
.type(TeamNotificationRuleType.TEAM_NOTIFICATION_RULES)
.attributes(new TeamNotificationRuleAttributes()
.email(new TeamNotificationRuleAttributesEmail()
.enabled(true))
.slack(new TeamNotificationRuleAttributesSlack()
.workspace("Datadog")
.channel("aaa-omg-ops"))));

    try {
      TeamNotificationRuleResponse result = apiInstance.createTeamNotificationRule(DD_TEAM_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#createTeamNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}