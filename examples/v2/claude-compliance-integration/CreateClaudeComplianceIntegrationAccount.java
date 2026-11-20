// Create a Claude Compliance integration account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ClaudeComplianceIntegrationApi;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountAuthenticationRequest;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountBearerTokenAuthRequest;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountCreateAttributes;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountResponse;
import com.datadog.api.client.v2.model.IntegrationAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createClaudeComplianceIntegrationAccount", true);
    ClaudeComplianceIntegrationApi apiInstance = new ClaudeComplianceIntegrationApi(defaultClient);

    ClaudeComplianceIntegrationAccountCreateRequest body =
        new ClaudeComplianceIntegrationAccountCreateRequest()
            .data(
                new ClaudeComplianceIntegrationAccountCreateData()
                    .attributes(
                        new ClaudeComplianceIntegrationAccountCreateAttributes()
                            .authentication(
                                new ClaudeComplianceIntegrationAccountAuthenticationRequest(
                                    new ClaudeComplianceIntegrationAccountBearerTokenAuthRequest()
                                        .authType(
                                            ClaudeComplianceIntegrationAccountBearerTokenAuthType
                                                .BEARER_TOKEN)
                                        .token("your-token")))
                            .name("claude-compliance-acme"))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      ClaudeComplianceIntegrationAccountResponse result =
          apiInstance.createClaudeComplianceIntegrationAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " ClaudeComplianceIntegrationApi#createClaudeComplianceIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
