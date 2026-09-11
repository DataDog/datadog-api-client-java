// Create an inbox rule returns "Successfully created the inbox rule" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AutomationRuleScope;
import com.datadog.api.client.v2.model.InboxRuleAction;
import com.datadog.api.client.v2.model.InboxRuleAttributesCreate;
import com.datadog.api.client.v2.model.InboxRuleCreateRequest;
import com.datadog.api.client.v2.model.InboxRuleDataCreate;
import com.datadog.api.client.v2.model.InboxRuleResponse;
import com.datadog.api.client.v2.model.InboxRuleType;
import com.datadog.api.client.v2.model.SecurityFindingType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createSecurityFindingsAutomationInboxRule", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    InboxRuleCreateRequest body =
        new InboxRuleCreateRequest()
            .data(
                new InboxRuleDataCreate()
                    .attributes(
                        new InboxRuleAttributesCreate()
                            .action(new InboxRuleAction().description("Needs triage"))
                            .enabled(true)
                            .name("Example-Security-Monitoring")
                            .rule(
                                new AutomationRuleScope()
                                    .findingTypes(
                                        Collections.singletonList(
                                            SecurityFindingType.MISCONFIGURATION))
                                    .query("env:staging")))
                    .type(InboxRuleType.INBOX_RULES));

    try {
      InboxRuleResponse result = apiInstance.createSecurityFindingsAutomationInboxRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#createSecurityFindingsAutomationInboxRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
