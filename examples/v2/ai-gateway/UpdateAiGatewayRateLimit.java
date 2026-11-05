// Update an AI Gateway rate limit returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayRateLimitMode;
import com.datadog.api.client.v2.model.AiGatewayRateLimitResponse;
import com.datadog.api.client.v2.model.AiGatewayRateLimitType;
import com.datadog.api.client.v2.model.AiGatewayRateLimitUpdateAttributes;
import com.datadog.api.client.v2.model.AiGatewayRateLimitUpdateData;
import com.datadog.api.client.v2.model.AiGatewayRateLimitUpdateRequest;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateAiGatewayRateLimit", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayRateLimitUpdateRequest body =
        new AiGatewayRateLimitUpdateRequest()
            .data(
                new AiGatewayRateLimitUpdateData()
                    .attributes(
                        new AiGatewayRateLimitUpdateAttributes()
                            .inputTokensPerMinute(null)
                            .mode(AiGatewayRateLimitMode.ALERT)
                            .outputTokensPerMinute(null)
                            .requestsPerMinute(null)
                            .tags(null)
                            .teamId(null)
                            .userId(null))
                    .id(UUID.fromString("11111111-1111-1111-1111-111111111111"))
                    .type(AiGatewayRateLimitType.RATE_LIMITS));

    try {
      AiGatewayRateLimitResponse result =
          apiInstance.updateAiGatewayRateLimit(
              UUID.fromString("33333333-3333-3333-3333-333333333333"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#updateAiGatewayRateLimit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
