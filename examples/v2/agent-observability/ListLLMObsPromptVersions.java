// List versions of an Agent Observability prompt returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsPromptVersionsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listLLMObsPromptVersions", true);
    AgentObservabilityApi apiInstance = new AgentObservabilityApi(defaultClient);

    try {
      LLMObsPromptVersionsResponse result =
          apiInstance.listLLMObsPromptVersions("customer-support-assistant");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentObservabilityApi#listLLMObsPromptVersions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
