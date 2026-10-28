// Start a rule proposal returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleProposalInputType;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleProposalStartRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleProposalStartRequestAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleProposalStartRequestData;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleProposalStartResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringRuleProposalType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.startSecurityMonitoringRuleProposal", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringRuleProposalStartRequest body =
        new SecurityMonitoringRuleProposalStartRequest()
            .data(
                new SecurityMonitoringRuleProposalStartRequestData()
                    .type(SecurityMonitoringRuleProposalType.RULE_PROPOSALS)
                    .attributes(
                        new SecurityMonitoringRuleProposalStartRequestAttributes()
                            .inputType(SecurityMonitoringRuleProposalInputType.NATURAL_LANGUAGE)
                            .input(
                                "Detect repeated failed Okta logins followed by a successful login"
                                    + " from the same IP.")));

    try {
      SecurityMonitoringRuleProposalStartResponse result =
          apiInstance.startSecurityMonitoringRuleProposal(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#startSecurityMonitoringRuleProposal");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
