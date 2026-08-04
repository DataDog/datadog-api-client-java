// Reorder severity modifier rules returns "Successfully reordered the severity modifier rules"
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SeverityModifierRuleReorderItem;
import com.datadog.api.client.v2.model.SeverityModifierRuleReorderRequest;
import com.datadog.api.client.v2.model.SeverityModifierRuleType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.reorderSecurityFindingsAutomationSeverityModifierRules", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "valid_severity_modifier_rule" in the system
    UUID VALID_SEVERITY_MODIFIER_RULE_DATA_ID = null;
    try {
      VALID_SEVERITY_MODIFIER_RULE_DATA_ID =
          UUID.fromString(System.getenv("VALID_SEVERITY_MODIFIER_RULE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    SeverityModifierRuleReorderRequest body =
        new SeverityModifierRuleReorderRequest()
            .data(
                Collections.singletonList(
                    new SeverityModifierRuleReorderItem()
                        .id(VALID_SEVERITY_MODIFIER_RULE_DATA_ID)
                        .type(SeverityModifierRuleType.SEVERITY_MODIFIER_RULES)));

    try {
      SeverityModifierRuleReorderRequest result =
          apiInstance.reorderSecurityFindingsAutomationSeverityModifierRules(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#reorderSecurityFindingsAutomationSeverityModifierRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
