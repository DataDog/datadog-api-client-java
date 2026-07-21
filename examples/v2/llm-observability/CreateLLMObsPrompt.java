// Create an LLM Observability prompt returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsCreatePromptData;
import com.datadog.api.client.v2.model.LLMObsCreatePromptDataAttributes;
import com.datadog.api.client.v2.model.LLMObsCreatePromptRequest;
import com.datadog.api.client.v2.model.LLMObsPromptChatMessage;
import com.datadog.api.client.v2.model.LLMObsPromptChatTemplate;
import com.datadog.api.client.v2.model.LLMObsPromptResponse;
import com.datadog.api.client.v2.model.LLMObsPromptTemplate;
import com.datadog.api.client.v2.model.LLMObsPromptType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLLMObsPrompt", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsCreatePromptRequest body =
        new LLMObsCreatePromptRequest()
            .data(
                new LLMObsCreatePromptData()
                    .attributes(
                        new LLMObsCreatePromptDataAttributes()
                            .promptId("Example-LLM-Observability")
                            .title("Customer Support Assistant")
                            .template(
                                new LLMObsPromptTemplate(
                                    new LLMObsPromptChatTemplate(
                                        Arrays.asList(
                                            new LLMObsPromptChatMessage()
                                                .content(
                                                    "You are a helpful customer support assistant"
                                                        + " for {{company_name}}.")
                                                .role("system"),
                                            new LLMObsPromptChatMessage()
                                                .content(
                                                    "Help {{customer_name}} with this question:"
                                                        + " {{question}}")
                                                .role("user"))))))
                    .type(LLMObsPromptType.PROMPT_TEMPLATES));

    try {
      LLMObsPromptResponse result = apiInstance.createLLMObsPrompt(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#createLLMObsPrompt");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
