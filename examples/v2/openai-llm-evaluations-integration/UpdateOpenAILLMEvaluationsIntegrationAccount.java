// Update an OpenAI LLM Evaluations account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpenAillmEvaluationsIntegrationApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthType;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountResponse;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountSettingsUpdate;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsLLMCompletionsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsProjectCloudCostDataIntegrationDataflowRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.updateOpenAILLMEvaluationsIntegrationAccount", true);
    OpenAillmEvaluationsIntegrationApi apiInstance =
        new OpenAillmEvaluationsIntegrationApi(defaultClient);

    OpenAILLMEvaluationsIntegrationAccountUpdateRequest body =
        new OpenAILLMEvaluationsIntegrationAccountUpdateRequest()
            .data(
                new OpenAILLMEvaluationsIntegrationAccountUpdateData()
                    .attributes(
                        new OpenAILLMEvaluationsIntegrationAccountUpdateAttributes()
                            .authentication(
                                new OpenAILLMEvaluationsIntegrationAccountAuthenticationUpdate(
                                    new OpenAILLMEvaluationsIntegrationAccountBearerTokenAuthUpdate()
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
                                new OpenAILLMEvaluationsIntegrationAccountSettingsUpdate()
                                    .customTags("team:ai,env:prod")))
                    .id("3f8b2c1d-6e4a-4b9f-8c2d-1a7e5b9c0f63")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      OpenAILLMEvaluationsIntegrationAccountResponse result =
          apiInstance.updateOpenAILLMEvaluationsIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OpenAillmEvaluationsIntegrationApi#updateOpenAILLMEvaluationsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
