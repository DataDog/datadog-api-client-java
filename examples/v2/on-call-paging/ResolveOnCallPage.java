// Resolve On-Call Page returns "Accepted." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallPagingApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallPagingApi apiInstance = new OnCallPagingApi(defaultClient);

    try {
      apiInstance.resolveOnCallPage(UUID.fromString("15e74b8b-f865-48d0-bcc5-453323ed2c8f"));
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallPagingApi#resolveOnCallPage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
