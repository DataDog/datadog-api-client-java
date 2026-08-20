// List Agent Observability prompts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsPromptsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listLLMObsPrompts", true);
    AgentObservabilityApi apiInstance = new AgentObservabilityApi(defaultClient);

    try {
      LLMObsPromptsResponse result = apiInstance.listLLMObsPrompts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentObservabilityApi#listLLMObsPrompts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
