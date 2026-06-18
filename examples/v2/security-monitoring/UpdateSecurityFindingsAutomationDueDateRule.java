// Update a due date rule returns "Successfully updated the due date rule" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AutomationRuleScope;
import com.datadog.api.client.v2.model.DueDateFrom;
import com.datadog.api.client.v2.model.DueDatePerSeverityItem;
import com.datadog.api.client.v2.model.DueDateRuleAction;
import com.datadog.api.client.v2.model.DueDateRuleAttributesCreate;
import com.datadog.api.client.v2.model.DueDateRuleDataCreate;
import com.datadog.api.client.v2.model.DueDateRuleResponse;
import com.datadog.api.client.v2.model.DueDateRuleType;
import com.datadog.api.client.v2.model.DueDateRuleUpdateRequest;
import com.datadog.api.client.v2.model.DueDateSeverity;
import com.datadog.api.client.v2.model.SecurityFindingType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.updateSecurityFindingsAutomationDueDateRule", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "valid_due_date_rule" in the system
    UUID VALID_DUE_DATE_RULE_DATA_ID = null;
    try {
      VALID_DUE_DATE_RULE_DATA_ID = UUID.fromString(System.getenv("VALID_DUE_DATE_RULE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    DueDateRuleUpdateRequest body =
        new DueDateRuleUpdateRequest()
            .data(
                new DueDateRuleDataCreate()
                    .attributes(
                        new DueDateRuleAttributesCreate()
                            .action(
                                new DueDateRuleAction()
                                    .dueDaysPerSeverity(
                                        Collections.singletonList(
                                            new DueDatePerSeverityItem()
                                                .dueInDays(14L)
                                                .severity(DueDateSeverity.CRITICAL)))
                                    .dueFrom(DueDateFrom.FIRST_SEEN))
                            .enabled(false)
                            .name("Example-Security-Monitoring")
                            .rule(
                                new AutomationRuleScope()
                                    .findingTypes(
                                        Collections.singletonList(
                                            SecurityFindingType.MISCONFIGURATION))
                                    .query("env:staging")))
                    .type(DueDateRuleType.DUE_DATE_RULES));

    try {
      DueDateRuleResponse result =
          apiInstance.updateSecurityFindingsAutomationDueDateRule(
              VALID_DUE_DATE_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#updateSecurityFindingsAutomationDueDateRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
