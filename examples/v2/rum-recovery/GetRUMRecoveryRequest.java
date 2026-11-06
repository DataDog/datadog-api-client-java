// Get recovery request progress returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRecoveryApi;
import com.datadog.api.client.v2.model.RumRecoveryRequestResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRecoveryApi apiInstance = new RumRecoveryApi(defaultClient);

    try {
      RumRecoveryRequestResponse result =
          apiInstance.getRUMRecoveryRequest(
              UUID.fromString("11111111-1111-4111-8111-111111111111"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRecoveryApi#getRUMRecoveryRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
