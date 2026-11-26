// List OpenAI Model Inference accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpenAiModelInferenceIntegrationApi;
import com.datadog.api.client.v2.model.OpenAIModelInferenceIntegrationAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.listOpenAIModelInferenceIntegrationAccounts", true);
    OpenAiModelInferenceIntegrationApi apiInstance =
        new OpenAiModelInferenceIntegrationApi(defaultClient);

    try {
      OpenAIModelInferenceIntegrationAccountsResponse result =
          apiInstance.listOpenAIModelInferenceIntegrationAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OpenAiModelInferenceIntegrationApi#listOpenAIModelInferenceIntegrationAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
