// Create an OpenAI Model Inference account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpenAiModelInferenceIntegrationApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountAuthenticationRequest;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountBearerTokenAuthRequest;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountCreateAttributes;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountResponse;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountSettingsRequest;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.OpenAIModelInferenceLLMCompletionsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.OpenAIModelInferenceProjectCloudCostDataIntegrationDataflowRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.createOpenAIModelInferenceIntegrationAccount", true);
    OpenAiModelInferenceIntegrationApi apiInstance =
        new OpenAiModelInferenceIntegrationApi(defaultClient);

    OpenAIModelInferenceIntegrationAccountCreateRequest body =
        new OpenAIModelInferenceIntegrationAccountCreateRequest()
            .data(
                new OpenAIModelInferenceIntegrationAccountCreateData()
                    .attributes(
                        new OpenAIModelInferenceIntegrationAccountCreateAttributes()
                            .authentication(
                                new OpenAIModelInferenceIntegrationAccountAuthenticationRequest(
                                    new OpenAIModelInferenceIntegrationAccountBearerTokenAuthRequest()
                                        .authType(
                                            OpenAIModelInferenceIntegrationAccountBearerTokenAuthType
                                                .BEARER_TOKEN)
                                        .token("your-token")))
                            .dataflows(
                                new OpenAIModelInferenceIntegrationDataflowsRequest()
                                    .openaiLlmCompletions(
                                        new OpenAIModelInferenceLLMCompletionsIntegrationDataflowRequest()
                                            .enabled(true))
                                    .openaiProjectCloudCostData(
                                        new OpenAIModelInferenceProjectCloudCostDataIntegrationDataflowRequest()
                                            .enabled(true)))
                            .name("openai-model-inference-acme")
                            .settings(
                                new OpenAIModelInferenceIntegrationAccountSettingsRequest()
                                    .customTags("team:ai,env:prod")))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      OpenAIModelInferenceIntegrationAccountResponse result =
          apiInstance.createOpenAIModelInferenceIntegrationAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OpenAiModelInferenceIntegrationApi#createOpenAIModelInferenceIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
