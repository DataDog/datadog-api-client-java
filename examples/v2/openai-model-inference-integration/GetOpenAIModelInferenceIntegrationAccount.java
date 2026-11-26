// Get an OpenAI Model Inference account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpenAiModelInferenceIntegrationApi;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getOpenAIModelInferenceIntegrationAccount", true);
    OpenAiModelInferenceIntegrationApi apiInstance =
        new OpenAiModelInferenceIntegrationApi(defaultClient);

    try {
      OpenAIModelInferenceIntegrationAccountResponse result =
          apiInstance.getOpenAIModelInferenceIntegrationAccount("account_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OpenAiModelInferenceIntegrationApi#getOpenAIModelInferenceIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
