// Get an annotated queue interaction returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.AgentObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsAnnotatedInteractionEvent;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getLLMObsAnnotatedInteraction", true);
    AgentObservabilityApi apiInstance = new AgentObservabilityApi(defaultClient);

    try {
      PaginationIterable<LLMObsAnnotatedInteractionEvent> iterable =
          apiInstance.getLLMObsAnnotatedInteractionWithPagination(
              "00000000-0000-0000-0000-000000000001", "interaction-456");

      for (LLMObsAnnotatedInteractionEvent item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling"
              + " AgentObservabilityApi#getLLMObsAnnotatedInteractionWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
