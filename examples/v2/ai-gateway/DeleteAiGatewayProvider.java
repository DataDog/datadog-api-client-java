// Delete an AI Gateway provider returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteAiGatewayProvider", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    try {
      apiInstance.deleteAiGatewayProvider(42L);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#deleteAiGatewayProvider");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
