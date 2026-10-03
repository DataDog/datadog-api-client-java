// Update a usage quota returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import com.datadog.api.client.v2.model.UsageQuotaResponse;
import com.datadog.api.client.v2.model.UsageQuotaType;
import com.datadog.api.client.v2.model.UsageQuotaUpdateAttributes;
import com.datadog.api.client.v2.model.UsageQuotaUpdateData;
import com.datadog.api.client.v2.model.UsageQuotaUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateQuota", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    UsageQuotaUpdateRequest body =
        new UsageQuotaUpdateRequest()
            .data(
                new UsageQuotaUpdateData()
                    .attributes(
                        new UsageQuotaUpdateAttributes()
                            .enforced(false)
                            .pendingUsageLimit(50000L)
                            .usageLimit(120000L))
                    .id("MTIzNB9haV9jcmVkaXRzH3VzZXJfaGFuZGxlOl9fQUxMX18")
                    .type(UsageQuotaType.QUOTAS));

    try {
      UsageQuotaResponse result =
          apiInstance.updateQuota(
              "ai_credits", "MTIzNB9haV9jcmVkaXRzH3VzZXJfaGFuZGxlOl9fQUxMX18", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#updateQuota");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
