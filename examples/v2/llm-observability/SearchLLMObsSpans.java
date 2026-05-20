// Search LLM Observability spans returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsSearchSpansRequest;
import com.datadog.api.client.v2.model.LLMObsSearchSpansRequestAttributes;
import com.datadog.api.client.v2.model.LLMObsSearchSpansRequestData;
import com.datadog.api.client.v2.model.LLMObsSearchSpansRequestType;
import com.datadog.api.client.v2.model.LLMObsSpanFilter;
import com.datadog.api.client.v2.model.LLMObsSpanPageQuery;
import com.datadog.api.client.v2.model.LLMObsSpanSearchOptions;
import com.datadog.api.client.v2.model.LLMObsSpansResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.searchLLMObsSpans", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsSearchSpansRequest body =
        new LLMObsSearchSpansRequest()
            .data(
                new LLMObsSearchSpansRequestData()
                    .attributes(
                        new LLMObsSearchSpansRequestAttributes()
                            .filter(
                                new LLMObsSpanFilter()
                                    .from("now-900s")
                                    .mlApp("my-llm-app")
                                    .query("@session_id:abc123def456")
                                    .spanId("abc123def456")
                                    .spanKind("llm")
                                    .spanName("llm_call")
                                    .to("now")
                                    .traceId("trace-9a8b7c6d5e4f"))
                            .options(
                                new LLMObsSpanSearchOptions()
                                    .includeAttachments(true)
                                    .timeOffset(0L))
                            .page(
                                new LLMObsSpanPageQuery().cursor("eyJzdGFydCI6MTAwfQ==").limit(10L))
                            .sort("-start_ns"))
                    .type(LLMObsSearchSpansRequestType.SPANS));

    try {
      LLMObsSpansResponse result = apiInstance.searchLLMObsSpans(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#searchLLMObsSpans");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
