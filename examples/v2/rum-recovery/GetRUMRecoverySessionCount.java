// Estimate recoverable sessions returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRecoveryApi;
import com.datadog.api.client.v2.model.RumRecoveryCountAttributes;
import com.datadog.api.client.v2.model.RumRecoveryCountRequest;
import com.datadog.api.client.v2.model.RumRecoveryCountRequestData;
import com.datadog.api.client.v2.model.RumRecoveryCountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRecoveryApi apiInstance = new RumRecoveryApi(defaultClient);

    RumRecoveryCountRequest body =
        new RumRecoveryCountRequest()
            .data(
                new RumRecoveryCountRequestData()
                    .attributes(
                        new RumRecoveryCountAttributes()
                            .from(1789905600000L)
                            .query("service:web")
                            .to(1789992000000L))
                    .id("11111111-1111-4111-8111-111111111111")
                    .type("rum_recovery_count"));

    try {
      RumRecoveryCountResponse result = apiInstance.getRUMRecoverySessionCount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRecoveryApi#getRUMRecoverySessionCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
