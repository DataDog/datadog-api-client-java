// Update an OpenAI Codex integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpenAiCodexIntegrationApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.OpenAICodexDoraIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountAuthenticationUpdate;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountBearerTokenAuthUpdate;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountResponse;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountSettingsUpdate;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.OpenAICodexTurnMetricsIntegrationDataflowRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateOpenAICodexIntegrationAccount", true);
    OpenAiCodexIntegrationApi apiInstance = new OpenAiCodexIntegrationApi(defaultClient);

    OpenAICodexIntegrationAccountUpdateRequest body =
        new OpenAICodexIntegrationAccountUpdateRequest()
            .data(
                new OpenAICodexIntegrationAccountUpdateData()
                    .attributes(
                        new OpenAICodexIntegrationAccountUpdateAttributes()
                            .authentication(
                                new OpenAICodexIntegrationAccountAuthenticationUpdate(
                                    new OpenAICodexIntegrationAccountBearerTokenAuthUpdate()
                                        .authType(
                                            OpenAICodexIntegrationAccountBearerTokenAuthType
                                                .BEARER_TOKEN)
                                        .token("your-token")))
                            .dataflows(
                                new OpenAICodexIntegrationDataflowsRequest()
                                    .openaiCodexDora(
                                        new OpenAICodexDoraIntegrationDataflowRequest()
                                            .enabled(true))
                                    .openaiCodexTurnMetrics(
                                        new OpenAICodexTurnMetricsIntegrationDataflowRequest()
                                            .enabled(true)))
                            .name("openai-codex-acme")
                            .settings(
                                new OpenAICodexIntegrationAccountSettingsUpdate()
                                    .codexWorkspaceId("your-workspace-id")))
                    .id("7d2f9c4e-3a1b-4c8e-9f6d-2b5a8e1c0d47")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      OpenAICodexIntegrationAccountResponse result =
          apiInstance.updateOpenAICodexIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling OpenAiCodexIntegrationApi#updateOpenAICodexIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
