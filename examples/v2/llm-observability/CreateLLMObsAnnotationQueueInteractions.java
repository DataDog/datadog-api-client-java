// Add annotation queue interactions returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueInteractionItem;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueInteractionsDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueInteractionsDataRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueInteractionsRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueInteractionsResponse;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueInteractionsType;
import com.datadog.api.client.v2.model.LLMObsInteractionType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLLMObsAnnotationQueueInteractions", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsAnnotationQueueInteractionsRequest body =
        new LLMObsAnnotationQueueInteractionsRequest()
            .data(
                new LLMObsAnnotationQueueInteractionsDataRequest()
                    .attributes(
                        new LLMObsAnnotationQueueInteractionsDataAttributesRequest()
                            .interactions(
                                Collections.singletonList(
                                    new LLMObsAnnotationQueueInteractionItem()
                                        .contentId("trace-abc-123")
                                        .type(LLMObsInteractionType.TRACE))))
                    .type(LLMObsAnnotationQueueInteractionsType.INTERACTIONS));

    try {
      LLMObsAnnotationQueueInteractionsResponse result =
          apiInstance.createLLMObsAnnotationQueueInteractions(
              "00000000-0000-0000-0000-000000000001", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LlmObservabilityApi#createLLMObsAnnotationQueueInteractions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
