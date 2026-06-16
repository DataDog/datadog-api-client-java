// Test a notification rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.CreateNotificationRuleParameters;
import com.datadog.api.client.v2.model.CreateNotificationRuleParametersData;
import com.datadog.api.client.v2.model.CreateNotificationRuleParametersDataAttributes;
import com.datadog.api.client.v2.model.NotificationRulePreviewResponse;
import com.datadog.api.client.v2.model.NotificationRulesType;
import com.datadog.api.client.v2.model.RuleSeverity;
import com.datadog.api.client.v2.model.RuleTypesItems;
import com.datadog.api.client.v2.model.Selectors;
import com.datadog.api.client.v2.model.TriggerSource;
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
                                    .query("env:prod")
                                    .ruleTypes(
                                        Collections.singletonList(RuleTypesItems.LOG_DETECTION))
                                    .severities(Collections.singletonList(RuleSeverity.CRITICAL))
                                    .triggerSource(TriggerSource.SECURITY_SIGNALS))
                            .targets(Collections.singletonList("@john.doe@email.com")))
                    .type(NotificationRulesType.NOTIFICATION_RULES));

    try {
      NotificationRulePreviewResponse result =
          apiInstance.sendSecurityMonitoringNotificationPreview(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#sendSecurityMonitoringNotificationPreview");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
