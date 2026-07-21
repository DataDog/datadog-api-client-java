// Get a specific LLM Observability prompt version returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsPromptVersionResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getLLMObsPromptVersion", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    // there is a valid "prompt" in the system
    String PROMPT_DATA_ATTRIBUTES_PROMPT_ID = System.getenv("PROMPT_DATA_ATTRIBUTES_PROMPT_ID");

    // there is a valid "prompt_version" in the system
    Long PROMPT_VERSION_DATA_ATTRIBUTES_VERSION =
        Long.parseLong(System.getenv("PROMPT_VERSION_DATA_ATTRIBUTES_VERSION"));

    try {
      LLMObsPromptVersionResponse result =
          apiInstance.getLLMObsPromptVersion(
              PROMPT_DATA_ATTRIBUTES_PROMPT_ID, PROMPT_VERSION_DATA_ATTRIBUTES_VERSION);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#getLLMObsPromptVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
