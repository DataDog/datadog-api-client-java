// List patterns runs returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsPatternsRunsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listLLMObsPatternsRuns", true);
    AgentObservabilityApi apiInstance = new AgentObservabilityApi(defaultClient);

    try {
      LLMObsPatternsRunsResponse result =
          apiInstance.listLLMObsPatternsRuns("a7c8d9e0-1234-5678-9abc-def012345678");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentObservabilityApi#listLLMObsPatternsRuns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
