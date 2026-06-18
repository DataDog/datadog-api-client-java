// Create a mute rule returns "Successfully created the mute rule" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.AutomationRuleScope;
import com.datadog.api.client.v2.model.MuteReason;
import com.datadog.api.client.v2.model.MuteRuleAction;
import com.datadog.api.client.v2.model.MuteRuleAttributesCreate;
import com.datadog.api.client.v2.model.MuteRuleCreateRequest;
import com.datadog.api.client.v2.model.MuteRuleDataCreate;
import com.datadog.api.client.v2.model.MuteRuleResponse;
import com.datadog.api.client.v2.model.MuteRuleType;
import com.datadog.api.client.v2.model.SecurityFindingType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createSecurityFindingsAutomationMuteRule", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    MuteRuleCreateRequest body =
        new MuteRuleCreateRequest()
            .data(
                new MuteRuleDataCreate()
                    .attributes(
                        new MuteRuleAttributesCreate()
                            .action(new MuteRuleAction().reason(MuteReason.RISK_ACCEPTED))
                            .enabled(true)
                            .name("Example-Security-Monitoring")
                            .rule(
                                new AutomationRuleScope()
                                    .findingTypes(
                                        Collections.singletonList(
                                            SecurityFindingType.MISCONFIGURATION))
                                    .query("env:staging")))
                    .type(MuteRuleType.MUTE_RULES));

    try {
      MuteRuleResponse result = apiInstance.createSecurityFindingsAutomationMuteRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#createSecurityFindingsAutomationMuteRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
