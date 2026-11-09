// Get a usage quota returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import com.datadog.api.client.v2.api.UsageMeteringApi.GetQuotaOptionalParameters;
import com.datadog.api.client.v2.model.UsageQuotaResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createQuotas", true);
    defaultClient.setUnstableOperationEnabled("v2.deleteQuota", true);
    defaultClient.setUnstableOperationEnabled("v2.getQuota", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    // there is a valid "quota" in the system
    String QUOTA_DATA_0_ID = System.getenv("QUOTA_DATA_0_ID");

    try {
      UsageQuotaResponse result =
          apiInstance.getQuota(
              "ai_credits",
              QUOTA_DATA_0_ID,
              new GetQuotaOptionalParameters().includeDescendants(false));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getQuota");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
