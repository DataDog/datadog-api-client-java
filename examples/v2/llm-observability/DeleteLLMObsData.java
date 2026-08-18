// Delete LLM Observability data returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsDataDeletionRequest;
import com.datadog.api.client.v2.model.LLMObsDataDeletionRequestAttributes;
import com.datadog.api.client.v2.model.LLMObsDataDeletionRequestData;
import com.datadog.api.client.v2.model.LLMObsDataDeletionRequestType;
import com.datadog.api.client.v2.model.LLMObsDataDeletionResponse;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteLLMObsData", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsDataDeletionRequest body =
        new LLMObsDataDeletionRequest()
            .data(
                new LLMObsDataDeletionRequestData()
                    .attributes(
                        new LLMObsDataDeletionRequestAttributes()
                            .delay(0L)
                            .from(1705314600000L)
                            .query(Map.ofEntries(Map.entry("query", "@trace_id:abc123def456")))
                            .to(1705315200000L))
                    .type(LLMObsDataDeletionRequestType.CREATE_DELETION_REQ));

    try {
      LLMObsDataDeletionResponse result = apiInstance.deleteLLMObsData(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#deleteLLMObsData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
