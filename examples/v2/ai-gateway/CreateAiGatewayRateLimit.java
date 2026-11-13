// Create an AI Gateway rate limit returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGatewayApi;
import com.datadog.api.client.v2.model.AiGatewayRateLimitCreateAttributes;
import com.datadog.api.client.v2.model.AiGatewayRateLimitCreateData;
import com.datadog.api.client.v2.model.AiGatewayRateLimitCreateRequest;
import com.datadog.api.client.v2.model.AiGatewayRateLimitMode;
import com.datadog.api.client.v2.model.AiGatewayRateLimitResponse;
import com.datadog.api.client.v2.model.AiGatewayRateLimitSelectorEntry;
import com.datadog.api.client.v2.model.AiGatewayRateLimitType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createAiGatewayRateLimit", true);
    AiGatewayApi apiInstance = new AiGatewayApi(defaultClient);

    AiGatewayRateLimitCreateRequest body =
        new AiGatewayRateLimitCreateRequest()
            .data(
                new AiGatewayRateLimitCreateData()
                    .attributes(
                        new AiGatewayRateLimitCreateAttributes()
                            .costMicrocentsPerMinute(100000000L)
                            .inputTokensPerMinute(null)
                            .mode(AiGatewayRateLimitMode.ALERT)
                            .name("Default rate limit")
                            .outputTokensPerMinute(null)
                            .requestsPerMinute(600L)
                            .selector(
                                Collections.singletonList(
                                    new AiGatewayRateLimitSelectorEntry()
                                        .dim("user_id")
                                        .perValue(true)
                                        .values(
                                            Collections.singletonList(
                                                "11111111-1111-1111-1111-111111111111"))))
                            .teamId(UUID.fromString("00000000-0000-4000-8000-000000000002"))
                            .userId(UUID.fromString("00000000-0000-4000-8000-000000000001")))
                    .type(AiGatewayRateLimitType.RATE_LIMITS));

    try {
      AiGatewayRateLimitResponse result = apiInstance.createAiGatewayRateLimit(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGatewayApi#createAiGatewayRateLimit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
