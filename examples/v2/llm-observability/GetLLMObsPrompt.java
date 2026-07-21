// Get an LLM Observability prompt returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsPromptSDKResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getLLMObsPrompt", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    // there is a valid "prompt" in the system
    String PROMPT_DATA_ATTRIBUTES_PROMPT_ID = System.getenv("PROMPT_DATA_ATTRIBUTES_PROMPT_ID");

    try {
      LLMObsPromptSDKResponse result =
          apiInstance.getLLMObsPrompt(PROMPT_DATA_ATTRIBUTES_PROMPT_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#getLLMObsPrompt");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
