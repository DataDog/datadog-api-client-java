// Get an organization temporary grant request returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import com.datadog.api.client.v2.model.TemporaryGrantRequestResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.publicGetTemporaryGrantRequest", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    try {
      TemporaryGrantRequestResponse result =
          apiInstance.publicGetTemporaryGrantRequest(
              UUID.fromString("12345678-1234-1234-1234-123456789012"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#publicGetTemporaryGrantRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
