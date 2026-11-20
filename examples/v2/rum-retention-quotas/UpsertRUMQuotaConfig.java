// Create or update a RUM retention quota config returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionQuotasApi;
import com.datadog.api.client.v2.model.RUMRetentionQuotaConfigResponse;
import com.datadog.api.client.v2.model.RUMRetentionQuotaConfigType;
import com.datadog.api.client.v2.model.RUMRetentionQuotaConfigUpdateAttributes;
import com.datadog.api.client.v2.model.RUMRetentionQuotaConfigUpdateData;
import com.datadog.api.client.v2.model.RUMRetentionQuotaConfigUpdateRequest;
import com.datadog.api.client.v2.model.RUMRetentionQuotaCustomConfig;
import com.datadog.api.client.v2.model.RUMRetentionQuotaMode;
import com.datadog.api.client.v2.model.RUMRetentionQuotaReachedAction;
import com.datadog.api.client.v2.model.RUMRetentionQuotaScopeType;
import com.datadog.api.client.v2.model.RUMRetentionQuotaWindowType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumRetentionQuotasApi apiInstance = new RumRetentionQuotasApi(defaultClient);

    RUMRetentionQuotaConfigUpdateRequest body =
        new RUMRetentionQuotaConfigUpdateRequest()
            .data(
                new RUMRetentionQuotaConfigUpdateData()
                    .attributes(
                        new RUMRetentionQuotaConfigUpdateAttributes()
                            .custom(
                                new RUMRetentionQuotaCustomConfig()
                                    .dailyResetTime("08:00")
                                    .dailyResetTimezone("+09:00")
                                    .quotaReachedAction(RUMRetentionQuotaReachedAction.STOP)
                                    .sessionLimit(1000000L)
                                    .windowType(RUMRetentionQuotaWindowType.DAILY))
                            .mode(RUMRetentionQuotaMode.CUSTOM))
                    .id("cd73a516-a481-4af5-8352-9b577465c77b")
                    .type(RUMRetentionQuotaConfigType.RUM_QUOTA_CONFIG));

    try {
      RUMRetentionQuotaConfigResponse result =
          apiInstance.upsertRUMQuotaConfig(
              RUMRetentionQuotaScopeType.APPLICATION, "cd73a516-a481-4af5-8352-9b577465c77b", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionQuotasApi#upsertRUMQuotaConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
