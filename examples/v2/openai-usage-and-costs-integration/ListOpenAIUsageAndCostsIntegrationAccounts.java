// List OpenAI Usage and Costs accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OpenAiUsageAndCostsIntegrationApi;
import com.datadog.api.client.v2.model.OpenAIUsageAndCostsIntegrationAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.listOpenAIUsageAndCostsIntegrationAccounts", true);
    OpenAiUsageAndCostsIntegrationApi apiInstance =
        new OpenAiUsageAndCostsIntegrationApi(defaultClient);

    try {
      OpenAIUsageAndCostsIntegrationAccountsResponse result =
          apiInstance.listOpenAIUsageAndCostsIntegrationAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OpenAiUsageAndCostsIntegrationApi#listOpenAIUsageAndCostsIntegrationAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
