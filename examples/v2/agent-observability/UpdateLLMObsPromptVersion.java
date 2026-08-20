// Update an Agent Observability prompt version returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsPromptVersionLabel;
import com.datadog.api.client.v2.model.LLMObsPromptVersionResponse;
import com.datadog.api.client.v2.model.LLMObsPromptVersionType;
import com.datadog.api.client.v2.model.LLMObsUpdatePromptVersionData;
import com.datadog.api.client.v2.model.LLMObsUpdatePromptVersionDataAttributes;
import com.datadog.api.client.v2.model.LLMObsUpdatePromptVersionRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateLLMObsPromptVersion", true);
    AgentObservabilityApi apiInstance = new AgentObservabilityApi(defaultClient);

    LLMObsUpdatePromptVersionRequest body =
        new LLMObsUpdatePromptVersionRequest()
            .data(
                new LLMObsUpdatePromptVersionData()
                    .attributes(
                        new LLMObsUpdatePromptVersionDataAttributes()
                            .labels(Collections.singletonList(LLMObsPromptVersionLabel.PRODUCTION)))
                    .type(LLMObsPromptVersionType.PROMPT_TEMPLATE_VERSIONS));

    try {
      LLMObsPromptVersionResponse result =
          apiInstance.updateLLMObsPromptVersion("customer-support-assistant", 1L, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentObservabilityApi#updateLLMObsPromptVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
