// Create or update usage quotas returns "OK. The response includes each item's result; see each
// item's `error` attribute
// for any that failed to write." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import com.datadog.api.client.v2.model.UsageQuotaCreateAttributes;
import com.datadog.api.client.v2.model.UsageQuotaCreateData;
import com.datadog.api.client.v2.model.UsageQuotaType;
import com.datadog.api.client.v2.model.UsageQuotasBulkResponse;
import com.datadog.api.client.v2.model.UsageQuotasCreateRequest;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createQuotas", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    UsageQuotasCreateRequest body =
        new UsageQuotasCreateRequest()
            .data(
                Collections.singletonList(
                    new UsageQuotaCreateData()
                        .attributes(
                            new UsageQuotaCreateAttributes()
                                .enforced(true)
                                .scope(Map.ofEntries(Map.entry("user_handle", "jane@example.com")))
                                .usageLimit(100000L))
                        .type(UsageQuotaType.QUOTAS)));

    try {
      UsageQuotasBulkResponse result = apiInstance.createQuotas("ai_credits", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#createQuotas");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
