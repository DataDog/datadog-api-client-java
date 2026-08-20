// Create an Agent Observability prompt returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsCreatePromptData;
import com.datadog.api.client.v2.model.LLMObsCreatePromptDataAttributes;
import com.datadog.api.client.v2.model.LLMObsCreatePromptRequest;
import com.datadog.api.client.v2.model.LLMObsPromptResponse;
import com.datadog.api.client.v2.model.LLMObsPromptTemplate;
import com.datadog.api.client.v2.model.LLMObsPromptType;
import com.datadog.api.client.v2.model.LLMObsPromptVersionLabel;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLLMObsPrompt", true);
    AgentObservabilityApi apiInstance = new AgentObservabilityApi(defaultClient);

    LLMObsCreatePromptRequest body =
        new LLMObsCreatePromptRequest()
            .data(
                new LLMObsCreatePromptData()
                    .attributes(
                        new LLMObsCreatePromptDataAttributes()
                            .labels(Collections.singletonList(LLMObsPromptVersionLabel.PRODUCTION))
                            .promptId("customer-support-assistant")
                            .template(
                                new LLMObsPromptTemplate("You are a helpful assistant for .")))
                    .type(LLMObsPromptType.PROMPT_TEMPLATES));

    try {
      LLMObsPromptResponse result = apiInstance.createLLMObsPrompt(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentObservabilityApi#createLLMObsPrompt");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
