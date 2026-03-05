// Update an LLM Observability project returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsProjectResponse;
import com.datadog.api.client.v2.model.LLMObsProjectType;
import com.datadog.api.client.v2.model.LLMObsProjectUpdateDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsProjectUpdateDataRequest;
import com.datadog.api.client.v2.model.LLMObsProjectUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateLLMObsProject", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsProjectUpdateRequest body =
        new LLMObsProjectUpdateRequest()
            .data(
                new LLMObsProjectUpdateDataRequest()
                    .attributes(new LLMObsProjectUpdateDataAttributesRequest())
                    .type(LLMObsProjectType.PROJECTS));

    try {
      LLMObsProjectResponse result =
          apiInstance.updateLLMObsProject("a33671aa-24fd-4dcd-9b33-a8ec7dde7751", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#updateLLMObsProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
