// Delete LLM Observability dataset records returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsDeleteDatasetRecordsDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteDatasetRecordsDataRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteDatasetRecordsRequest;
import com.datadog.api.client.v2.model.LLMObsRecordType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteLLMObsDatasetRecords", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsDeleteDatasetRecordsRequest body =
        new LLMObsDeleteDatasetRecordsRequest()
            .data(
                new LLMObsDeleteDatasetRecordsDataRequest()
                    .attributes(
                        new LLMObsDeleteDatasetRecordsDataAttributesRequest()
                            .recordIds(
                                Collections.singletonList(
                                    "rec-7c3f5a1b-9e2d-4f8a-b1c6-3d7e9f0a2b4c")))
                    .type(LLMObsRecordType.RECORDS));

    try {
      apiInstance.deleteLLMObsDatasetRecords(
          "a33671aa-24fd-4dcd-9b33-a8ec7dde7751", "9f64e5c7-dc5a-45c8-a17c-1b85f0bec97d", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#deleteLLMObsDatasetRecords");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
