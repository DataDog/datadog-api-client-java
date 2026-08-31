// Delete a usage quota returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteQuota", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      apiInstance.deleteQuota("ai_credits", "MjAfYWlfY3JlZGl0c1911c2VyX2hhbmRsZTpfX0FMTF9f");
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#deleteQuota");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
