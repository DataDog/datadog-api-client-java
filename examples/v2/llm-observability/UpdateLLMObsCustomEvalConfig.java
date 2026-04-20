// Create or update a custom evaluator configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigAssessmentCriteria;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigBedrockOptions;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigEvalScope;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigInferenceParams;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigIntegrationProvider;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigLLMJudgeConfig;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigLLMProvider;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigParsingType;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigPromptContent;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigPromptContentValue;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigPromptMessage;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigPromptToolCall;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigPromptToolResult;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigTarget;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigType;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigUpdateAttributes;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigUpdateData;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigVertexAIOptions;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateLLMObsCustomEvalConfig", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsCustomEvalConfigUpdateRequest body =
        new LLMObsCustomEvalConfigUpdateRequest()
            .data(
                new LLMObsCustomEvalConfigUpdateData()
                    .attributes(
                        new LLMObsCustomEvalConfigUpdateAttributes()
                            .category("Custom")
                            .evalName("my-custom-evaluator")
                            .llmJudgeConfig(
                                new LLMObsCustomEvalConfigLLMJudgeConfig()
                                    .assessmentCriteria(
                                        new LLMObsCustomEvalConfigAssessmentCriteria()
                                            .maxThreshold(1.0)
                                            .minThreshold(0.7)
                                            .passValues(Arrays.asList("pass", "yes"))
                                            .passWhen(true))
                                    .inferenceParams(
                                        new LLMObsCustomEvalConfigInferenceParams()
                                            .maxTokens(1024L)
                                            .temperature(0.7)
                                            .topK(50L)
                                            .topP(1.0))
                                    .lastUsedLibraryPromptTemplateName("sentiment-analysis-v1")
                                    .modifiedLibraryPromptTemplate(false)
                                    .outputSchema(null)
                                    .parsingType(
                                        LLMObsCustomEvalConfigParsingType.STRUCTURED_OUTPUT)
                                    .promptTemplate(
                                        Collections.singletonList(
                                            new LLMObsCustomEvalConfigPromptMessage()
                                                .content(
                                                    "Rate the quality of the following response:")
                                                .contents(
                                                    Collections.singletonList(
                                                        new LLMObsCustomEvalConfigPromptContent()
                                                            .type("text")
                                                            .value(
                                                                new LLMObsCustomEvalConfigPromptContentValue()
                                                                    .text(
                                                                        "What is the sentiment of"
                                                                            + " this review?")
                                                                    .toolCall(
                                                                        new LLMObsCustomEvalConfigPromptToolCall()
                                                                            .arguments(
                                                                                """
{"location": "San Francisco"}
""")
                                                                            .id("call_abc123")
                                                                            .name("get_weather")
                                                                            .type("function"))
                                                                    .toolCallResult(
                                                                        new LLMObsCustomEvalConfigPromptToolResult()
                                                                            .name("get_weather")
                                                                            .result("sunny, 72F")
                                                                            .toolId("call_abc123")
                                                                            .type("function")))))
                                                .role("user"))))
                            .llmProvider(
                                new LLMObsCustomEvalConfigLLMProvider()
                                    .bedrock(
                                        new LLMObsCustomEvalConfigBedrockOptions()
                                            .region("us-east-1"))
                                    .integrationAccountId("my-account-id")
                                    .integrationProvider(
                                        LLMObsCustomEvalConfigIntegrationProvider.OPENAI)
                                    .modelName("gpt-4o")
                                    .vertexAi(
                                        new LLMObsCustomEvalConfigVertexAIOptions()
                                            .location("us-central1")
                                            .project("my-gcp-project")))
                            .target(
                                new LLMObsCustomEvalConfigTarget()
                                    .applicationName("my-llm-app")
                                    .enabled(true)
                                    .evalScope(LLMObsCustomEvalConfigEvalScope.SPAN)
                                    .filter("@service:my-service")
                                    .rootSpansOnly(true)
                                    .samplingPercentage(50.0)))
                    .id("my-custom-evaluator")
                    .type(LLMObsCustomEvalConfigType.EVALUATOR_CONFIG));

    try {
      apiInstance.updateLLMObsCustomEvalConfig("my-custom-evaluator", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#updateLLMObsCustomEvalConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
