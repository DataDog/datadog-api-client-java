// Restore an LLM Observability dataset version returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsDatasetRestoreVersionDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetRestoreVersionDataRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetRestoreVersionRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.restoreLLMObsDatasetVersion", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsDatasetRestoreVersionRequest body =
        new LLMObsDatasetRestoreVersionRequest()
            .data(
                new LLMObsDatasetRestoreVersionDataRequest()
                    .attributes(
                        new LLMObsDatasetRestoreVersionDataAttributesRequest().datasetVersion(1))
                    .id("9f64e5c7-dc5a-45c8-a17c-1b85f0bec97d")
                    .type(LLMObsDatasetType.DATASETS));

    try {
      apiInstance.restoreLLMObsDatasetVersion(
          "a33671aa-24fd-4dcd-9b33-a8ec7dde7751", "9f64e5c7-dc5a-45c8-a17c-1b85f0bec97d", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#restoreLLMObsDatasetVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
