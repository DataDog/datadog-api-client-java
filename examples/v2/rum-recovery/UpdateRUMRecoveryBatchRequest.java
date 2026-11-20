// Cancel a batch recovery request returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRecoveryApi;
import com.datadog.api.client.v2.model.RUMRecoveryCancelAttributes;
import com.datadog.api.client.v2.model.RUMRecoveryCancelData;
import com.datadog.api.client.v2.model.RUMRecoveryCancelRequest;
import com.datadog.api.client.v2.model.RUMRecoveryCancelResponse;
import com.datadog.api.client.v2.model.RUMRecoveryCancelStatus;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRecoveryApi apiInstance = new RumRecoveryApi(defaultClient);

    RUMRecoveryCancelRequest body =
        new RUMRecoveryCancelRequest()
            .data(
                new RUMRecoveryCancelData()
                    .attributes(
                        new RUMRecoveryCancelAttributes().status(RUMRecoveryCancelStatus.CANCELLED))
                    .id("11111111-1111-4111-8111-111111111111")
                    .type("rum_recovery_request"));

    try {
      RUMRecoveryCancelResponse result =
          apiInstance.updateRUMRecoveryBatchRequest(
              UUID.fromString("11111111-1111-4111-8111-111111111111"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRecoveryApi#updateRUMRecoveryBatchRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
