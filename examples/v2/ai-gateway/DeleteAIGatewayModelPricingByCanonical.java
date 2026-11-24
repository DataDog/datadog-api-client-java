// Delete a model pricing override by canonical ID returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteAIGatewayModelPricingByCanonical", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    try {
      apiInstance.deleteAIGatewayModelPricingByCanonical(42L, "openai/gpt-4o");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling AiGatewayApi#deleteAIGatewayModelPricingByCanonical");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
