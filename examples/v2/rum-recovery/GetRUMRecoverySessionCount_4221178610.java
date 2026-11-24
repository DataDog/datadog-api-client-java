// Count recoverable sessions accepts exactly 180 days

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRecoveryApi;
import com.datadog.api.client.v2.model.RUMRecoveryCountAttributes;
import com.datadog.api.client.v2.model.RUMRecoveryCountRequest;
import com.datadog.api.client.v2.model.RUMRecoveryCountRequestData;
import com.datadog.api.client.v2.model.RUMRecoveryCountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRecoveryApi apiInstance = new RumRecoveryApi(defaultClient);

    RUMRecoveryCountRequest body =
        new RUMRecoveryCountRequest()
            .data(
                new RUMRecoveryCountRequestData()
                    .type("rum_recovery_count")
                    .attributes(
                        new RUMRecoveryCountAttributes()
                            .query("service:rum18600-fixture")
                            .from(1621077071000L)
                            .to(1636629071000L)));

    try {
      RUMRecoveryCountResponse result = apiInstance.getRUMRecoverySessionCount(body);
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
