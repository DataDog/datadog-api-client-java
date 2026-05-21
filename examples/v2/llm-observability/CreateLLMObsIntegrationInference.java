// Run an LLM inference returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsAnthropicEffort;
import com.datadog.api.client.v2.model.LLMObsAnthropicMetadata;
import com.datadog.api.client.v2.model.LLMObsAnthropicThinkingConfig;
import com.datadog.api.client.v2.model.LLMObsAnthropicThinkingType;
import com.datadog.api.client.v2.model.LLMObsAzureOpenAIMetadata;
import com.datadog.api.client.v2.model.LLMObsBedrockMetadata;
import com.datadog.api.client.v2.model.LLMObsInferenceContent;
import com.datadog.api.client.v2.model.LLMObsInferenceContentValue;
import com.datadog.api.client.v2.model.LLMObsInferenceFunction;
import com.datadog.api.client.v2.model.LLMObsInferenceMessage;
import com.datadog.api.client.v2.model.LLMObsInferenceTool;
import com.datadog.api.client.v2.model.LLMObsInferenceToolCall;
import com.datadog.api.client.v2.model.LLMObsInferenceToolResult;
import com.datadog.api.client.v2.model.LLMObsIntegrationInferenceRequest;
import com.datadog.api.client.v2.model.LLMObsIntegrationInferenceResponse;
import com.datadog.api.client.v2.model.LLMObsIntegrationName;
import com.datadog.api.client.v2.model.LLMObsOpenAIMetadata;
import com.datadog.api.client.v2.model.LLMObsOpenAIReasoningEffort;
import com.datadog.api.client.v2.model.LLMObsOpenAIReasoningSummary;
import com.datadog.api.client.v2.model.LLMObsVertexAIMetadata;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLLMObsIntegrationInference", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsIntegrationInferenceRequest body =
        new LLMObsIntegrationInferenceRequest()
            .anthropicMetadata(
                new LLMObsAnthropicMetadata()
                    .effort(LLMObsAnthropicEffort.MEDIUM)
                    .thinking(
                        new LLMObsAnthropicThinkingConfig()
                            .budgetTokens(1024L)
                            .type(LLMObsAnthropicThinkingType.ENABLED)))
            .azureOpenaiMetadata(
                new LLMObsAzureOpenAIMetadata()
                    .deploymentId("my-gpt4-deployment")
                    .modelVersion("0613")
                    .resourceName("my-azure-resource"))
            .bedrockMetadata(new LLMObsBedrockMetadata().region("us-east-1"))
            .jsonSchema("""
{"type":"object","properties":{"answer":{"type":"string"}}}
""")
            .maxCompletionTokens(1024L)
            .maxTokens(1024L)
            .messages(
                Collections.singletonList(
                    new LLMObsInferenceMessage()
                        .content("What is the capital of France?")
                        .contents(
                            Collections.singletonList(
                                new LLMObsInferenceContent()
                                    .type("text")
                                    .value(
                                        new LLMObsInferenceContentValue()
                                            .text("Hello, how can I help you?")
                                            .toolCall(
                                                new LLMObsInferenceToolCall()
                                                    .arguments(
                                                        Map.ofEntries(
                                                            Map.entry("location", "San Francisco")))
                                                    .name("get_weather")
                                                    .toolId("call_abc123")
                                                    .type("function"))
                                            .toolCallResult(
                                                new LLMObsInferenceToolResult()
                                                    .name("get_weather")
                                                    .result(
                                                        "The weather in San Francisco is 68°F and"
                                                            + " sunny.")
                                                    .toolId("call_abc123")
                                                    .type("function")))))
                        .id("msg_001")
                        .role("user")
                        .toolCalls(
                            Collections.singletonList(
                                new LLMObsInferenceToolCall()
                                    .arguments(
                                        Map.ofEntries(Map.entry("location", "San Francisco")))
                                    .name("get_weather")
                                    .toolId("call_abc123")
                                    .type("function")))
                        .toolResults(
                            Collections.singletonList(
                                new LLMObsInferenceToolResult()
                                    .name("get_weather")
                                    .result("The weather in San Francisco is 68°F and sunny.")
                                    .toolId("call_abc123")
                                    .type("function")))))
            .modelId("gpt-4o")
            .openaiMetadata(
                new LLMObsOpenAIMetadata()
                    .reasoningEffort(LLMObsOpenAIReasoningEffort.MEDIUM)
                    .reasoningSummary(LLMObsOpenAIReasoningSummary.AUTO))
            .temperature(0.7)
            .tools(
                Collections.singletonList(
                    new LLMObsInferenceTool()
                        .function(
                            new LLMObsInferenceFunction()
                                .description("Get the current weather for a location.")
                                .name("get_weather")
                                .parameters(
                                    Map.ofEntries(
                                        Map.entry("properties", "{'location': {'type': 'string'}}"),
                                        Map.entry("type", "object"))))
                        .type("function")))
            .topK(50L)
            .topP(1.0)
            .vertexAiMetadata(
                new LLMObsVertexAIMetadata()
                    .location("us-central1")
                    .project("my-gcp-project")
                    .projectIds(Collections.singletonList("my-gcp-project")));

    try {
      LLMObsIntegrationInferenceResponse result =
          apiInstance.createLLMObsIntegrationInference(
              LLMObsIntegrationName.OPENAI, "account-abc123", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LlmObservabilityApi#createLLMObsIntegrationInference");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
