// Get a usage quota returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import com.datadog.api.client.v2.model.UsageQuotaResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getQuota", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      UsageQuotaResponse result =
          apiInstance.getQuota("ai_credits", "MTIzNB9haV9jcmVkaXRzH3VzZXJfaGFuZGxlOl9fQUxMX18");
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
