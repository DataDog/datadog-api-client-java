// Delete annotation queue interactions returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsAnnotationQueueInteractionsType;
import com.datadog.api.client.v2.model.LLMObsDeleteAnnotationQueueInteractionsDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteAnnotationQueueInteractionsDataRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteAnnotationQueueInteractionsRequest;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteLLMObsAnnotationQueueInteractions", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsDeleteAnnotationQueueInteractionsRequest body =
        new LLMObsDeleteAnnotationQueueInteractionsRequest()
            .data(
                new LLMObsDeleteAnnotationQueueInteractionsDataRequest()
                    .attributes(
                        new LLMObsDeleteAnnotationQueueInteractionsDataAttributesRequest()
                            .interactionIds(
                                Arrays.asList(
                                    "00000000-0000-0000-0000-000000000000",
                                    "00000000-0000-0000-0000-000000000001")))
                    .type(LLMObsAnnotationQueueInteractionsType.INTERACTIONS));

    try {
      apiInstance.deleteLLMObsAnnotationQueueInteractions(
          "00000000-0000-0000-0000-000000000001", body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LlmObservabilityApi#deleteLLMObsAnnotationQueueInteractions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
