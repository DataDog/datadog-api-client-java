// Create an LLM Observability annotation queue returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueDataRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueResponse;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLLMObsAnnotationQueue", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsAnnotationQueueRequest body =
        new LLMObsAnnotationQueueRequest()
            .data(
                new LLMObsAnnotationQueueDataRequest()
                    .attributes(
                        new LLMObsAnnotationQueueDataAttributesRequest()
                            .description("Queue for annotating customer support traces")
                            .name("My annotation queue")
                            .projectId("a33671aa-24fd-4dcd-9b33-a8ec7dde7751"))
                    .type(LLMObsAnnotationQueueType.QUEUES));

    try {
      LLMObsAnnotationQueueResponse result = apiInstance.createLLMObsAnnotationQueue(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#createLLMObsAnnotationQueue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
