// Get an Anthropic Usage and Costs account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AnthropicUsageAndCostsIntegrationApi;
import com.datadog.api.client.v2.model.AnthropicUsageAndCostsIntegrationAccountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.getAnthropicUsageAndCostsIntegrationAccount", true);
    AnthropicUsageAndCostsIntegrationApi apiInstance =
        new AnthropicUsageAndCostsIntegrationApi(defaultClient);

    try {
      AnthropicUsageAndCostsIntegrationAccountResponse result =
          apiInstance.getAnthropicUsageAndCostsIntegrationAccount("account_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " AnthropicUsageAndCostsIntegrationApi#getAnthropicUsageAndCostsIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
