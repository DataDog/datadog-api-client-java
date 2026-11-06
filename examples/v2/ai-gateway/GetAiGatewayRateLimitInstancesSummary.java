// Get an AI Gateway rate limit counter summary returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayRateLimitInstancesSummaryResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getAiGatewayRateLimitInstancesSummary", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    try {
      AiGatewayRateLimitInstancesSummaryResponse result =
          apiInstance.getAiGatewayRateLimitInstancesSummary(
              UUID.fromString("33333333-3333-3333-3333-333333333333"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling AiGatewayApi#getAiGatewayRateLimitInstancesSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
