// Simple search experimentation entities returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsExperimentationContentPreview;
import com.datadog.api.client.v2.model.LLMObsExperimentationFilter;
import com.datadog.api.client.v2.model.LLMObsExperimentationInclude;
import com.datadog.api.client.v2.model.LLMObsExperimentationNumberPage;
import com.datadog.api.client.v2.model.LLMObsExperimentationSimpleSearchDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentationSimpleSearchDataRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentationSimpleSearchRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentationSimpleSearchResponse;
import com.datadog.api.client.v2.model.LLMObsExperimentationSortField;
import com.datadog.api.client.v2.model.LLMObsExperimentationSortFieldDirection;
import com.datadog.api.client.v2.model.LLMObsExperimentationType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.simpleSearchLLMObsExperimentation", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsExperimentationSimpleSearchRequest body =
        new LLMObsExperimentationSimpleSearchRequest()
            .data(
                new LLMObsExperimentationSimpleSearchDataRequest()
                    .attributes(
                        new LLMObsExperimentationSimpleSearchDataAttributesRequest()
                            .contentPreview(new LLMObsExperimentationContentPreview().limit(500L))
                            .filter(
                                new LLMObsExperimentationFilter()
                                    .includeDeleted(false)
                                    .isDeleted(false)
                                    .query("my experiment")
                                    .scope(Collections.singletonList("experiments"))
                                    .version(null))
                            .include(new LLMObsExperimentationInclude().userData(false))
                            .page(new LLMObsExperimentationNumberPage().limit(50).number(1))
                            .sort(
                                Collections.singletonList(
                                    new LLMObsExperimentationSortField()
                                        .direction(LLMObsExperimentationSortFieldDirection.DESC)
                                        .field("created_at"))))
                    .type(LLMObsExperimentationType.EXPERIMENTATION));

    try {
      LLMObsExperimentationSimpleSearchResponse result =
          apiInstance.simpleSearchLLMObsExperimentation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LlmObservabilityApi#simpleSearchLLMObsExperimentation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
