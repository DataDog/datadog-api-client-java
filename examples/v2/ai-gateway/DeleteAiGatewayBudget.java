// Archive an AI Gateway budget returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteAiGatewayBudget", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    try {
      apiInstance.deleteAiGatewayBudget(UUID.fromString("11111111-1111-1111-1111-111111111111"));
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#deleteAiGatewayBudget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
