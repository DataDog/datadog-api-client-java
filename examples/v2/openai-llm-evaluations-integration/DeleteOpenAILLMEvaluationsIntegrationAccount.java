// Delete an OpenAI LLM Evaluations account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpenAillmEvaluationsIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.deleteOpenAILLMEvaluationsIntegrationAccount", true);
    OpenAillmEvaluationsIntegrationApi apiInstance =
        new OpenAillmEvaluationsIntegrationApi(defaultClient);

    try {
      apiInstance.deleteOpenAILLMEvaluationsIntegrationAccount("account_id");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OpenAillmEvaluationsIntegrationApi#deleteOpenAILLMEvaluationsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
