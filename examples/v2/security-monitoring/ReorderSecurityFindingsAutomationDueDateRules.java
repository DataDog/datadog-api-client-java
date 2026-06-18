// Reorder due date rules returns "Successfully reordered the due date rules" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.DueDateRuleReorderItem;
import com.datadog.api.client.v2.model.DueDateRuleReorderRequest;
import com.datadog.api.client.v2.model.DueDateRuleType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.reorderSecurityFindingsAutomationDueDateRules", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "valid_due_date_rule" in the system
    UUID VALID_DUE_DATE_RULE_DATA_ID = null;
    try {
      VALID_DUE_DATE_RULE_DATA_ID = UUID.fromString(System.getenv("VALID_DUE_DATE_RULE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    DueDateRuleReorderRequest body =
        new DueDateRuleReorderRequest()
            .data(
                Collections.singletonList(
                    new DueDateRuleReorderItem()
                        .id(VALID_DUE_DATE_RULE_DATA_ID)
                        .type(DueDateRuleType.DUE_DATE_RULES)));

    try {
      DueDateRuleReorderRequest result =
          apiInstance.reorderSecurityFindingsAutomationDueDateRules(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#reorderSecurityFindingsAutomationDueDateRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
