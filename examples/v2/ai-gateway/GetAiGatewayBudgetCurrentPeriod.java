// Get an AI Gateway budget's current period returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayBudgetPeriodResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getAiGatewayBudgetCurrentPeriod", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    try {
      AiGatewayBudgetPeriodResponse result =
          apiInstance.getAiGatewayBudgetCurrentPeriod(
              UUID.fromString("11111111-1111-1111-1111-111111111111"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#getAiGatewayBudgetCurrentPeriod");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
