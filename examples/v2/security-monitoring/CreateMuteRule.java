// Create a new mute rule returns "Successfully created the mute rule" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.ActionMute;
import com.datadog.api.client.v2.model.AutomationRule;
import com.datadog.api.client.v2.model.CreateMuteRuleParameters;
import com.datadog.api.client.v2.model.CreateMuteRuleParametersData;
import com.datadog.api.client.v2.model.CreateMuteRuleParametersDataAttributes;
import com.datadog.api.client.v2.model.IssueType;
import com.datadog.api.client.v2.model.MuteReason;
import com.datadog.api.client.v2.model.MuteRuleResponse;
import com.datadog.api.client.v2.model.MuteRulesType;
import com.datadog.api.client.v2.model.SecurityRuleSeverity;
import com.datadog.api.client.v2.model.SecurityRuleTypesItems;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    CreateMuteRuleParameters body =
        new CreateMuteRuleParameters()
            .data(
                new CreateMuteRuleParametersData()
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
                                new AutomationRule()
                                    .issueType(IssueType.VULNERABILITY)
                                    .query("key:val")
                                    .ruleIds(Collections.singletonList("rule-id-1"))
                                    .ruleTypes(
                                        Collections.singletonList(
                                            SecurityRuleTypesItems.APPLICATION_CODE_VULNERABILITY))
                                    .severities(
                                        Collections.singletonList(SecurityRuleSeverity.CRITICAL))))
                    .type(MuteRulesType.MUTE_RULES));

    try {
      MuteRuleResponse result = apiInstance.createMuteRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createMuteRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
