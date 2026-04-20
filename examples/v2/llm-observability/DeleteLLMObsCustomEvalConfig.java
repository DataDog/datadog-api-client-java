// Delete a custom evaluator configuration returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteLLMObsCustomEvalConfig", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    try {
      apiInstance.deleteLLMObsCustomEvalConfig("my-custom-evaluator");
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#deleteLLMObsCustomEvalConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
