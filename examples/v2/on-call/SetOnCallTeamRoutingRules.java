// Set On-Call team routing rules returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.api.OnCallApi.SetOnCallTeamRoutingRulesOptionalParameters;
import com.datadog.api.client.v2.model.TeamRoutingRules;
import com.datadog.api.client.v2.model.RoutingRuleAction;
import com.datadog.api.client.v2.model.SendSlackMessageAction;
import com.datadog.api.client.v2.model.SendSlackMessageActionType;
import com.datadog.api.client.v2.model.TeamRoutingRulesRequest;
import com.datadog.api.client.v2.model.TeamRoutingRulesRequestData;
import com.datadog.api.client.v2.model.TeamRoutingRulesRequestDataAttributes;
import com.datadog.api.client.v2.model.TeamRoutingRulesRequestDataType;
import com.datadog.api.client.v2.model.TeamRoutingRulesRequestRule;
import com.datadog.api.client.v2.model.TimeRestriction;
import com.datadog.api.client.v2.model.TimeRestrictions;
import com.datadog.api.client.v2.model.Urgency;
import com.datadog.api.client.v2.model.Weekday;
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
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    // there is a valid "escalation_policy" in the system
    String ESCALATION_POLICY_DATA_ID = System.getenv("ESCALATION_POLICY_DATA_ID");

    TeamRoutingRulesRequest body = new TeamRoutingRulesRequest()
.data(new TeamRoutingRulesRequestData()
.attributes(new TeamRoutingRulesRequestDataAttributes()
.rules(Arrays.asList(new TeamRoutingRulesRequestRule()
.actions(Collections.singletonList(new RoutingRuleAction(
new SendSlackMessageAction()
.channel("channel")
.type(SendSlackMessageActionType.SEND_SLACK_MESSAGE)
.workspace("workspace"))))
.query("tags.service:test")
.timeRestriction(new TimeRestrictions()
.timeZone("Europe/Paris")
.restrictions(Arrays.asList(new TimeRestriction()
.endDay(Weekday.MONDAY)
.endTime("17:00:00")
.startDay(Weekday.MONDAY)
.startTime("09:00:00"), new TimeRestriction()
.endDay(Weekday.TUESDAY)
.endTime("17:00:00")
.startDay(Weekday.TUESDAY)
.startTime("09:00:00")))), new TeamRoutingRulesRequestRule()
.policyId(ESCALATION_POLICY_DATA_ID)
.query("")
.urgency(Urgency.LOW))))
.id(DD_TEAM_DATA_ID)
.type(TeamRoutingRulesRequestDataType.TEAM_ROUTING_RULES));

    try {
      TeamRoutingRules result = apiInstance.setOnCallTeamRoutingRules(DD_TEAM_DATA_ID, body,new SetOnCallTeamRoutingRulesOptionalParameters().include("rules"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#setOnCallTeamRoutingRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}