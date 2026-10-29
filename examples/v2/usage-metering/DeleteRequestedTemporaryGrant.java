// Revoke a requested temporary grant returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteRequestedTemporaryGrant", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      apiInstance.deleteRequestedTemporaryGrant(
          UUID.fromString("12345678-1234-1234-1234-123456789012"));
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#deleteRequestedTemporaryGrant");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
