// Create a new Agent Observability prompt version returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsCreatePromptVersionData;
import com.datadog.api.client.v2.model.LLMObsCreatePromptVersionDataAttributes;
import com.datadog.api.client.v2.model.LLMObsCreatePromptVersionRequest;
import com.datadog.api.client.v2.model.LLMObsPromptTemplate;
import com.datadog.api.client.v2.model.LLMObsPromptVersionLabel;
import com.datadog.api.client.v2.model.LLMObsPromptVersionResponse;
import com.datadog.api.client.v2.model.LLMObsPromptVersionType;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLLMObsPromptVersion", true);
    AgentObservabilityApi apiInstance = new AgentObservabilityApi(defaultClient);

    LLMObsCreatePromptVersionRequest body =
        new LLMObsCreatePromptVersionRequest()
            .data(
                new LLMObsCreatePromptVersionData()
                    .attributes(
                        new LLMObsCreatePromptVersionDataAttributes()
                            .config(
                                Map.ofEntries(
                                    Map.entry("model", "provider-model"),
                                    Map.entry("response_format", "{'type': 'json_object'}"),
                                    Map.entry("temperature", "0.2")))
                            .labels(Collections.singletonList(LLMObsPromptVersionLabel.PRODUCTION))
                            .template(
                                new LLMObsPromptTemplate("You are a helpful assistant for .")))
                    .type(LLMObsPromptVersionType.PROMPT_TEMPLATE_VERSIONS));

    try {
      LLMObsPromptVersionResponse result =
          apiInstance.createLLMObsPromptVersion("customer-support-assistant", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentObservabilityApi#createLLMObsPromptVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
