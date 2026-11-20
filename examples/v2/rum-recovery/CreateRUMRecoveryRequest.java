// Create a recovery request returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRecoveryApi;
import com.datadog.api.client.v2.model.RUMRecoveryCreateAttributes;
import com.datadog.api.client.v2.model.RUMRecoveryCreateData;
import com.datadog.api.client.v2.model.RUMRecoveryCreateRequest;
import com.datadog.api.client.v2.model.RUMRecoveryCreateResponse;
import com.datadog.api.client.v2.model.RUMRecoverySessionInput;
import com.datadog.api.client.v2.model.RUMRecoverySessionsCreateAttributes;
import com.datadog.api.client.v2.model.RUMRecoverySessionsRequestType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRecoveryApi apiInstance = new RumRecoveryApi(defaultClient);

    RUMRecoveryCreateRequest body =
        new RUMRecoveryCreateRequest()
            .data(
                new RUMRecoveryCreateData()
                    .attributes(
                        new RUMRecoveryCreateAttributes(
                            new RUMRecoverySessionsCreateAttributes()
                                .requestType(RUMRecoverySessionsRequestType.SESSIONS)
                                .sessions(
                                    Collections.singletonList(
                                        new RUMRecoverySessionInput()
                                            .applicationId(
                                                UUID.fromString(
                                                    "a33671aa-24fd-4dcd-ba4b-5bbdbafe7690"))
                                            .sessionId(
                                                UUID.fromString(
                                                    "00000000-0000-4000-8000-000000000001"))))))
                    .type("rum_recovery_request"));

    try {
      RUMRecoveryCreateResponse result = apiInstance.createRUMRecoveryRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRecoveryApi#createRUMRecoveryRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
