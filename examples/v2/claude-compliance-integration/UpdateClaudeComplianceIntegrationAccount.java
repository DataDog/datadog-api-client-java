// Update a Claude Compliance integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ClaudeComplianceIntegrationApi;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountAuthenticationUpdate;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountBearerTokenAuthUpdate;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountResponse;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.ClaudeComplianceIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.IntegrationAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateClaudeComplianceIntegrationAccount", true);
    ClaudeComplianceIntegrationApi apiInstance = new ClaudeComplianceIntegrationApi(defaultClient);

    ClaudeComplianceIntegrationAccountUpdateRequest body =
        new ClaudeComplianceIntegrationAccountUpdateRequest()
            .data(
                new ClaudeComplianceIntegrationAccountUpdateData()
                    .attributes(
                        new ClaudeComplianceIntegrationAccountUpdateAttributes()
                            .authentication(
                                new ClaudeComplianceIntegrationAccountAuthenticationUpdate(
                                    new ClaudeComplianceIntegrationAccountBearerTokenAuthUpdate()
                                        .authType(
                                            ClaudeComplianceIntegrationAccountBearerTokenAuthType
                                                .BEARER_TOKEN)
                                        .token("your-token")))
                            .name("claude-compliance-acme"))
                    .id("5f1a8d3c-7e2b-4f9a-b6c4-8d0e3a7f1b52")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      ClaudeComplianceIntegrationAccountResponse result =
          apiInstance.updateClaudeComplianceIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " ClaudeComplianceIntegrationApi#updateClaudeComplianceIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
