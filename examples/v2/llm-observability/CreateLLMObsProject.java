// Create an LLM Observability project returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsProjectDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsProjectDataRequest;
import com.datadog.api.client.v2.model.LLMObsProjectRequest;
import com.datadog.api.client.v2.model.LLMObsProjectResponse;
import com.datadog.api.client.v2.model.LLMObsProjectType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLLMObsProject", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsProjectRequest body =
        new LLMObsProjectRequest()
            .data(
                new LLMObsProjectDataRequest()
                    .attributes(new LLMObsProjectDataAttributesRequest().name("My LLM Project"))
                    .type(LLMObsProjectType.PROJECTS));

    try {
      LLMObsProjectResponse result = apiInstance.createLLMObsProject(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#createLLMObsProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
