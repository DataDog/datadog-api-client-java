// Get an OpenAI LLM Evaluations account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpenAillmEvaluationsIntegrationApi;
import com.datadog.api.client.v2.model.OpenAILLMEvaluationsIntegrationAccountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getOpenAILLMEvaluationsIntegrationAccount", true);
    OpenAillmEvaluationsIntegrationApi apiInstance =
        new OpenAillmEvaluationsIntegrationApi(defaultClient);

    try {
      OpenAILLMEvaluationsIntegrationAccountResponse result =
          apiInstance.getOpenAILLMEvaluationsIntegrationAccount("account_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OpenAillmEvaluationsIntegrationApi#getOpenAILLMEvaluationsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
