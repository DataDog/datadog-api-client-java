// Create or update a RUM rate limit configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRateLimitApi;
import com.datadog.api.client.v2.model.RumRateLimitAdaptiveConfig;
import com.datadog.api.client.v2.model.RumRateLimitConfigResponse;
import com.datadog.api.client.v2.model.RumRateLimitConfigType;
import com.datadog.api.client.v2.model.RumRateLimitConfigUpdateAttributes;
import com.datadog.api.client.v2.model.RumRateLimitConfigUpdateData;
import com.datadog.api.client.v2.model.RumRateLimitConfigUpdateRequest;
import com.datadog.api.client.v2.model.RumRateLimitCustomConfig;
import com.datadog.api.client.v2.model.RumRateLimitMode;
import com.datadog.api.client.v2.model.RumRateLimitQuotaReachedAction;
import com.datadog.api.client.v2.model.RumRateLimitScopeType;
import com.datadog.api.client.v2.model.RumRateLimitWindowType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateRumRateLimitConfig", true);
    RumRateLimitApi apiInstance = new RumRateLimitApi(defaultClient);

    RumRateLimitConfigUpdateRequest body =
        new RumRateLimitConfigUpdateRequest()
            .data(
                new RumRateLimitConfigUpdateData()
                    .attributes(
                        new RumRateLimitConfigUpdateAttributes()
                            .adaptive(new RumRateLimitAdaptiveConfig().maxRetentionRate(0.5))
                            .custom(
                                new RumRateLimitCustomConfig()
                                    .dailyResetTime("08:00")
                                    .dailyResetTimezone("+09:00")
                                    .quotaReachedAction(RumRateLimitQuotaReachedAction.STOP)
                                    .sessionLimit(1000000L)
                                    .windowType(RumRateLimitWindowType.DAILY))
                            .mode(RumRateLimitMode.CUSTOM))
                    .id("cd73a516-a481-4af5-8352-9b577465c77b")
                    .type(RumRateLimitConfigType.RUM_RATE_LIMIT_CONFIG));

    try {
      RumRateLimitConfigResponse result =
          apiInstance.updateRumRateLimitConfig(
              RumRateLimitScopeType.APPLICATION, "cd73a516-a481-4af5-8352-9b577465c77b", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRateLimitApi#updateRumRateLimitConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
