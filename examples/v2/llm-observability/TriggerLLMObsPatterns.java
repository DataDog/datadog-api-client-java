// Trigger a patterns run returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsPatternsRequestType;
import com.datadog.api.client.v2.model.LLMObsPatternsTriggerRequest;
import com.datadog.api.client.v2.model.LLMObsPatternsTriggerRequestAttributes;
import com.datadog.api.client.v2.model.LLMObsPatternsTriggerRequestData;
import com.datadog.api.client.v2.model.LLMObsPatternsTriggerResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.triggerLLMObsPatterns", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsPatternsTriggerRequest body =
        new LLMObsPatternsTriggerRequest()
            .data(
                new LLMObsPatternsTriggerRequestData()
                    .attributes(
                        new LLMObsPatternsTriggerRequestAttributes()
                            .configId("a7c8d9e0-1234-5678-9abc-def012345678"))
                    .type(LLMObsPatternsRequestType.TOPIC_DISCOVERY));

    try {
      LLMObsPatternsTriggerResponse result = apiInstance.triggerLLMObsPatterns(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#triggerLLMObsPatterns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
