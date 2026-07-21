// Create a new LLM Observability prompt version returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsCreatePromptVersionData;
import com.datadog.api.client.v2.model.LLMObsCreatePromptVersionDataAttributes;
import com.datadog.api.client.v2.model.LLMObsCreatePromptVersionRequest;
import com.datadog.api.client.v2.model.LLMObsPromptChatMessage;
import com.datadog.api.client.v2.model.LLMObsPromptChatTemplate;
import com.datadog.api.client.v2.model.LLMObsPromptTemplate;
import com.datadog.api.client.v2.model.LLMObsPromptVersionResponse;
import com.datadog.api.client.v2.model.LLMObsPromptVersionType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLLMObsPromptVersion", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    // there is a valid "prompt" in the system
    String PROMPT_DATA_ATTRIBUTES_PROMPT_ID = System.getenv("PROMPT_DATA_ATTRIBUTES_PROMPT_ID");

    LLMObsCreatePromptVersionRequest body =
        new LLMObsCreatePromptVersionRequest()
            .data(
                new LLMObsCreatePromptVersionData()
                    .attributes(
                        new LLMObsCreatePromptVersionDataAttributes()
                            .template(
                                new LLMObsPromptTemplate(
                                    new LLMObsPromptChatTemplate(
                                        Arrays.asList(
                                            new LLMObsPromptChatMessage()
                                                .content(
                                                    "You are a concise customer support assistant"
                                                        + " for {{company_name}}.")
                                                .role("system"),
                                            new LLMObsPromptChatMessage()
                                                .content(
                                                    "Answer {{customer_name}}'s question:"
                                                        + " {{question}}")
                                                .role("user"))))))
                    .type(LLMObsPromptVersionType.PROMPT_TEMPLATE_VERSIONS));

    try {
      LLMObsPromptVersionResponse result =
          apiInstance.createLLMObsPromptVersion(PROMPT_DATA_ATTRIBUTES_PROMPT_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#createLLMObsPromptVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
