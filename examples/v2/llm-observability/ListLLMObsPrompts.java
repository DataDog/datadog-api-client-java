// List LLM Observability prompts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.api.LlmObservabilityApi.ListLLMObsPromptsOptionalParameters;
import com.datadog.api.client.v2.model.LLMObsPromptsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listLLMObsPrompts", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    // there is a valid "prompt" in the system
    String PROMPT_DATA_ATTRIBUTES_PROMPT_ID = System.getenv("PROMPT_DATA_ATTRIBUTES_PROMPT_ID");

    try {
      LLMObsPromptsResponse result =
          apiInstance.listLLMObsPrompts(
              new ListLLMObsPromptsOptionalParameters()
                  .filterPromptId(PROMPT_DATA_ATTRIBUTES_PROMPT_ID));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#listLLMObsPrompts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
