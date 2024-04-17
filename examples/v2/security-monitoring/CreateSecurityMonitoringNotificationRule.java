// Create a notification rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringNotificationRuleCreateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringNotificationRuleCreateData;
import com.datadog.api.client.v2.model.SecurityMonitoringNotificationRuleCreateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringNotificationRuleResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringNotificationRuleSelectors;
import com.datadog.api.client.v2.model.SecurityMonitoringNotificationRuleType;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTypes;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringNotificationRuleCreateRequest body =
        new SecurityMonitoringNotificationRuleCreateRequest()
            .data(
                new SecurityMonitoringNotificationRuleCreateData()
                    .attributes(
                        new SecurityMonitoringNotificationRuleCreateAttributes()
                            .enabled(true)
                            .name("Example-Security-Monitoring")
                            .selectors(
                                new SecurityMonitoringNotificationRuleSelectors()
                                    .attributes(Arrays.asList("test:123", "env:prod"))
                                    .implicitVmRuleMatch(false)
                                    .ruleTags(Collections.singletonList("test:123"))
                                    .ruleTypes(
                                        Arrays.asList(
                                            SecurityMonitoringRuleTypes.APPLICATION_SECURITY,
                                            SecurityMonitoringRuleTypes.LOG_DETECTION))
                                    .severities(
                                        Collections.singletonList(
                                            SecurityMonitoringRuleSeverity.HIGH))
                                    .signalTags(Collections.singletonList("env:prod")))
                            .targets(Collections.singletonList("@slack-test")))
                    .type(SecurityMonitoringNotificationRuleType.NOTIFICATION_RULES));

    try {
      SecurityMonitoringNotificationRuleResponse result =
          apiInstance.createSecurityMonitoringNotificationRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#createSecurityMonitoringNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
