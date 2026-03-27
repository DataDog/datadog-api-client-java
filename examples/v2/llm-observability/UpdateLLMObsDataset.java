// Update an LLM Observability dataset returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsDatasetResponse;
import com.datadog.api.client.v2.model.LLMObsDatasetType;
import com.datadog.api.client.v2.model.LLMObsDatasetUpdateDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetUpdateDataRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateLLMObsDataset", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsDatasetUpdateRequest body =
        new LLMObsDatasetUpdateRequest()
            .data(
                new LLMObsDatasetUpdateDataRequest()
                    .attributes(new LLMObsDatasetUpdateDataAttributesRequest())
                    .type(LLMObsDatasetType.DATASETS));

    try {
      LLMObsDatasetResponse result =
          apiInstance.updateLLMObsDataset(
              "a33671aa-24fd-4dcd-9b33-a8ec7dde7751", "9f64e5c7-dc5a-45c8-a17c-1b85f0bec97d", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#updateLLMObsDataset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
