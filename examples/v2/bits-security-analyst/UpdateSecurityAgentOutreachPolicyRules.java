// Update outreach policy rules returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.BitsSecurityAnalystApi;
import com.datadog.api.client.v2.model.SecurityAgentOutreachPolicyResponse;
import com.datadog.api.client.v2.model.SecurityAgentOutreachRuleUpdate;
import com.datadog.api.client.v2.model.SecurityAgentOutreachRulesUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityAgentOutreachRulesUpdateRequest;
import com.datadog.api.client.v2.model.SecurityAgentOutreachRulesUpdateRequestData;
import com.datadog.api.client.v2.model.SecurityAgentOutreachRulesUpdateType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateSecurityAgentOutreachPolicyRules", true);
    BitsSecurityAnalystApi apiInstance = new BitsSecurityAnalystApi(defaultClient);

    SecurityAgentOutreachRulesUpdateRequest body =
        new SecurityAgentOutreachRulesUpdateRequest()
            .data(
                new SecurityAgentOutreachRulesUpdateRequestData()
                    .attributes(
                        new SecurityAgentOutreachRulesUpdateAttributes()
                            .rules(
                                Collections.singletonList(
                                    new SecurityAgentOutreachRuleUpdate()
                                        .isEnabled(true)
                                        .ruleId("abc-def-ghi"))))
                    .type(SecurityAgentOutreachRulesUpdateType.OUTREACH_POLICY_RULES_UPDATE));

    try {
      SecurityAgentOutreachPolicyResponse result =
          apiInstance.updateSecurityAgentOutreachPolicyRules(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling BitsSecurityAnalystApi#updateSecurityAgentOutreachPolicyRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
