// Create an OpenAI LLM Evaluations account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpenAillmEvaluationsIntegrationApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountAuthenticationRequest;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthRequest;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountCreateAttributes;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountSettingsRequest;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsLLMCompletionsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsProjectCloudCostDataIntegrationDataflowRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.createOpenAILLMEvaluationsIntegrationAccount", true);
    OpenAillmEvaluationsIntegrationApi apiInstance =
        new OpenAillmEvaluationsIntegrationApi(defaultClient);

    OpenAILLMEvaluationsIntegrationAccountCreateRequest body =
        new OpenAILLMEvaluationsIntegrationAccountCreateRequest()
            .data(
                new OpenAILLMEvaluationsIntegrationAccountCreateData()
                    .attributes(
                        new OpenAILLMEvaluationsIntegrationAccountCreateAttributes()
                            .authentication(
                                new OpenAILLMEvaluationsIntegrationAccountAuthenticationRequest(
                                    new OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthRequest()
                                        .authType(
                                            OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthType
                                                .BEARER_TOKEN)
                                        .token("your-token")))
                            .dataflows(
                                new OpenAILLMEvaluationsIntegrationDataflowsRequest()
                                    .openaiLlmCompletions(
                                        new OpenAILLMEvaluationsLLMCompletionsIntegrationDataflowRequest()
                                            .enabled(true))
                                    .openaiProjectCloudCostData(
                                        new OpenAILLMEvaluationsProjectCloudCostDataIntegrationDataflowRequest()
                                            .enabled(true)))
                            .name("openai-llm-evaluations-acme")
                            .settings(
                                new OpenAILLMEvaluationsIntegrationAccountSettingsRequest()
                                    .customTags("team:ai,env:prod")))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      OpenAILLMEvaluationsIntegrationAccountResponse result =
          apiInstance.createOpenAILLMEvaluationsIntegrationAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OpenAillmEvaluationsIntegrationApi#createOpenAILLMEvaluationsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
