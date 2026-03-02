// Push events for an LLM Observability experiment returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsEventType;
import com.datadog.api.client.v2.model.LLMObsExperimentEventsDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentEventsDataRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentEventsRequest;
import com.datadog.api.client.v2.model.LLMObsExperimentMetric;
import com.datadog.api.client.v2.model.LLMObsExperimentMetricError;
import com.datadog.api.client.v2.model.LLMObsExperimentSpan;
import com.datadog.api.client.v2.model.LLMObsExperimentSpanError;
import com.datadog.api.client.v2.model.LLMObsExperimentSpanMeta;
import com.datadog.api.client.v2.model.LLMObsMetricAssessment;
import com.datadog.api.client.v2.model.LLMObsMetricScoreType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLLMObsExperimentEvents", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsExperimentEventsRequest body =
        new LLMObsExperimentEventsRequest()
            .data(
                new LLMObsExperimentEventsDataRequest()
                    .attributes(
                        new LLMObsExperimentEventsDataAttributesRequest()
                            .metrics(
                                Collections.singletonList(
                                    new LLMObsExperimentMetric()
                                        .assessment(LLMObsMetricAssessment.PASS)
                                        .error(new LLMObsExperimentMetricError())
                                        .label("faithfulness")
                                        .metricType(LLMObsMetricScoreType.SCORE)
                                        .spanId("span-7a1b2c3d")
                                        .timestampMs(1705314600000L)))
                            .spans(
                                Collections.singletonList(
                                    new LLMObsExperimentSpan()
                                        .datasetId("9f64e5c7-dc5a-45c8-a17c-1b85f0bec97d")
                                        .duration(1500000000L)
                                        .meta(
                                            new LLMObsExperimentSpanMeta()
                                                .error(new LLMObsExperimentSpanError())
                                                .input(null)
                                                .output(null))
                                        .name("llm_call")
                                        .projectId("a33671aa-24fd-4dcd-9b33-a8ec7dde7751")
                                        .spanId("span-7a1b2c3d")
                                        .startNs(1705314600000000000L)
                                        .status("ok")
                                        .traceId("abc123def456"))))
                    .type(LLMObsEventType.EVENTS));

    try {
      apiInstance.createLLMObsExperimentEvents("3fd6b5e0-8910-4b1c-a7d0-5b84de329012", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#createLLMObsExperimentEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
