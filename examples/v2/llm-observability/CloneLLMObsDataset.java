// Clone an LLM Observability dataset returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsDatasetCloneDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetCloneDataRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetCloneRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetResponse;
import com.datadog.api.client.v2.model.LLMObsDatasetType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.cloneLLMObsDataset", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsDatasetCloneRequest body =
        new LLMObsDatasetCloneRequest()
            .data(
                new LLMObsDatasetCloneDataRequest()
                    .attributes(
                        new LLMObsDatasetCloneDataAttributesRequest()
                            .description("Clone of the original dataset for experimentation.")
                            .name("My cloned dataset"))
                    .id("9f64e5c7-dc5a-45c8-a17c-1b85f0bec97d")
                    .type(LLMObsDatasetType.DATASETS));

    try {
      LLMObsDatasetResponse result =
          apiInstance.cloneLLMObsDataset(
              "a33671aa-24fd-4dcd-9b33-a8ec7dde7751", "9f64e5c7-dc5a-45c8-a17c-1b85f0bec97d", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#cloneLLMObsDataset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
