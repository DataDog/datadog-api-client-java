// Update a mute rule returns "Mute rule successfully updated" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.ActionMute;
import com.datadog.api.client.v2.model.CreateMuteRuleParametersDataAttributes;
import com.datadog.api.client.v2.model.IssueType;
import com.datadog.api.client.v2.model.MuteReason;
import com.datadog.api.client.v2.model.MuteRuleResponse;
import com.datadog.api.client.v2.model.MuteRulesType;
import com.datadog.api.client.v2.model.Rule;
import com.datadog.api.client.v2.model.RuleSeverity;
import com.datadog.api.client.v2.model.RuleTypesItems;
import com.datadog.api.client.v2.model.UpdateMuteRuleParameters;
import com.datadog.api.client.v2.model.UpdateMuteRuleParametersData;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "valid_mute_rule" in the system
    UUID VALID_MUTE_RULE_DATA_ID = null;
    try {
      VALID_MUTE_RULE_DATA_ID = UUID.fromString(System.getenv("VALID_MUTE_RULE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    UpdateMuteRuleParameters body =
        new UpdateMuteRuleParameters()
            .data(
                new UpdateMuteRuleParametersData()
                    .attributes(
                        new CreateMuteRuleParametersDataAttributes()
                            .action(
                                new ActionMute()
                                    .expireAt(1893452400000L)
                                    .reason(MuteReason.DUPLICATE)
                                    .reasonDescription("Muting for a while"))
                            .enabled(true)
                            .name("Rule 1")
                            .rule(
                                new Rule()
                                    .issueType(IssueType.VULNERABILITY)
                                    .query("key:val")
                                    .ruleIds(Collections.singletonList("rule-id-1"))
                                    .ruleTypes(
                                        Collections.singletonList(
                                            RuleTypesItems.APPLICATION_CODE_VULNERABILITY))
                                    .severities(Collections.singletonList(RuleSeverity.CRITICAL))))
                    .id(VALID_MUTE_RULE_DATA_ID)
                    .type(MuteRulesType.MUTE_RULES));

    try {
      MuteRuleResponse result = apiInstance.updateMuteRule(VALID_MUTE_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#updateMuteRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
