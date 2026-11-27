// Update an OpenAI Model Inference account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpenAiModelInferenceIntegrationApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountAuthenticationUpdate;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountBearerTokenAuthUpdate;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountResponse;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountSettingsUpdate;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.OpenAIModelInferenceLLMCompletionsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.OpenAIModelInferenceProjectCloudCostDataIntegrationDataflowRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.updateOpenAIModelInferenceIntegrationAccount", true);
    OpenAiModelInferenceIntegrationApi apiInstance =
        new OpenAiModelInferenceIntegrationApi(defaultClient);

    OpenAIModelInferenceIntegrationAccountUpdateRequest body =
        new OpenAIModelInferenceIntegrationAccountUpdateRequest()
            .data(
                new OpenAIModelInferenceIntegrationAccountUpdateData()
                    .attributes(
                        new OpenAIModelInferenceIntegrationAccountUpdateAttributes()
                            .authentication(
                                new OpenAIModelInferenceIntegrationAccountAuthenticationUpdate(
                                    new OpenAIModelInferenceIntegrationAccountBearerTokenAuthUpdate()
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
                                new OpenAIModelInferenceIntegrationAccountSettingsUpdate()
                                    .customTags("team:ai,env:prod")))
                    .id("3f8b2c1d-6e4a-4b9f-8c2d-1a7e5b9c0f63")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      OpenAIModelInferenceIntegrationAccountResponse result =
          apiInstance.updateOpenAIModelInferenceIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OpenAiModelInferenceIntegrationApi#updateOpenAIModelInferenceIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
