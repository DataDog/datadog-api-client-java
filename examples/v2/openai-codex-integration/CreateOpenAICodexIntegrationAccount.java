// Create an OpenAI Codex integration account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpenAiCodexIntegrationApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.OpenAICodexDoraIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountAuthenticationRequest;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountBearerTokenAuthRequest;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountCreateAttributes;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountResponse;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationAccountSettingsRequest;
import com.datadog.api.client.v2.model.OpenAICodexIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.OpenAICodexTurnMetricsIntegrationDataflowRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createOpenAICodexIntegrationAccount", true);
    OpenAiCodexIntegrationApi apiInstance = new OpenAiCodexIntegrationApi(defaultClient);

    OpenAICodexIntegrationAccountCreateRequest body =
        new OpenAICodexIntegrationAccountCreateRequest()
            .data(
                new OpenAICodexIntegrationAccountCreateData()
                    .attributes(
                        new OpenAICodexIntegrationAccountCreateAttributes()
                            .authentication(
                                new OpenAICodexIntegrationAccountAuthenticationRequest(
                                    new OpenAICodexIntegrationAccountBearerTokenAuthRequest()
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
                                new OpenAICodexIntegrationAccountSettingsRequest()
                                    .codexWorkspaceId("your-workspace-id")))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      OpenAICodexIntegrationAccountResponse result =
          apiInstance.createOpenAICodexIntegrationAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling OpenAiCodexIntegrationApi#createOpenAICodexIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
