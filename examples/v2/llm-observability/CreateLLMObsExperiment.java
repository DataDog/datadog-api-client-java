// Create an LLM Observability experiment returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsExperimentDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentDataRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentResponse;
import com.datadog.api.client.v2.model.LLMObsExperimentType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLLMObsExperiment", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsExperimentRequest body =
        new LLMObsExperimentRequest()
            .data(
                new LLMObsExperimentDataRequest()
                    .attributes(
                        new LLMObsExperimentDataAttributesRequest()
                            .datasetId("9f64e5c7-dc5a-45c8-a17c-1b85f0bec97d")
                            .name("My Experiment v1")
                            .projectId("a33671aa-24fd-4dcd-9b33-a8ec7dde7751"))
                    .type(LLMObsExperimentType.EXPERIMENTS));

    try {
      LLMObsExperimentResponse result = apiInstance.createLLMObsExperiment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#createLLMObsExperiment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
