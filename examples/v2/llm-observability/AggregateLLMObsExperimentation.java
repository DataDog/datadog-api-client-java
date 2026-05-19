// Aggregate LLM Observability experimentation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsExperimentationAnalyticsAggregate;
import com.datadog.api.client.v2.model.LLMObsExperimentationAnalyticsCompute;
import com.datadog.api.client.v2.model.LLMObsExperimentationAnalyticsDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentationAnalyticsDataRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentationAnalyticsGroupBy;
import com.datadog.api.client.v2.model.LLMObsExperimentationAnalyticsRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentationAnalyticsResponse;
import com.datadog.api.client.v2.model.LLMObsExperimentationAnalyticsSearch;
import com.datadog.api.client.v2.model.LLMObsExperimentationAnalyticsTimeRange;
import com.datadog.api.client.v2.model.LLMObsExperimentationType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.aggregateLLMObsExperimentation", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsExperimentationAnalyticsRequest body =
        new LLMObsExperimentationAnalyticsRequest()
            .data(
                new LLMObsExperimentationAnalyticsDataRequest()
                    .attributes(
                        new LLMObsExperimentationAnalyticsDataAttributesRequest()
                            .aggregate(
                                new LLMObsExperimentationAnalyticsAggregate()
                                    .compute(
                                        Collections.singletonList(
                                            new LLMObsExperimentationAnalyticsCompute()
                                                .metric("score_value")
                                                .name("avg_faithfulness")))
                                    .datasetVersion(null)
                                    .groupBy(
                                        Collections.singletonList(
                                            new LLMObsExperimentationAnalyticsGroupBy()
                                                .field("span_id")))
                                    .indexes(Collections.singletonList("experiment-evals"))
                                    .limit(1000)
                                    .search(
                                        new LLMObsExperimentationAnalyticsSearch()
                                            .query(
                                                "@experiment_id:3fd6b5e0-8910-4b1c-a7d0-5b84de329012"))
                                    .time(
                                        new LLMObsExperimentationAnalyticsTimeRange()
                                            .from(1705312200000L)
                                            .to(1705315800000L))))
                    .type(LLMObsExperimentationType.EXPERIMENTATION));

    try {
      LLMObsExperimentationAnalyticsResponse result =
          apiInstance.aggregateLLMObsExperimentation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LlmObservabilityApi#aggregateLLMObsExperimentation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
