// Count recoverable sessions accepts exactly 180 days

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
                    .type("rum_recovery_count")
                    .attributes(
                        new RumRecoveryCountAttributes()
                            .query("service:rum18600-fixture")
                            .from(1621077071000L)
                            .to(1636629071000L)));

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
