// Update a mute rule returns "Successfully updated the mute rule" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AutomationRuleScope;
import com.datadog.api.client.v2.model.MuteReason;
import com.datadog.api.client.v2.model.MuteRuleAction;
import com.datadog.api.client.v2.model.MuteRuleAttributesCreate;
import com.datadog.api.client.v2.model.MuteRuleDataCreate;
import com.datadog.api.client.v2.model.MuteRuleResponse;
import com.datadog.api.client.v2.model.MuteRuleType;
import com.datadog.api.client.v2.model.MuteRuleUpdateRequest;
import com.datadog.api.client.v2.model.SecurityFindingType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateSecurityFindingsAutomationMuteRule", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "valid_mute_rule" in the system
    UUID VALID_MUTE_RULE_DATA_ID = null;
    try {
      VALID_MUTE_RULE_DATA_ID = UUID.fromString(System.getenv("VALID_MUTE_RULE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    MuteRuleUpdateRequest body =
        new MuteRuleUpdateRequest()
            .data(
                new MuteRuleDataCreate()
                    .attributes(
                        new MuteRuleAttributesCreate()
                            .action(new MuteRuleAction().reason(MuteReason.FALSE_POSITIVE))
                            .enabled(false)
                            .name("Example-Security-Monitoring")
                            .rule(
                                new AutomationRuleScope()
                                    .findingTypes(
                                        Collections.singletonList(
                                            SecurityFindingType.MISCONFIGURATION))
                                    .query("env:staging")))
                    .type(MuteRuleType.MUTE_RULES));

    try {
      MuteRuleResponse result =
          apiInstance.updateSecurityFindingsAutomationMuteRule(VALID_MUTE_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#updateSecurityFindingsAutomationMuteRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
