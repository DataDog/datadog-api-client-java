// Add an allowed outreach domain returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.BitsSecurityAnalystApi;
import com.datadog.api.client.v2.model.SecurityAgentOutreachDomainAddRequest;
import com.datadog.api.client.v2.model.SecurityAgentOutreachDomainAddRequestData;
import com.datadog.api.client.v2.model.SecurityAgentOutreachDomainAddRequestDataAttributes;
import com.datadog.api.client.v2.model.SecurityAgentOutreachDomainAddType;
import com.datadog.api.client.v2.model.SecurityAgentOutreachPolicyResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.addSecurityAgentOutreachPolicyDomain", true);
    BitsSecurityAnalystApi apiInstance = new BitsSecurityAnalystApi(defaultClient);

    SecurityAgentOutreachDomainAddRequest body =
        new SecurityAgentOutreachDomainAddRequest()
            .data(
                new SecurityAgentOutreachDomainAddRequestData()
                    .attributes(
                        new SecurityAgentOutreachDomainAddRequestDataAttributes()
                            .domain("acme.com"))
                    .type(SecurityAgentOutreachDomainAddType.OUTREACH_POLICY_DOMAIN_ADD));

    try {
      SecurityAgentOutreachPolicyResponse result =
          apiInstance.addSecurityAgentOutreachPolicyDomain(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling BitsSecurityAnalystApi#addSecurityAgentOutreachPolicyDomain");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
