// List Anthropic Usage and Costs accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AnthropicUsageAndCostsIntegrationApi;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.listAnthropicUsageAndCostsIntegrationAccounts", true);
    AnthropicUsageAndCostsIntegrationApi apiInstance =
        new AnthropicUsageAndCostsIntegrationApi(defaultClient);

    try {
      AnthropicUsageAndCostsIntegrationAccountsResponse result =
          apiInstance.listAnthropicUsageAndCostsIntegrationAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " AnthropicUsageAndCostsIntegrationApi#listAnthropicUsageAndCostsIntegrationAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
