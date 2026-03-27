// Delete LLM Observability datasets returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsDatasetType;
import com.datadog.api.client.v2.model.LLMObsDeleteDatasetsDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteDatasetsDataRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteDatasetsRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteLLMObsDatasets", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsDeleteDatasetsRequest body =
        new LLMObsDeleteDatasetsRequest()
            .data(
                new LLMObsDeleteDatasetsDataRequest()
                    .attributes(
                        new LLMObsDeleteDatasetsDataAttributesRequest()
                            .datasetIds(
                                Collections.singletonList("9f64e5c7-dc5a-45c8-a17c-1b85f0bec97d")))
                    .type(LLMObsDatasetType.DATASETS));

    try {
      apiInstance.deleteLLMObsDatasets("a33671aa-24fd-4dcd-9b33-a8ec7dde7751", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#deleteLLMObsDatasets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
