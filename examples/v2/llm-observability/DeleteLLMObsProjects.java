// Delete LLM Observability projects returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsDeleteProjectsDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteProjectsDataRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteProjectsRequest;
import com.datadog.api.client.v2.model.LLMObsProjectType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteLLMObsProjects", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsDeleteProjectsRequest body =
        new LLMObsDeleteProjectsRequest()
            .data(
                new LLMObsDeleteProjectsDataRequest()
                    .attributes(
                        new LLMObsDeleteProjectsDataAttributesRequest()
                            .projectIds(
                                Collections.singletonList("a33671aa-24fd-4dcd-9b33-a8ec7dde7751")))
                    .type(LLMObsProjectType.PROJECTS));

    try {
      apiInstance.deleteLLMObsProjects(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#deleteLLMObsProjects");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
