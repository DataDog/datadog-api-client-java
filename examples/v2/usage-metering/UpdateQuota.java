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
    defaultClient.setUnstableOperationEnabled("v2.updateQuota", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    UsageQuotaUpdateRequest body =
        new UsageQuotaUpdateRequest()
            .data(
                new UsageQuotaUpdateData()
                    .attributes(
                        new UsageQuotaUpdateAttributes().enforced(false).usageLimit(120000L))
                    .id("MjAfYWlfY3JlZGl0c1911c2VyX2hhbmRsZTpfX0FMTF9f")
                    .type(UsageQuotaType.QUOTAS));

    try {
      UsageQuotaResponse result =
          apiInstance.updateQuota(
              "ai_credits", "MjAfYWlfY3JlZGl0c1911c2VyX2hhbmRsZTpfX0FMTF9f", body);
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
