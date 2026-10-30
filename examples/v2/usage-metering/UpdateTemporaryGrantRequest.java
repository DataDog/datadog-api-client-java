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
    defaultClient.setUnstableOperationEnabled("v2.updateTemporaryGrantRequest", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    // there is a valid "temporary_grant_request" in the system
    UUID TEMPORARY_GRANT_REQUEST_DATA_ID = null;
    try {
      TEMPORARY_GRANT_REQUEST_DATA_ID =
          UUID.fromString(System.getenv("TEMPORARY_GRANT_REQUEST_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    TemporaryGrantRequestDecisionRequest body =
        new TemporaryGrantRequestDecisionRequest()
            .data(
                new TemporaryGrantRequestDecisionData()
                    .attributes(
                        new TemporaryGrantRequestDecisionAttributes()
                            .decision(TemporaryGrantRequestDecision.DENIED))
                    .id(TEMPORARY_GRANT_REQUEST_DATA_ID)
                    .type(TemporaryGrantRequestType.TEMPORARY_GRANT_REQUESTS));

    try {
      TemporaryGrantRequestResponse result =
          apiInstance.updateTemporaryGrantRequest(TEMPORARY_GRANT_REQUEST_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#updateTemporaryGrantRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
