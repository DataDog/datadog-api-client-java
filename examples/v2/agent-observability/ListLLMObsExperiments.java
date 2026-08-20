// List Agent Observability experiments returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsExperimentsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listLLMObsExperiments", true);
    AgentObservabilityApi apiInstance = new AgentObservabilityApi(defaultClient);

    try {
      LLMObsExperimentsResponse result = apiInstance.listLLMObsExperiments();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentObservabilityApi#listLLMObsExperiments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
