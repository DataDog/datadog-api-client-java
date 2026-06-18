// Create a due date rule returns "Successfully created the due date rule" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AutomationRuleScope;
import com.datadog.api.client.v2.model.DueDateFrom;
import com.datadog.api.client.v2.model.DueDatePerSeverityItem;
import com.datadog.api.client.v2.model.DueDateRuleAction;
import com.datadog.api.client.v2.model.DueDateRuleAttributesCreate;
import com.datadog.api.client.v2.model.DueDateRuleCreateRequest;
import com.datadog.api.client.v2.model.DueDateRuleDataCreate;
import com.datadog.api.client.v2.model.DueDateRuleResponse;
import com.datadog.api.client.v2.model.DueDateRuleType;
import com.datadog.api.client.v2.model.DueDateSeverity;
import com.datadog.api.client.v2.model.SecurityFindingType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.createSecurityFindingsAutomationDueDateRule", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    DueDateRuleCreateRequest body =
        new DueDateRuleCreateRequest()
            .data(
                new DueDateRuleDataCreate()
                    .attributes(
                        new DueDateRuleAttributesCreate()
                            .action(
                                new DueDateRuleAction()
                                    .dueDaysPerSeverity(
                                        Collections.singletonList(
                                            new DueDatePerSeverityItem()
                                                .dueInDays(7L)
                                                .severity(DueDateSeverity.CRITICAL)))
                                    .dueFrom(DueDateFrom.FIRST_SEEN))
                            .enabled(true)
                            .name("Example-Security-Monitoring")
                            .rule(
                                new AutomationRuleScope()
                                    .findingTypes(
                                        Collections.singletonList(
                                            SecurityFindingType.MISCONFIGURATION))
                                    .query("env:staging")))
                    .type(DueDateRuleType.DUE_DATE_RULES));

    try {
      DueDateRuleResponse result = apiInstance.createSecurityFindingsAutomationDueDateRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#createSecurityFindingsAutomationDueDateRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
