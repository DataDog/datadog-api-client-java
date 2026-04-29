// Get annotation queue label schema returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueLabelSchemaResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getLLMObsAnnotationQueueLabelSchema", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    try {
      LLMObsAnnotationQueueLabelSchemaResponse result =
          apiInstance.getLLMObsAnnotationQueueLabelSchema("b5e7f3a1-9c2d-4f8b-a1e6-3d7e9f0a2b4c");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LlmObservabilityApi#getLLMObsAnnotationQueueLabelSchema");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
