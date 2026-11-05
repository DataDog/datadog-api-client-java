// Create an AI Gateway provider returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayCustomProviderSupportedOperation;
import com.datadog.api.client.v2.model.AiGatewayKnownProvider;
import com.datadog.api.client.v2.model.AiGatewayModelInput;
import com.datadog.api.client.v2.model.AiGatewayProviderCreateAttributes;
import com.datadog.api.client.v2.model.AiGatewayProviderCreateData;
import com.datadog.api.client.v2.model.AiGatewayProviderCreateRequest;
import com.datadog.api.client.v2.model.AiGatewayProviderInitialBinding;
import com.datadog.api.client.v2.model.AiGatewayProviderInitialBindingRelation;
import com.datadog.api.client.v2.model.AiGatewayProviderIntegrationConfig;
import com.datadog.api.client.v2.model.AiGatewayProviderResponse;
import com.datadog.api.client.v2.model.AiGatewayProviderType;
import com.datadog.api.client.v2.model.AiGatewaySupportedOperation;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createAiGatewayProvider", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayProviderCreateRequest body =
        new AiGatewayProviderCreateRequest()
            .data(
                new AiGatewayProviderCreateData()
                    .attributes(
                        new AiGatewayProviderCreateAttributes()
                            .costMultiplier(1.0)
                            .initialBindings(
                                Collections.singletonList(
                                    new AiGatewayProviderInitialBinding()
                                        .principals(
                                            Collections.singletonList(
                                                "org:11111111-1111-1111-1111-111111111111"))
                                        .relation(AiGatewayProviderInitialBindingRelation.VIEWER)))
                            .integrationAccountId("account-123")
                            .integrationConfig(
                                new AiGatewayProviderIntegrationConfig()
                                    .bedrockRegion("us-east-1")
                                    .foundryProject("my-project")
                                    .foundryResourceId(
                                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/ai/providers/Microsoft.CognitiveServices/accounts/my-foundry")
                                    .location("us-central1")
                                    .projectId("my-gcp-project")
                                    .supportedOperations(
                                        Collections.singletonList(
                                            AiGatewayCustomProviderSupportedOperation
                                                .OPENAI_CHAT_COMPLETIONS)))
                            .knownProvider(AiGatewayKnownProvider.OPENAI)
                            .models(
                                Collections.singletonList(
                                    new AiGatewayModelInput()
                                        .modelIdCanonical("gpt-5.2-codex")
                                        .modelIdWire("gpt-5.2-codex-20260801")
                                        .supportedOperations(
                                            Collections.singletonList(
                                                AiGatewaySupportedOperation
                                                    .OPENAI_CHAT_COMPLETIONS))))
                            .name("production-us")
                            .slug("prod-us"))
                    .type(AiGatewayProviderType.PROVIDERS));

    try {
      AiGatewayProviderResponse result = apiInstance.createAiGatewayProvider(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#createAiGatewayProvider");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
