// Update an LLM Observability prompt returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsPromptResponse;
import com.datadog.api.client.v2.model.LLMObsPromptType;
import com.datadog.api.client.v2.model.LLMObsUpdatePromptData;
import com.datadog.api.client.v2.model.LLMObsUpdatePromptDataAttributes;
import com.datadog.api.client.v2.model.LLMObsUpdatePromptRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateLLMObsPrompt", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    // there is a valid "prompt" in the system
    String PROMPT_DATA_ATTRIBUTES_PROMPT_ID = System.getenv("PROMPT_DATA_ATTRIBUTES_PROMPT_ID");

    LLMObsUpdatePromptRequest body =
        new LLMObsUpdatePromptRequest()
            .data(
                new LLMObsUpdatePromptData()
                    .attributes(
                        new LLMObsUpdatePromptDataAttributes().title("Customer Support Assistant"))
                    .type(LLMObsPromptType.PROMPT_TEMPLATES));

    try {
      LLMObsPromptResponse result =
          apiInstance.updateLLMObsPrompt(PROMPT_DATA_ATTRIBUTES_PROMPT_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#updateLLMObsPrompt");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
