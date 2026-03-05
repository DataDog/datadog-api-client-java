// Update LLM Observability dataset records returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordUpdateItem;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsMutationResponse;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsUpdateDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsUpdateDataRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsUpdateRequest;
import com.datadog.api.client.v2.model.LLMObsRecordType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateLLMObsDatasetRecords", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsDatasetRecordsUpdateRequest body =
        new LLMObsDatasetRecordsUpdateRequest()
            .data(
                new LLMObsDatasetRecordsUpdateDataRequest()
                    .attributes(
                        new LLMObsDatasetRecordsUpdateDataAttributesRequest()
                            .records(
                                Collections.singletonList(
                                    new LLMObsDatasetRecordUpdateItem()
                                        .expectedOutput(null)
                                        .id("rec-7c3f5a1b-9e2d-4f8a-b1c6-3d7e9f0a2b4c")
                                        .input(null))))
                    .type(LLMObsRecordType.RECORDS));

    try {
      LLMObsDatasetRecordsMutationResponse result =
          apiInstance.updateLLMObsDatasetRecords(
              "a33671aa-24fd-4dcd-9b33-a8ec7dde7751", "9f64e5c7-dc5a-45c8-a17c-1b85f0bec97d", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#updateLLMObsDatasetRecords");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
