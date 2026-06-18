// Reorder mute rules returns "Successfully reordered the mute rules" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.MuteRuleReorderItem;
import com.datadog.api.client.v2.model.MuteRuleReorderRequest;
import com.datadog.api.client.v2.model.MuteRuleType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.reorderSecurityFindingsAutomationMuteRules", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "valid_mute_rule" in the system
    UUID VALID_MUTE_RULE_DATA_ID = null;
    try {
      VALID_MUTE_RULE_DATA_ID = UUID.fromString(System.getenv("VALID_MUTE_RULE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    MuteRuleReorderRequest body =
        new MuteRuleReorderRequest()
            .data(
                Collections.singletonList(
                    new MuteRuleReorderItem()
                        .id(VALID_MUTE_RULE_DATA_ID)
                        .type(MuteRuleType.MUTE_RULES)));

    try {
      MuteRuleReorderRequest result = apiInstance.reorderSecurityFindingsAutomationMuteRules(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#reorderSecurityFindingsAutomationMuteRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
