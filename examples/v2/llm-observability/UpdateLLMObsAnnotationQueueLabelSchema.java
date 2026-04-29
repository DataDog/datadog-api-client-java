// Update annotation queue label schema returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueLabelSchemaResponse;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueLabelSchemaUpdateAttributes;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueLabelSchemaUpdateData;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueLabelSchemaUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueType;
import com.datadog.api.client.v2.model.LLMObsAnnotationSchema;
import com.datadog.api.client.v2.model.LLMObsLabelSchema;
import com.datadog.api.client.v2.model.LLMObsLabelSchemaType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateLLMObsAnnotationQueueLabelSchema", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsAnnotationQueueLabelSchemaUpdateRequest body =
        new LLMObsAnnotationQueueLabelSchemaUpdateRequest()
            .data(
                new LLMObsAnnotationQueueLabelSchemaUpdateData()
                    .attributes(
                        new LLMObsAnnotationQueueLabelSchemaUpdateAttributes()
                            .annotationSchema(
                                new LLMObsAnnotationSchema()
                                    .labelSchemas(
                                        Collections.singletonList(
                                            new LLMObsLabelSchema()
                                                .description("Rating of the response quality.")
                                                .hasAssessment(false)
                                                .hasReasoning(false)
                                                .id("ab12cd34")
                                                .isAssessment(false)
                                                .isInteger(false)
                                                .isRequired(true)
                                                .max(5.0)
                                                .name("quality")
                                                .type(LLMObsLabelSchemaType.SCORE)
                                                .values(Arrays.asList("good", "bad", "neutral"))))))
                    .type(LLMObsAnnotationQueueType.QUEUES));

    try {
      LLMObsAnnotationQueueLabelSchemaResponse result =
          apiInstance.updateLLMObsAnnotationQueueLabelSchema(
              "b5e7f3a1-9c2d-4f8b-a1e6-3d7e9f0a2b4c", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LlmObservabilityApi#updateLLMObsAnnotationQueueLabelSchema");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
