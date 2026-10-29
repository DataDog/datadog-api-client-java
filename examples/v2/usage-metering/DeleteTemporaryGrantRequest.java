// Cancel your temporary grant request returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteTemporaryGrantRequest", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      apiInstance.deleteTemporaryGrantRequest(
          UUID.fromString("12345678-1234-1234-1234-123456789012"));
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#deleteTemporaryGrantRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
