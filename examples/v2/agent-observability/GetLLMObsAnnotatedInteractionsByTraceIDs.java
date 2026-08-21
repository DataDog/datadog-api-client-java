// Get annotated interactions by content IDs returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsAnnotatedInteractionsByTraceResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getLLMObsAnnotatedInteractionsByTraceIDs", true);
    AgentObservabilityApi apiInstance = new AgentObservabilityApi(defaultClient);

    try {
      LLMObsAnnotatedInteractionsByTraceResponse result =
          apiInstance.getLLMObsAnnotatedInteractionsByTraceIDs(
              Collections.singletonList("contentIds"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling AgentObservabilityApi#getLLMObsAnnotatedInteractionsByTraceIDs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
