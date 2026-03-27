// Delete LLM Observability experiments returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsDeleteExperimentsDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteExperimentsDataRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteExperimentsRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteLLMObsExperiments", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsDeleteExperimentsRequest body =
        new LLMObsDeleteExperimentsRequest()
            .data(
                new LLMObsDeleteExperimentsDataRequest()
                    .attributes(
                        new LLMObsDeleteExperimentsDataAttributesRequest()
                            .experimentIds(
                                Collections.singletonList("3fd6b5e0-8910-4b1c-a7d0-5b84de329012")))
                    .type(LLMObsExperimentType.EXPERIMENTS));

    try {
      apiInstance.deleteLLMObsExperiments(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#deleteLLMObsExperiments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
