// Patch a signal-based notification rule returns "Notification rule successfully patched." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.NotificationRuleResponse;
import com.datadog.api.client.v2.model.NotificationRulesType;
import com.datadog.api.client.v2.model.PatchNotificationRuleParameters;
import com.datadog.api.client.v2.model.PatchNotificationRuleParametersData;
import com.datadog.api.client.v2.model.PatchNotificationRuleParametersDataAttributes;
import com.datadog.api.client.v2.model.RuleSeverity;
import com.datadog.api.client.v2.model.RuleTypesItems;
import com.datadog.api.client.v2.model.Selectors;
import com.datadog.api.client.v2.model.TriggerSource;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "valid_signal_notification_rule" in the system
    String VALID_SIGNAL_NOTIFICATION_RULE_DATA_ID =
        System.getenv("VALID_SIGNAL_NOTIFICATION_RULE_DATA_ID");

    PatchNotificationRuleParameters body =
        new PatchNotificationRuleParameters()
            .data(
                new PatchNotificationRuleParametersData()
                    .attributes(
                        new PatchNotificationRuleParametersDataAttributes()
                            .enabled(true)
                            .name("Rule 1")
                            .selectors(
                                new Selectors()
                                    .query("(source:production_service OR env:prod)")
                                    .ruleTypes(
                                        Arrays.asList(
                                            RuleTypesItems.MISCONFIGURATION,
                                            RuleTypesItems.ATTACK_PATH))
                                    .severities(Collections.singletonList(RuleSeverity.CRITICAL))
                                    .triggerSource(TriggerSource.SECURITY_FINDINGS))
                            .targets(Collections.singletonList("@john.doe@email.com"))
                            .timeAggregation(86400L)
                            .version(1L))
                    .id(VALID_SIGNAL_NOTIFICATION_RULE_DATA_ID)
                    .type(NotificationRulesType.NOTIFICATION_RULES));

    try {
      NotificationRuleResponse result =
          apiInstance.patchSignalNotificationRule(VALID_SIGNAL_NOTIFICATION_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#patchSignalNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
