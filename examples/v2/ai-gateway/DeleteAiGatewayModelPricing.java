// Delete a model pricing override returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteAiGatewayModelPricing", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    try {
      apiInstance.deleteAiGatewayModelPricing(42L, "gpt-5.2-codex");
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#deleteAiGatewayModelPricing");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
