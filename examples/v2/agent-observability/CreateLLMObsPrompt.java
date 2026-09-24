// Create an Agent Observability prompt returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsCreatePromptData;
import com.datadog.api.client.v2.model.LLMObsCreatePromptDataAttributes;
import com.datadog.api.client.v2.model.LLMObsCreatePromptRequest;
import com.datadog.api.client.v2.model.LLMObsCreatePromptResponse;
import com.datadog.api.client.v2.model.LLMObsPromptTemplate;
import com.datadog.api.client.v2.model.LLMObsPromptType;
import com.datadog.api.client.v2.model.LLMObsPromptVersionLabel;
import java.util.Collections;
import java.util.Map;

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
                            .config(
                                Map.ofEntries(
                                    Map.entry("model", "provider-model"),
                                    Map.entry("response_format", "{'type': 'json_object'}"),
                                    Map.entry("temperature", "0.2")))
                            .labels(Collections.singletonList(LLMObsPromptVersionLabel.PRODUCTION))
                            .promptId("customer-support-assistant")
                            .template(
                                new LLMObsPromptTemplate("You are a helpful assistant for .")))
                    .type(LLMObsPromptType.PROMPT_TEMPLATES));

    try {
      LLMObsCreatePromptResponse result = apiInstance.createLLMObsPrompt(body);
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
