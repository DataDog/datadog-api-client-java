// Search LLM Observability experimentation entities returns "Partial Content — more results are
// available. Use
// `meta.after` as the next `page.cursor`." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsExperimentationContentPreview;
import com.datadog.api.client.v2.model.LLMObsExperimentationCursorPage;
import com.datadog.api.client.v2.model.LLMObsExperimentationFilter;
import com.datadog.api.client.v2.model.LLMObsExperimentationInclude;
import com.datadog.api.client.v2.model.LLMObsExperimentationSearchDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentationSearchDataRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentationSearchRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentationSearchResponse;
import com.datadog.api.client.v2.model.LLMObsExperimentationType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.searchLLMObsExperimentation", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsExperimentationSearchRequest body =
        new LLMObsExperimentationSearchRequest()
            .data(
                new LLMObsExperimentationSearchDataRequest()
                    .attributes(
                        new LLMObsExperimentationSearchDataAttributesRequest()
                            .contentPreview(new LLMObsExperimentationContentPreview().limit(500L))
                            .filter(
                                new LLMObsExperimentationFilter()
                                    .includeDeleted(false)
                                    .isDeleted(false)
                                    .query("my experiment")
                                    .scope(Collections.singletonList("experiments"))
                                    .version(null))
                            .include(new LLMObsExperimentationInclude().userData(false))
                            .page(new LLMObsExperimentationCursorPage().limit(100L)))
                    .type(LLMObsExperimentationType.EXPERIMENTATION));

    try {
      LLMObsExperimentationSearchResponse result = apiInstance.searchLLMObsExperimentation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#searchLLMObsExperimentation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
