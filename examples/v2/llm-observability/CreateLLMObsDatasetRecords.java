// Append records to an LLM Observability dataset returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordItem;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsDataRequest;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsMutationResponse;
import com.datadog.api.client.v2.model.LLMObsDatasetRecordsRequest;
import com.datadog.api.client.v2.model.LLMObsRecordType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLLMObsDatasetRecords", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsDatasetRecordsRequest body =
        new LLMObsDatasetRecordsRequest()
            .data(
                new LLMObsDatasetRecordsDataRequest()
                    .attributes(
                        new LLMObsDatasetRecordsDataAttributesRequest()
                            .records(
                                Collections.singletonList(
                                    new LLMObsDatasetRecordItem()
                                        .expectedOutput(null)
                                        .input(null))))
                    .type(LLMObsRecordType.RECORDS));

    try {
      LLMObsDatasetRecordsMutationResponse result =
          apiInstance.createLLMObsDatasetRecords(
              "a33671aa-24fd-4dcd-9b33-a8ec7dde7751", "9f64e5c7-dc5a-45c8-a17c-1b85f0bec97d", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#createLLMObsDatasetRecords");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
