// Decide a temporary grant request returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import com.datadog.api.client.v2.model.TemporaryGrantRequestDecision;
import com.datadog.api.client.v2.model.TemporaryGrantRequestDecisionAttributes;
import com.datadog.api.client.v2.model.TemporaryGrantRequestDecisionData;
import com.datadog.api.client.v2.model.TemporaryGrantRequestDecisionRequest;
import com.datadog.api.client.v2.model.TemporaryGrantRequestResponse;
import com.datadog.api.client.v2.model.TemporaryGrantRequestType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.publicDecideTemporaryGrantRequest", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    TemporaryGrantRequestDecisionRequest body =
        new TemporaryGrantRequestDecisionRequest()
            .data(
                new TemporaryGrantRequestDecisionData()
                    .attributes(
                        new TemporaryGrantRequestDecisionAttributes()
                            .decision(TemporaryGrantRequestDecision.APPROVED))
                    .id(UUID.fromString("12345678-1234-1234-1234-123456789012"))
                    .type(TemporaryGrantRequestType.TEMPORARY_GRANT_REQUESTS));

    try {
      TemporaryGrantRequestResponse result =
          apiInstance.publicDecideTemporaryGrantRequest(
              UUID.fromString("12345678-1234-1234-1234-123456789012"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling UsageMeteringApi#publicDecideTemporaryGrantRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
