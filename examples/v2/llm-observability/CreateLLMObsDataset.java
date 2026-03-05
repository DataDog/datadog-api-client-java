// Create an LLM Observability dataset returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsDatasetDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetDataRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetResponse;
import com.datadog.api.client.v2.model.LLMObsDatasetType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLLMObsDataset", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsDatasetRequest body =
        new LLMObsDatasetRequest()
            .data(
                new LLMObsDatasetDataRequest()
                    .attributes(new LLMObsDatasetDataAttributesRequest().name("My LLM Dataset"))
                    .type(LLMObsDatasetType.DATASETS));

    try {
      LLMObsDatasetResponse result =
          apiInstance.createLLMObsDataset("a33671aa-24fd-4dcd-9b33-a8ec7dde7751", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#createLLMObsDataset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
