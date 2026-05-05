// Create an LLM Observability annotation queue returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueDataRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueResponse;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueType;
import com.datadog.api.client.v2.model.LLMObsAnnotationSchema;
import com.datadog.api.client.v2.model.LLMObsLabelSchema;
import com.datadog.api.client.v2.model.LLMObsLabelSchemaType;
import java.util.Arrays;
import java.util.Collections;

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
                            .annotationSchema(
                                new LLMObsAnnotationSchema()
                                    .labelSchemas(
                                        Collections.singletonList(
                                            new LLMObsLabelSchema()
                                                .description("Rating of the response quality.")
                                                .hasAssessment(false)
                                                .hasReasoning(false)
                                                .id("abc-123")
                                                .isAssessment(false)
                                                .isInteger(false)
                                                .isRequired(true)
                                                .max(5.0)
                                                .name("quality")
                                                .type(LLMObsLabelSchemaType.SCORE)
                                                .values(Arrays.asList("good", "bad", "neutral")))))
                            .description("Queue for annotating customer support traces")
                            .name("My annotation queue")
                            .projectId("00000000-0000-0000-0000-000000000002"))
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
