// Create a new signal-based rule returns "Successfully created the notification rule." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.CreateNotificationRuleParameters;
import com.datadog.api.client.v2.model.CreateNotificationRuleParametersData;
import com.datadog.api.client.v2.model.CreateNotificationRuleParametersDataAttributes;
import com.datadog.api.client.v2.model.NotificationRuleResponse;
import com.datadog.api.client.v2.model.NotificationRulesType;
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

    CreateNotificationRuleParameters body =
        new CreateNotificationRuleParameters()
            .data(
                new CreateNotificationRuleParametersData()
                    .attributes(
                        new CreateNotificationRuleParametersDataAttributes()
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
                            .timeAggregation(86400L))
                    .type(NotificationRulesType.NOTIFICATION_RULES));

    try {
      NotificationRuleResponse result = apiInstance.createSignalNotificationRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#createSignalNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
