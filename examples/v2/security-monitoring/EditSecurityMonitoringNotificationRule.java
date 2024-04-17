// Update a notification rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringNotificationRuleResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringNotificationRuleSelectors;
import com.datadog.api.client.v2.model.SecurityMonitoringNotificationRuleType;
import com.datadog.api.client.v2.model.SecurityMonitoringNotificationRuleUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringNotificationRuleUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringNotificationRuleUpdateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleSeverity;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleTypes;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "notification_rule" in the system
    String NOTIFICATION_RULE_DATA_ID = System.getenv("NOTIFICATION_RULE_DATA_ID");

    SecurityMonitoringNotificationRuleUpdateRequest body =
        new SecurityMonitoringNotificationRuleUpdateRequest()
            .data(
                new SecurityMonitoringNotificationRuleUpdateData()
                    .attributes(
                        new SecurityMonitoringNotificationRuleUpdateAttributes()
                            .version(1)
                            .name("Example-Security-Monitoring")
                            .enabled(false)
                            .selectors(
                                new SecurityMonitoringNotificationRuleSelectors()
                                    .attributes(Collections.singletonList("fim:true"))
                                    .implicitVmRuleMatch(false)
                                    .ruleTags(Collections.singletonList("fim:true"))
                                    .severities(
                                        Collections.singletonList(
                                            SecurityMonitoringRuleSeverity.HIGH))
                                    .ruleTypes(
                                        Arrays.asList(
                                            SecurityMonitoringRuleTypes.LOG_DETECTION,
                                            SecurityMonitoringRuleTypes.CLOUD_CONFIGURATION)))
                            .targets(Collections.singletonList("test2")))
                    .type(SecurityMonitoringNotificationRuleType.NOTIFICATION_RULES));

    try {
      SecurityMonitoringNotificationRuleResponse result =
          apiInstance.editSecurityMonitoringNotificationRule(NOTIFICATION_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#editSecurityMonitoringNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
