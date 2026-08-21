// Create or update a RUM retention quota config returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionQuotasApi;
import com.datadog.api.client.v2.model.RumRetentionQuotaConfigResponse;
import com.datadog.api.client.v2.model.RumRetentionQuotaConfigType;
import com.datadog.api.client.v2.model.RumRetentionQuotaConfigUpdateAttributes;
import com.datadog.api.client.v2.model.RumRetentionQuotaConfigUpdateData;
import com.datadog.api.client.v2.model.RumRetentionQuotaConfigUpdateRequest;
import com.datadog.api.client.v2.model.RumRetentionQuotaCustomConfig;
import com.datadog.api.client.v2.model.RumRetentionQuotaMode;
import com.datadog.api.client.v2.model.RumRetentionQuotaReachedAction;
import com.datadog.api.client.v2.model.RumRetentionQuotaScopeType;
import com.datadog.api.client.v2.model.RumRetentionQuotaWindowType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRetentionQuotasApi apiInstance = new RumRetentionQuotasApi(defaultClient);

    RumRetentionQuotaConfigUpdateRequest body =
        new RumRetentionQuotaConfigUpdateRequest()
            .data(
                new RumRetentionQuotaConfigUpdateData()
                    .attributes(
                        new RumRetentionQuotaConfigUpdateAttributes()
                            .custom(
                                new RumRetentionQuotaCustomConfig()
                                    .dailyResetTime("08:00")
                                    .dailyResetTimezone("+09:00")
                                    .quotaReachedAction(RumRetentionQuotaReachedAction.STOP)
                                    .sessionLimit(1000000L)
                                    .windowType(RumRetentionQuotaWindowType.DAILY))
                            .mode(RumRetentionQuotaMode.CUSTOM))
                    .id("cd73a516-a481-4af5-8352-9b577465c77b")
                    .type(RumRetentionQuotaConfigType.RUM_QUOTA_CONFIG));

    try {
      RumRetentionQuotaConfigResponse result =
          apiInstance.upsertRumQuotaConfig(
              RumRetentionQuotaScopeType.APPLICATION, "cd73a516-a481-4af5-8352-9b577465c77b", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionQuotasApi#upsertRumQuotaConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
