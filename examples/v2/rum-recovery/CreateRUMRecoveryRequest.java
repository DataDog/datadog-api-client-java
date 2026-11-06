// Create a recovery request returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRecoveryApi;
import com.datadog.api.client.v2.model.RumRecoveryCreateAttributes;
import com.datadog.api.client.v2.model.RumRecoveryCreateData;
import com.datadog.api.client.v2.model.RumRecoveryCreateRequest;
import com.datadog.api.client.v2.model.RumRecoveryCreateResponse;
import com.datadog.api.client.v2.model.RumRecoverySessionInput;
import com.datadog.api.client.v2.model.RumRecoverySessionsCreateAttributes;
import com.datadog.api.client.v2.model.RumRecoverySessionsRequestType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRecoveryApi apiInstance = new RumRecoveryApi(defaultClient);

    RumRecoveryCreateRequest body =
        new RumRecoveryCreateRequest()
            .data(
                new RumRecoveryCreateData()
                    .attributes(
                        new RumRecoveryCreateAttributes(
                            new RumRecoverySessionsCreateAttributes()
                                .requestType(RumRecoverySessionsRequestType.SESSIONS)
                                .sessions(
                                    Collections.singletonList(
                                        new RumRecoverySessionInput()
                                            .applicationId(
                                                UUID.fromString(
                                                    "a33671aa-24fd-4dcd-ba4b-5bbdbafe7690"))
                                            .sessionId(
                                                UUID.fromString(
                                                    "00000000-0000-4000-8000-000000000001"))))))
                    .type("rum_recovery_request"));

    try {
      RumRecoveryCreateResponse result = apiInstance.createRUMRecoveryRequest(body);
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
