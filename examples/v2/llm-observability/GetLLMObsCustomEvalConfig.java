// Get a custom evaluator configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsCustomEvalConfigResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getLLMObsCustomEvalConfig", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    try {
      LLMObsCustomEvalConfigResponse result =
          apiInstance.getLLMObsCustomEvalConfig("my-custom-evaluator");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#getLLMObsCustomEvalConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
