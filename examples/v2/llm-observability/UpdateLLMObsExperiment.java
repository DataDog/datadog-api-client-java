// Update an LLM Observability experiment returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsExperimentResponse;
import com.datadog.api.client.v2.model.LLMObsExperimentStatus;
import com.datadog.api.client.v2.model.LLMObsExperimentType;
import com.datadog.api.client.v2.model.LLMObsExperimentUpdateDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentUpdateDataRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateLLMObsExperiment", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsExperimentUpdateRequest body =
        new LLMObsExperimentUpdateRequest()
            .data(
                new LLMObsExperimentUpdateDataRequest()
                    .attributes(
                        new LLMObsExperimentUpdateDataAttributesRequest()
                            .datasetId("9f64e5c7-dc5a-45c8-a17c-1b85f0bec97d")
                            .status(LLMObsExperimentStatus.COMPLETED))
                    .type(LLMObsExperimentType.EXPERIMENTS));

    try {
      LLMObsExperimentResponse result =
          apiInstance.updateLLMObsExperiment("3fd6b5e0-8910-4b1c-a7d0-5b84de329012", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#updateLLMObsExperiment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
