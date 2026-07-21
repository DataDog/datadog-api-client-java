// Update a specific LLM Observability prompt version returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsPromptVersionResponse;
import com.datadog.api.client.v2.model.LLMObsPromptVersionType;
import com.datadog.api.client.v2.model.LLMObsUpdatePromptVersionData;
import com.datadog.api.client.v2.model.LLMObsUpdatePromptVersionDataAttributes;
import com.datadog.api.client.v2.model.LLMObsUpdatePromptVersionRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateLLMObsPromptVersion", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    // there is a valid "prompt" in the system
    String PROMPT_DATA_ATTRIBUTES_PROMPT_ID = System.getenv("PROMPT_DATA_ATTRIBUTES_PROMPT_ID");

    // there is a valid "prompt_version" in the system
    Long PROMPT_VERSION_DATA_ATTRIBUTES_VERSION =
        Long.parseLong(System.getenv("PROMPT_VERSION_DATA_ATTRIBUTES_VERSION"));

    LLMObsUpdatePromptVersionRequest body =
        new LLMObsUpdatePromptVersionRequest()
            .data(
                new LLMObsUpdatePromptVersionData()
                    .attributes(
                        new LLMObsUpdatePromptVersionDataAttributes()
                            .description(
                                "Give concise answers and cite relevant help-center articles."))
                    .type(LLMObsPromptVersionType.PROMPT_TEMPLATE_VERSIONS));

    try {
      LLMObsPromptVersionResponse result =
          apiInstance.updateLLMObsPromptVersion(
              PROMPT_DATA_ATTRIBUTES_PROMPT_ID, PROMPT_VERSION_DATA_ATTRIBUTES_VERSION, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#updateLLMObsPromptVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
