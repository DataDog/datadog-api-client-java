// Read an owned temporary grant request

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.UsageMeteringApi;
import com.datadog.api.client.v2.model.TemporaryGrantRequestResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.publicCreateTemporaryGrantRequest", true);
    defaultClient.setUnstableOperationEnabled("v2.publicGetMyTemporaryGrantRequest", true);
    UsageMeteringApi apiInstance = new UsageMeteringApi(defaultClient);

    // there is a valid "temporary_grant_request" in the system
    UUID TEMPORARY_GRANT_REQUEST_DATA_ID = null;
    try {
      TEMPORARY_GRANT_REQUEST_DATA_ID =
          UUID.fromString(System.getenv("TEMPORARY_GRANT_REQUEST_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      TemporaryGrantRequestResponse result =
          apiInstance.publicGetMyTemporaryGrantRequest(TEMPORARY_GRANT_REQUEST_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling UsageMeteringApi#publicGetMyTemporaryGrantRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
