// Delete an AI Gateway routing rule returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteAiGatewayRoutingRule", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    try {
      apiInstance.deleteAiGatewayRoutingRule("coding");
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#deleteAiGatewayRoutingRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
